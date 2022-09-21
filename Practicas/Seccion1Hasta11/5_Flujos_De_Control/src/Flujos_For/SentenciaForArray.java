package Flujos_For;

import java.util.Scanner;

public class SentenciaForArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		String[] nombres= {"Andres","Pepe","María","Paco","Lalo","Bea","Pato","Pepa"};
		
		for (int i=0; i<nombres.length;i++) {
			//Para saltarnos nombres combinando con continue
			if(nombres[i].equalsIgnoreCase("Andres") || nombres[i].equalsIgnoreCase("pepa")) {
				continue;
			}
			System.out.println(i+": "+nombres[i]);
		}
		
		
		System.out.println("Ingrese un nombre, ejemplo 'pepe o 'maria'");
		String buscar=sc.nextLine();
		boolean encontrado=false;
		for (int i=0; i<nombres.length;i++) {
			if(nombres[i].equalsIgnoreCase(buscar)){
				encontrado=true;
				break;
			}
			System.out.println("nombres= "+nombres[i]);
		}
		if(encontrado==true) {
			System.out.println("fue encontrado!");
		}else {
			System.out.println("No existe en el sistema");
		}
	}

}
