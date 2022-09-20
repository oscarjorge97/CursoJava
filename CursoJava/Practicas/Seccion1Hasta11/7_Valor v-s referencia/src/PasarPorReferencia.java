
public class PasarPorReferencia {

	public static void main(String[] args) {
		int [] edad= {10,11,12};
		System.out.println("iniciamos el método main");
	
		for (int i=0;i<edad.length;i++) {
			System.out.println("edad[i]: "+edad[i]);
		}
		
		System.out.println("Antes de llamar al metodo test");
		
		test(edad);
		
		System.out.println("Después de llamar al metodo test");
		
		for (int i=0;i<edad.length;i++) {
			System.out.println("edad[i]: "+edad[i]);
		}
		
		System.out.println("Finaliza el método main con los datos del array modificado! ");
		
	}
	
	
	//static: metodo estatico que se puede invocar sin necesidad de crear un objeto, usando nombre de clase o de forma directa.
	public static void test (int edadArreglo[]) {
		System.out.println("Iniciamos el método test:");
		
		for(int i=0;i<edadArreglo.length;i++) {
			edadArreglo[i]+=20;
		}
		
		System.out.println("Finaliza el método test: ");
	
	}

}
