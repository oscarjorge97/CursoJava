package EjemplosDeVariables;

public class HolaMundo {

	public static void main(String[] args) {
		String saludar="Hola mundo desde Java";
		System.out.println(saludar.toUpperCase());
		
		int numeroEntero=3048;
		double numeroConDecimal=30.48;
		Integer resultado=3048;
		
		boolean valor =true;
		if (valor==true) {
			System.out.println(numeroEntero);
		}else {
			System.out.println(numeroConDecimal);
		}
		//var es un variable que acoge todos los tipos de variables, numero, strings pero ocupa más espacio
		String nombre="Andrés";	
		System.out.println("Resultado de comparar="+resultado.compareTo(numeroEntero));
		if (resultado.compareTo(numeroEntero)==0) {
			System.out.println(nombre);
		}else {
			nombre="Juan";
			System.out.println(nombre);
		}
		
	}

}
