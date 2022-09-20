package Bucles_General;

public class BuclesEtiquetasBuscar {

	public static void main(String[] args) {
		String frase="trigo tres tristes tigres tragantri go trigo en un trigal";
		int cantidad=0;
		String palabra="trigo";
		char letra='r';
		
		buscar:
		for (int i=0;i<frase.length();i++) {
			
			int k=i; //necesitamos otra variable distinta a 'i' para poder empezar a recorrer la palabra en la frase de forma independiente sin interrumpir, asi que le damos el valor de 'i' a la 'k'
			
			for (int j=0;j<palabra.length();j++) {
				
				if (frase.charAt(k++)!=palabra.charAt(j)) {
					continue buscar;
				}
			}
			
			cantidad++; //aquí al saltarse los que no son iguales, contará cada vez que encuentre 't'
		}
		System.out.println("Encontrado "+cantidad+" veces la palabra "+palabra+" en la frase");

	}

}
