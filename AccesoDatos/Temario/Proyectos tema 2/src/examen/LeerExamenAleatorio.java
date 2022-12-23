package examen;

import java.io.*;

public class LeerExamenAleatorio {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f = new File("AleatorioExamen_Pablo_Calvo_Espinar.txt");
		RandomAccessFile raf = new RandomAccessFile("AleatorioExamen.dat", "r");
		BufferedWriter bfw = new BufferedWriter(new FileWriter(f));
		System.out.println("si");
		
		try {
			System.out.println("si");
			int  posicion, campo2;
			int contador = 0;
			
			char campo1[] = new char[4];
			
			char campo3[] = new char[60];
			
			posicion = 0;
			int aux;
			for(;;) {
				raf.seek(posicion);
				
				
				for (int i = 0; i<campo1.length;i++) {
					aux = raf.readChar();
					campo1[i] =  (char) aux;
				}
				String campos1 = new String(campo1);
				
				campo2 = raf.readInt();
				
				for(int i = 0; i< campo3.length; i++) {
					aux = raf.readChar();
					campo3[i] = (char) aux;
				}
				
				String campos3 = new String(campo3);
				
				
				
				 String linea = String.format("%4s%10d%60s", campos1.trim(), campo2, campos3.trim());
				 bfw.write(linea);
				 bfw.newLine();
				 posicion = posicion + 132;
				 if (raf.getFilePointer() == raf.length()) break;
				 contador += 1;
			}
			
			 System.out.println("Creado");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			raf.close();
			bfw.close();
		}
		
		
	}

}
