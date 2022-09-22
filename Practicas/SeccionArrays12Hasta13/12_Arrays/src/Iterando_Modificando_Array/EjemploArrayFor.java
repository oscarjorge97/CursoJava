package Iterando_Modificando_Array;

import java.util.Arrays;

public class EjemploArrayFor {

	public static void main(String[] args) {
		
		String [] productos= new String[7];
		
		//Mas optimizado es:		
		int productosLength=productos.length;
		
		productos[0]="Kingston Pendrive 64GB";
		productos[1]="Samsung Galaxu";
		productos[2]="Disco Duro SSD Samsung Externo";
		productos[3]="Asus Notebook";
		productos[4]="Macbook Air";
		productos[5]="Chromecast 4ta generación";
		productos[6]="Bicicleta Oxford";
		
		//Siempre hay que ordenar antes de iterar
		Arrays.sort(productos);
		
		for(int i=0;i<productosLength;i++) {//usandor for
			
			System.out.println("para indice "+i+": "+productos[i]);
		}
		System.out.println("___________________");

		for(String prod:productos) {//usando for-each
			System.out.println("producto= "+prod);
		}

		
		int [] numeros=new int[10];
		
	}
}
