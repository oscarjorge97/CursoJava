package Flujos_For;

public class SentenciaFor {

	public static void main(String[] args) {
		
		for (int i = 0; i <=10 ; i++) {
			System.out.println("i= "+(i));
		}
		System.out.println("____________");
		
		for (int j = 10; j >=0; j--) {
			System.out.println("i= "+j);
		}
		System.out.println("____________");
		
		for (int i=1,j=10; i<j; i++,j--) {
			System.out.println(i+ "-" +j);
		}
		System.out.println("____________");
		//para numeros impares
		/*for (int i = 1; i <=10 ; i=i+2) {
			System.out.println("i= "+(i));
		}*/
		
		for (int i = 0; i <=10 ; i++) {
			if(i%2==0) {
				continue;//continue en vez de salirse del for, se sale de la iteracion y continua con la siguiente iteracion
			}
			System.out.println("i= "+(i));
		}
	}

}
