package recursividad1;

public class Recursividad {
	
	void repetir() {
		repetir();
	}

	public static void main(String[] args) {
		Recursividad re = new Recursividad();
		re.repetir();

	}

}
