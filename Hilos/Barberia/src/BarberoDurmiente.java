
public class BarberoDurmiente {

	private int nSillasEspera;
	private int nSillasEsperaOcupadas = 0;
	private boolean sillaBarberoOcupada = false;
	private boolean finCorte = false;
	private boolean barberoDormido= false;
	
	public BarberoDurmiente(int nSillasEspera) {
		this.nSillasEspera = nSillasEspera;
	}
	public synchronized boolean entrar(int clienteId) throws InterruptedException {
		if(nSillasEsperaOcupadas == nSillasEspera) {
		System.out.println("****** El cliente " + clienteId + " intenta entrar pero no hay sitio*******");
		return false;
	} else {
		nSillasEsperaOcupadas ++;
		System.out.println("***** El cliente "+ clienteId + " se sienta en una silla de la sala de espera");
		while(sillaBarberoOcupada) {
			wait();
		}
		
		nSillasEsperaOcupadas --;
		sillaBarberoOcupada = true;
		finCorte = false;
		
		
		if (barberoDormido) {
			System.out.println("***** El cliente " + clienteId + " despierta al barbero");
			notifyAll();
		}
		
		System.out.println("***** El cliente " +clienteId + " en la silla de barbero*****");
		
		
		while (!finCorte) {wait();}
		
		sillaBarberoOcupada = false;
		
		notifyAll();
		System.out.println("***** El cliente " + clienteId + "se va con el pelo cortado ******");
		return true;
		}
	}
	public synchronized void esperarCliente() throws InterruptedException{
		barberoDormido = true;
		while(!sillaBarberoOcupada) {
			System.out.println(" Barbero se duerme esperando clientes zzzzzzzzzzzzzz");
			wait();
		}
		barberoDormido = false;
		System.out.println(" Barbero cortando el pelo de locos");
		// TODO Auto-generated method stub
		
	}

	

}
