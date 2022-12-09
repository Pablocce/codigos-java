
public class main {
	public static void main(String[] args) {
		
		String[] corredores = { "Pablo", "Armando", "Marcuelo"};
		
		for (int i = 0; i< corredores.length; i++) {
			new Thread(new corredor(corredores[i])).start();
		}
		
	}
}
