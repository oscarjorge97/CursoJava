package Combinar_Arrays;

public class EjemploArraysCombinados {

	public static void main(String[] args) {
		//combinaremos 2 arrays
		
		int[] a,b,c;
		a=new int[10];
		b=new int[10];
		c=new int[20];
		
		//empezamos con el a
		
		for (int i = 0; i < a.length; i++) {
			a[i]=i+1;//0+1, para que el array comience con el id=0 valor=1, hasta id=9 valor=10
		}
		
		for (int i = 0; i < b.length; i++) {
			b[i]=(i+1)*5;//0+1*5, para que el array comience con el id=0 valor=5, de 5 en 5,  hasta id=9 valor=50
		}
		
		//planeamos tener un array con los valores mezclado, que quede así: 1,5,2,10,3,15,4,20,5,25....
		//solo iteraremos hasta 10 aunque 'c' ocupe 20, ya que en cada iteracion agregaremos dos elementos, es lo mismo que i<c.length/2
		int auxiliar=0;
		for (int i = 0; i < c.length/2; i++) {
			c[auxiliar++]=a[i];
			c[auxiliar++]=b[i];
			
		}
		
		
		
		
		for (int i = 0; i < c.length; i++) {
			System.out.print(c[i]+" ");
		
	}

	}
}
