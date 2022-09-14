package Flujos_Switch_Case;

public class SentenciasSwitchCase {

	public static void main(String[] args) {
		
		int num=3;
		
		switch (num) {
		case 0:
			System.out.println("El numero es 0");
			break;
			
		case 1:
			System.out.println("El numero es 1");
			break;

		case 2:
			System.out.println("El numero es 2");
			break;
		case 3:
			System.out.println("El numero es 3");
			break;
		default:
			System.out.println("Numero desconocido");
			break;
		}
		
		String nombre="admin";
		
		switch(nombre) {
		
		case "admin":
			System.out.println("Hola admin, bienvenido!");
			break;
			
		case "andres":
			System.out.println("Hola andres!");
			break;
			
		case "pepe":
			System.out.println("Hola pepe");
			break;
			
		default:
			System.out.println("Usuario desconocido!");
			break;
		}
		
		
	}
}
