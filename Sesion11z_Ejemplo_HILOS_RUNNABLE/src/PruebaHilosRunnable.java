

//PASO 1: Crear una clase que imolemente la INTERFAZ RUNNABLE

class HiloProceso1 implements Runnable{

	@Override
	public void run() {
		System.out.println("INICIO - Hilo 1");
		
		//A traves de este ciclo se SIMULA el trabajo de este proceso dentro del hilo
		for (int i=1; i<=50; i++) {
			System.out.println("Hilo 1 trabajando...");
		}
		
		System.out.println("FIN - Hilo 1");
	}
	
}

public class PruebaHilosRunnable {
	public static void main(String[] args) {
		System.out.println("INICIO - Hilo MAIN");
		
		//PASO 2: Crear una instancia de la clase THREAD, pasandole como argumento
		//una instancia de la clase que implementa RUNNABLE
		
		HiloProceso1 h1 = new HiloProceso1();
		Thread hilo1 = new Thread(h1);
		hilo1.setPriority(5);
		
		
		//PASO 3: Iniciar la ejecucion del HILO a traves del metodo START !!!!!!
		hilo1.start();
		
		for (int i=1; i<=50; i++) {
			System.out.println("Hilo MAIN trabajando...");
		}
		
		System.out.println("FIN - Hilo MAIN");
	}
}
