/*
 * LA SINCRONIZACION en hilos, se necesita cuando dos o  mas hilos
 * compareten un mismo recurso (objeto, variable, vector, coleccion
 * documento, etc.)
 * 	
 */

class WhatsApp{
	
	//SEGUNDA FORMA: SINCRONIZAR LAS ACCIONES DEL RECURSO (OBJETO) COMPARTIDO
	public synchronized void enviarMensaje(String msj) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Enviando mensaje..." + msj);
	}
}

class HiloEmisor implements Runnable{
	String msj;
	WhatsApp w;
	
	public HiloEmisor(String msj, WhatsApp emisor) {
		this.msj = msj;
		this.w = emisor;
	}

	@Override
	public void run() {
		w.enviarMensaje(msj);
		
	}
}

class HiloReceptor implements Runnable{
	String msj;
	WhatsApp w;
	
	public HiloReceptor(String msj, WhatsApp emisor) {
		this.msj = msj;
		this.w = emisor;
	}

	@Override
	public void run() {
		
		//PRIMER FORMA DE SINCRONIZACION ES A TRAVES DEL OBJETO COMPARTIDO	
		//synchronized (w) {
		//	w.enviarMensaje(msj);
		//}
		w.enviarMensaje(msj);
		
	}
}


public class PruebaSincronizacionHilos {

	public static void main(String[] args) {
		WhatsApp wats = new WhatsApp();
		
		
		Thread hiloE = new Thread(new HiloEmisor("1-Hola", wats));
		hiloE.start();
		
		Thread hiloR = new Thread(new HiloReceptor("2-Hola que tal", wats));
		hiloR.start();

	}

}






