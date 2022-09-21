
class Persona{
	//private: solo se puede modificar, leer dentro de la propia clase
	private String nombre;
	
	//De esta forma podremos leer y modificar el valor de nombre de la clase Persona
	public void establecerNombre(String nombre){
		this.nombre=nombre;
	}
	public String obtenerNombre() {
		return this.nombre;
	}
}


public class PasarPorReferencia2 {
	
	public static void main(String[] args) {
		
		//creamos una instancia/objeto de la clase persona
		Persona persona=new Persona();
		persona.establecerNombre("Andres");
		
		System.out.println("iniciamos el método main");
		
		System.out.println("persona= "+persona.obtenerNombre());
		
		System.out.println("Antes de llamar al metodo test");
		
		test(persona);
		
		System.out.println("Después de llamar al metodo test");
		
		System.out.println("persona.nombre= "+persona.obtenerNombre());
		
		System.out.println("Finaliza el método main con los datos del array modificado! ");
		
	}
	
	
	//static: metodo estatico que se puede invocar sin necesidad de crear un objeto, usando nombre de clase o de forma directa.
	
	//Pasamos en este caso la clase
	public static void test (Persona persona) {
		System.out.println("Iniciamos el método test:");
		
		persona.establecerNombre("Pepe");
		
		System.out.println("Finaliza el método test: ");
	
	}
}


