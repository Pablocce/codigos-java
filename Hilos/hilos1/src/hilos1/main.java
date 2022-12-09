package hilos1;

public class main {

	public static void main(String[] args) {
		for (int i = 0; i<10; i++) {
			Saludo saludo = new Saludo(i+1);
			saludo.start();
			
		}
		System.out.println("FINAL DE LA EJECUCIÓN");
	}

}
