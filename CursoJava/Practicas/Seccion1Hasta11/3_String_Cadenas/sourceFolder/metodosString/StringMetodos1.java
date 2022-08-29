 package metodosString;

public class StringMetodos1 {

	public static void main(String[] args) {
		
		String nombre="Andres";
		
		System.out.println("nombre.length() = "+nombre.length());
		
		System.out.println("nombre.toUpperCase() = "+nombre.toUpperCase());
		
		System.out.println("nombre.toLowerCase() = "+nombre.toLowerCase());
		
		System.out.println("nombre.equals(\"Andres\") = "+nombre.equals("Andres"));
		
		System.out.println("nombre.compareTo(\"\") = "+nombre.compareTo("Andres")); //si el valor es cero son identicos
		System.out.println("nombre.compareTo(\"\") = "+nombre.compareTo("Aaron"));
		
		System.out.println("nombre.charAt() = "+nombre.charAt(3)); //nos muestra la letra o numero que este en esa posicion desde el 0 a desde la izquierda
		
		System.out.println("nombre.substring(3) = "+nombre.substring(3));//seleccionaremos todo desde la posicion 3 hacia la derecha, contando desde el 0
		System.out.println("nombre.substring(1,4) = "+nombre.substring(1,4));//seleccionaremos desde la posicion 1 hasta la posicion 4
		System.out.println("nombre.substring(3) = "+nombre.substring(nombre.length()-2)); //obtenemos las ultimas dos letras de el string completof
		
		
		//2parte
		String trabalenguas="trabalenguas";
		
		System.out.println("trabalenguas.replace = "+trabalenguas.replace("a", "."));
		
		System.out.println("trabalenguas.indexOff('a') = "+trabalenguas.indexOf('a')); //nos muestra la primera posicion de en este caso 'a'
		System.out.println("trabalenguas.lastIndexOff('a') = "+trabalenguas.lastIndexOf('a')); //nos muestra la ultima posicion de en este caso 'a'
		
		System.out.println("trabalenguas.contains() = "+trabalenguas.contains("a"));
		
		System.out.println("trabalenguas.startsWith(\"traba\") = "+trabalenguas.startsWith("traba"));
		System.out.println("trabalenguas.endsWith(\"guas\") = "+trabalenguas.endsWith("guas"));
		System.out.println(".trim = "+"    trabalenguas ".trim()); //quitamos espacios en blanco de izquierda y derecha
	
		
		//3parte
		String archivo="alguna.imagen.js";
		System.out.println("archivo.length = "+ archivo.length());
		System.out.println(archivo.substring(archivo.lastIndexOf('.')+1));
		
		
	}

}
