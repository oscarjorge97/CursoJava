package metodosString;

public class StringMetodosArreglos {
	
	public static void main(String[] args) {
		

		
		String trabalenguas="trabalenguas";
		
		System.out.println("trabalenguas.toCharArray() =" + trabalenguas.toCharArray());// convertimos el string en un array
		char[] nuevoArray= trabalenguas.toCharArray();//metemos el String en un Array de char, al se de Char meteremos letra/numero por letra/numero
		
		for (int i = 0; i < nuevoArray.length; i++) {
			
			System.out.println("nuevoArray= "+nuevoArray[i]);
			
		}
		
		System.out.println("trabalenguas= "+trabalenguas.split("a"));
		
		String[] array2=trabalenguas.split("a");//metemos el String en un Array de String, utilizando el split imprimiremos en partes separadas sin la "a"
		
		for (int i = 0; i < array2.length; i++) {
			System.out.println("array2= "+array2[i]);
		}
		//
		
		String archivo="alguna.imagen.pdf";
		String[] archivoArray=archivo.split("\\.");
		for (int i = 0; i < archivoArray.length; i++) {
			System.out.println("archivoArray= "+archivoArray[i]);
		}
		
	}
}
