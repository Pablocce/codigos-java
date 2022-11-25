package Ejemplo1;
import java.util.ArrayList;
import java.util.Iterator;
public class Main {

	
	public static void main(String[] args) {
		
		
		ArrayList l = new ArrayList();
		
		
		l.add("uno");
		l.add("dos");
		l.add("tres");
		l.add("cuatro");
		
		
		l.add(2,"dos2");
		
		System.out.println(l.size());
		System.out.println(l.get(0));
		System.out.println(l.get(1));
		System.out.println(l.get(2));
		System.out.println(l.get(3));
		System.out.println(l.get(4));
		
		for (int i=0; i<l.size();i++) {
			System.out.println(l.get(i).toString());
		}
		
		System.out.print("\n");
		
		
		Iterator it = l.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next().toString());
		}
	}

}
