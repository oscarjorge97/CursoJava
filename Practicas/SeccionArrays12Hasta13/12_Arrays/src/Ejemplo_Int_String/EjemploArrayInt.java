package Ejemplo_Int_String;

public class EjemploArrayInt {
	
	public static void main(String[] args) {
		//indicamos que estará compuesto de 4 elementos
		int [] numeros= new int[4];
		
		numeros[0]=10;
		numeros[1]=Integer.valueOf("7");
		numeros[2]=35;
		numeros[3]=-1;
		
		//indicamos en que indice está cada int
		int i= numeros [0];
		int j= numeros [1];
		int k= numeros [2];
		int l= numeros [3];
		l=numeros[numeros.length-1];	//es otra forma de hallar el ultimo numero del array si es muy largo
		
		System.out.println("i= "+i);
		System.out.println("j= "+j);
		System.out.println("k= "+k);
		System.out.println("l= "+l);
		
	}
}
