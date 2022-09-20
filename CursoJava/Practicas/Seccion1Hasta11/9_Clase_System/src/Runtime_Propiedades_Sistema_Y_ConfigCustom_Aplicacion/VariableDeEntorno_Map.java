package Runtime_Propiedades_Sistema_Y_ConfigCustom_Aplicacion;

import java.util.Map;

public class VariableDeEntorno_Map {

	public static void main(String[] args) {

		//El metodo getEnvironment de la clase System va a retornar un objeto de tipo Map (un mapa de java con todas las variables de entorno
		//Un mapa de java es como un array asociativo, es decir, que asocia valores que están guardado con un nombre, guardamos elementos, objetos de cualquier tipo y podemos asignarlos un nombre
		//Es como un diccionario, un nombre con su valor
		//Entre MayorMenor indicamos los tipos de datos del nombre y del valor
		Map<String, String> varEnv=System.getenv();
		System.out.println("Variable de entorno del sistema= "+varEnv);
		
		//para obtener una en particular
		String username=System.getenv("USERNAME");
		System.out.println("USERNAME= "+username);
		
		String javaHome=System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME= "+javaHome);
		
		String temDir=System.getenv("TEMP");
		System.out.println("TEMP= "+temDir);
		
		String path=System.getenv("Path");
		System.out.println("Path= "+path);
		
		String path2=varEnv.get("Path");
		System.out.println("Path2= "+path2);
		
		//ITERAR EL MAP
		//Metodo keySet retorna un conjunto/set con los nombres de llaves
		for(String llave:varEnv.keySet()) {
			System.out.println(llave+"=>"+varEnv.get(llave));	//por cada nombre de llave retornamos el valor	nombreLLave=> informacion de la llave
		}
	}

}
