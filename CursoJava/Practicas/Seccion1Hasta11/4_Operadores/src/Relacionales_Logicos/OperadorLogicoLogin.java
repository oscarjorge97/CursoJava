package Relacionales_Logicos;

import java.util.Scanner;

public class OperadorLogicoLogin {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String username= "andres";
		String password= "12345";
		
		String username2= "admin";
		String password2= "12345";
		
		System.out.println("Ingrese el usuario: ");
		String user=sc.nextLine();
		
		System.out.println("Ingrese la contraseña: ");
		String passw=sc.nextLine();
		
		boolean esAutenticado=false;//lo dejamos por defecto
		
		if (user.equalsIgnoreCase(username) || user.equalsIgnoreCase(username2)) {
			esAutenticado=true;
			
			if (passw.equalsIgnoreCase(password) || passw.equalsIgnoreCase(password2)) {
				esAutenticado=true;
				
				System.out.println("Bienvenido "+user+" !");
			}else {
				System.err.println("No ha introducido la contraseña correcta");
			}
			
		}else {
			System.err.println("No ha introducido el usuario correcto");
		}
		
		
		
		
	}
}
