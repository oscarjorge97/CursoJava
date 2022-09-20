package Flujos_For;

public class SentenciaForEach {
	
	public static void main(String[] args) {
		//Se suele utilizar para Arrays u objetos de coleccion de Java
		int [] numImpares= {1,3,5,7,9,11,15};
		
		//primero se pone el tipo de dato (int) // y lo leemos: Por cada elemento del array obtenemos este elemento
		for(int num: numImpares ) {
			System.out.println("num= "+num);
		}
		
		String[] nombres= {"Andres","Pepe","María","Paco","Lalo","Bea","Pato","Pepa"};
		
		for(String name: nombres) {
			System.out.println("name= "+name);
		}
	}
}
