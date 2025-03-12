class HiloProcesadores implements Runnable{
	@Override
	public void run() {
		
		for (int i = 0; i < 20; i++) {
			System.out.println("Hilo "+ Thread.currentThread().getName()+" trabajando...");
		}
	}
}
public class PruebaHIlosProcesador {
	public static void main(String[] args) {
	
		System.out.println( Runtime.getRuntime().availableProcessors() );

		System.out.println( Runtime.getRuntime().freeMemory()/1024/1024 + " MB" );
		System.out.println( Runtime.getRuntime().totalMemory()/1024/1024 + " MB" );
		System.out.println( Runtime.getRuntime().maxMemory()/1024/1024/1024 + " GB" );
		
		//CREAR tantos hilos como nucleos tenga disponible su COMPUTADORA
		for (int i = 0; i < Runtime.getRuntime().availableProcessors(); i++) {
			Thread hilo = new Thread(new HiloProcesadores());
			hilo.start();
		}
	}
}
