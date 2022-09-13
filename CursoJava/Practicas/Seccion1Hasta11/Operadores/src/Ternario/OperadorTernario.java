package Ternario;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		// Esta formado por 3 argumentos/partes
		//es un if else resumido, pero no puede ejecutar un bloque de codigos
		
		String variable = 7==5 ? "si es verdadero" : "si es falso";
		System.out.println("variable= "+variable);
		
		String estado = "";
		double promedio = 0;
		
		double matematicas=0;
		double ciencias=0;
		double historia=0;
		
		
		
		
		System.out.println("Ingresa la nota de matimaticas entre 2-7");
		matematicas=sc.nextDouble();
		System.out.println("Ingresa la nota de ciencias entre 2-7");
		ciencias=sc.nextDouble();
		System.out.println("Ingresa la nota de historia entre 2-7");
		historia=sc.nextDouble();
		
		promedio= (matematicas+ciencias+historia)/3;
		estado = promedio >=5 ? "Aprobado" : "Suspenso";
		
		System.out.println("estado = "+estado);
		System.out.println("promedio = "+promedio);
		
		
		

	}

}
