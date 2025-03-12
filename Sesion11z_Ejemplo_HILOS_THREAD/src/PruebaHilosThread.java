

class Tesis extends Thread{
	
	public void run() {
		System.out.println("INICIO - Hilo Tesis");
		
		for (int i=1; i<=50; i++) {
			System.out.println("Hilo Tesis trabajando...");
		}
		
		System.out.println("FIN - Hilo Tesis");
	}
	
}

class Spotify extends Thread{
}

class WhatsApp extends Thread{
}


public class PruebaHilosThread {
	public static void main(String[] args) {
		System.out.println("INICIO - Hilo MAIN");
		
		Tesis t1 = new Tesis();
		t1.start();
		
		for (int i=1; i<=50; i++) {
			System.out.println("Hilo MAIN trabajando...");
		}
		
		System.out.println("FIN - Hilo MAIN");
	}
}
