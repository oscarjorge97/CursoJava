package Ordenar_Reutilizar_Algoritmo_Burbuja;

public class EjemploArraysOrdenPrincipioFinal {

	public static void main(String[] args) {
		//ESTE EJEMPLO ME SIRVE PARA EL EJERCICIO DE CODEWARS
		int[] numeros=new int [10];
		int numerosLength=numeros.length;
		
		for (int i = 0; i < numerosLength; i++) {

			numeros[i]=i;	//vamos agregando valores al array numeros
		}
		System.out.println("TODOS LOS NUMEROS:");
		for (int i=0;i<numerosLength;i++) {
			System.out.println(numeros[i]+1);//'+1' para que empiece desde 1
			
			System.out.println(numeros[numeros.length-1-i]+1);	//se indica el -1 porque los cuenta a partir de 1, pero el array es a partir de 0, entonces quedaría bien, y luego le restamos el 'i' que se va incrementando
			
			
		}
		System.out.println("_____________");
		System.out.println("SIN QUE SE REPITAN:");
		//dividiendolo entre dos hacemos que no se repitan
		for (int i=0;i<numerosLength/2;i++) {
			System.out.println(numeros[i]+1);//'+1' para que empiece desde 1
			
			System.out.println(numeros[numeros.length-1-i]+1);	//se indica el -1 porque los cuenta a partir de 1, pero el array es a partir de 0, entonces quedaría bien, y luego le restamos el 'i' que se va incrementando
			
		}
		//ahora lo que haremos será guardar estos ultimos datos en un array nuevo
		System.out.println("_____________");
		System.out.println("GUARDANDO EN NUEVO ARRAY:");
		int[] newNumeros=new int[10];
		
		
		int auxiliar=0;
		for (int i = 0; i < numeros.length/2; i++) { //es lo mismo que: for (int i = 0; i < numeros.length-i; i++)
			newNumeros[auxiliar++]=numeros[i]+1;
			newNumeros[auxiliar++]=numeros[numeros.length-1-i]+1;
			
		}
		
		for (int i = 0; i < newNumeros.length; i++) {
			System.out.println(newNumeros[i]);
		}
		

	}

}
