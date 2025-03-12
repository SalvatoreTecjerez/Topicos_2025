
public class PruebaHIlos {

	public static void main(String[] args) {
		
		System.out.println("MAIN - Hilo principal de ejecucion");
		
		System.out.println(Thread.currentThread());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		System.out.println(Thread.currentThread().getStackTrace());
		
		System.out.println(Thread.currentThread().getState());
		
		System.out.println(Thread.currentThread().isAlive());
		
		System.out.println(Thread.currentThread().isDaemon());
		
		System.out.println(Thread.currentThread().isInterrupted());
		

	}

}
