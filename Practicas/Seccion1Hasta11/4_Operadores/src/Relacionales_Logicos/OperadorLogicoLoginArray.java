package Relacionales_Logicos;

import java.util.Iterator;
import java.util.Scanner;

public class OperadorLogicoLoginArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//creamos un array de string, le damos el nombre
		//y creamos la instancia con el operador new y ponemos el tipo que es String, seguido ponemos la cantidad dentro de los corchetes
		//es importante saber que creamos instancia con el operador new y parentesis cuando son clases, pero con new y corchetes cuando son arrays
		
		
		/*String [] arrayUsernames=new String[3]; 
		String [] arrayPasswords=new String[3];
		
		arrayUsernames[0]= "andres";
		arrayPasswords[0]= "12345";
		
		
		arrayUsernames[1]="admin";
		arrayPasswords[1]= "12345";
		
		arrayUsernames[2]= "pepe";
		arrayPasswords[2]= "1234";
		*/
		
		String [] arrayUsernames={"andres","admin","pepe"}; 
		String [] arrayPasswords={"123","1234","12345"};
		
		System.out.println("Ingrese el usuario: ");
		String user=sc.nextLine();
		
		System.out.println("Ingrese la contraseña: ");
		String passw=sc.nextLine();
		
		boolean esAutenticado=false;//lo dejamos por defecto
		
		
		
		
		for (int i = 0; i < arrayUsernames.length; i++) {
			
			if (arrayUsernames[i].equalsIgnoreCase(user) && arrayPasswords[i].equalsIgnoreCase(passw)) {
				
				esAutenticado=true;
				
				break;
				}
			
		}
		
		
		if (esAutenticado==true) {
			
			System.out.println("Bienvenido "+user+" !");
		}else {
			System.err.println("No ha introducido el usuario o contraseña correcta");
		}
		
		
	}
}
