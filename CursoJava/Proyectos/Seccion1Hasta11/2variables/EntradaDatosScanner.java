import java.util.InputMismatchException;
import java.util.Scanner;

public class EntradaDatosScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); //el parametro indica input, es decir entrada, que se consigue a través de la clase System
		System.out.println("Ingrese un número entero");
		int numero=0;
		try{
			numero=sc.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("Error debe ingresar un número entero");
			main(args);
			System.exit(0);
		}
		
		System.out.println("numero: "+numero);
		
	}

}
