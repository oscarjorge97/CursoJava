package Ejemplo_Int_String;

import java.util.Arrays;

public class EjemploArrayString {
	
	public static void main(String[] args) {
		
		
		String [] productos= new String[7];
		
		productos[0]="Kingston Pendrive 64GB";
		productos[1]="Samsung Galaxu";
		productos[2]="Disco Duro SSD Samsung Externo";
		productos[3]="Asus Notebook";
		productos[4]="Macbook Air";
		productos[5]="Chromecast 4ta generación";
		productos[6]="Bicicleta Oxford";
		
		Arrays.sort(productos); 	//Con esto lo ordenadoremos de la A-Z o 1-100(por ejemplo), sirve con String y con int
		
		System.out.println("productos[0]= "+productos[0]);
		System.out.println("productos[1]= "+productos[1]);
		System.out.println("productos[2]= "+productos[2]);
		System.out.println("productos[3]= "+productos[3]);
		System.out.println("productos[4]= "+productos[4]);
		System.out.println("productos[5]= "+productos[5]);
		System.out.println("productos[6]= "+productos[6]);
		
		
		
		
	}
}
