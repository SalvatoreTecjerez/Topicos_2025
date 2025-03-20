
/*
 * Se puede coordinar a los hilos a traves de algunos metodos, como lo son:
 * 
 * 
 * 		YIELD (bifurcacion o desviacion)
 * 			Permite que un hilo que ejecuta un proceso con una tarea larga
 * 			pero no tan relevante, ceda el tiempo de procesador a otro
 * 			hilo con una tarea mas importante y mas corta de tiempo
 * 
 * 		JOIN
 * 			Pausa la ejecucion de un hilo, hasta que otro termine su propia
 * 			tarea 
 * 
 * 			Se invoca dentro del hilo que se desea pausar
 * 
 * 		SLEEP
 * 			Se utilizar para "dormir" hilo un determinado tiempo en 
 * 			milisegundos
 * 			
 * 
 */

class Whatsapp implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Revisando chats.....");
			System.out.println("Revisando chats.....");
			System.out.println("Respondiendo chats.....");
			System.out.println("Revisando chats.....");
			System.out.println("Enviando MEMAZO.....");
			System.out.println("Revisando UTLIMA CONEXION  .... ='(   ");
		}
	}
	
}
class Programacion implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println("Comenzando proyectro FINAL !!!");
			System.out.println("Analizando que esta FACILISIMO.....");
			System.out.println(" ='(    NO CIERTO !!!!!    ");
			System.out.println("Programando.......");
			System.out.println("Programando.......");
			System.out.println("Programando.......");
		}
	}
	
}

public class PruebaCoordinacionHilos {
	public static void main(String[] args) {
		System.out.println("Encendiendo laptop........................");

		Thread hiloProyecto = new Thread(new Programacion());
		Thread hiloWhatsApp = new Thread(new Whatsapp());
		
		//hiloProyecto.start();
		
		hiloWhatsApp.start();

		try {
			Thread.sleep(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			hiloWhatsApp.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("APAGANDO laptop........................!!!!!");
	}
}


