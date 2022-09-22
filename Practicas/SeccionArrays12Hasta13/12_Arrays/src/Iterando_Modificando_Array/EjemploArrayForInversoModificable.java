package Iterando_Modificando_Array;

import java.util.Arrays;

public class EjemploArrayForInversoModificable {

	public static void main(String[] args) {
		
		String []productos= {"Kingston Pendrive 64GB","Samsung Galaxy","Disco Duro SSD Samsung Externo"
				,"Asus Notebook","Macbook Air","Chromecast 4ta generación","Bicicleta Oxford"};
		
		//Mas optimizado es:
		int total=productos.length;
		
		//Siempre hay que ordenar antes de iterar
		Arrays.sort(productos);
		
		for(int i=0;i<total;i++) {//usandor for
			
			System.out.println("para indice "+i+": "+productos[i]);
		}
		System.out.println("___________________");
		
		//modificando los datos
		for(int i=0;i<(total/2);i++) {
			String actual=productos[i];
			String inverso=productos[total-1-i];
			
			productos[i]=inverso;
			productos[total-1-i]=actual;
		}
		
		for(int i=0;i<total;i++) {//usandor for
			
			System.out.println("para indice "+i+": "+productos[i]);
		}
		
		
	}
}
