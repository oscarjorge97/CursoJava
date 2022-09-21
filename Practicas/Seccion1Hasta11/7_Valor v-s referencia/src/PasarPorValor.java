
public class PasarPorValor {

	public static void main(String[] args) {
		
		int i=10;
		System.out.println("iniciamos el método main con i= "+i);
	
		test(i);
		//Ya que estamos con clases y metodos wrapper, es decir string int/integer etc, no se modifica el siguiente i porque son inmutables
		//pero ya cuando creemos nuestras propias clases esas si son mutables
		System.out.println("Finaliza el método main con el valor de i= "+i);
		
	}
	
	
	//static: metodo estatico que se puede invocar sin necesidad de crear un objeto, usando nombre de clase o de forma directa.
	public static void test (int j) {
		System.out.println("Iniciamos el método test con i= "+j);
		j=35;
		System.out.println("Finaliza el método test con i= "+j);
	}
}
