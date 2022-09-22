package Combinar_Arrays;

public class EjemploArraysCombinadosDeDosEnDos {

	public static void main(String[] args) {
		//combinaremos 2 arrays en 1 array de dos valores en dos valores
		//Tiene que ser multiplo, 20 es multiplo de 10
		
		int[] a,b,c;
		a=new int[10];
		b=new int[10];
		c=new int[20];
		
		//empezamos con el a
		
		for (int i = 0; i < a.length; i++) {
			a[i]=i+1;//0+1, para que el valor comience con el id=0 valor=1, hasta id=9 valor=10
		}
		
		for (int i = 0; i < b.length; i++) {
			b[i]=(i+1)*5;//0+1*5, para que el valor comience con el id=0 valor=5, de 5 en 5,  hasta id=9 valor=50
		}
		
		
		int auxiliar=0;
		for (int i = 0; i < c.length/2; i+=2) {	//en la iteracion ponemos i+=2, por lo que 'i' irá de dos en dos e iterará 5 veces para llegar a 10
			
			for(int j=0;j<2;j++) {	//aqui haremos que imprima 2 de a
				c[auxiliar++]=a[i+j];
				}
			for(int j=0;j<2;j++) {// y aqui haremos que imprima 2 de b
				c[auxiliar++]=b[i+j];
				}
		}
		
		
		
		
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		
	}

	}
}
