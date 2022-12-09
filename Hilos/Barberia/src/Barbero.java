
public class Barbero extends Thread {
	BarberoDurmiente barbero;
	int num;
	
	public Barbero(BarberoDurmiente barbero) {
		this.barbero = barbero;
	}
	
	public void run() {
		while(true) {
			try {
				barbero.esperarCliente();
				Thread.sleep(5000);
				barbero.acabarCortePelo();
				Thread.sleep(5000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	

}
