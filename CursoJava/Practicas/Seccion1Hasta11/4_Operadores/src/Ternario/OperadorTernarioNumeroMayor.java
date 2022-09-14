package Ternario;

import java.util.Scanner;

public class OperadorTernarioNumeroMayor {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int max=0;
		
		System.out.println("ingrese un numero");
		int num1= sc.nextInt();
		
		System.out.println("ingrese un segundo numero");
		int num2= sc.nextInt();
		
		System.out.println("ingrese un tercer numero");
		int num3= sc.nextInt();
		
		System.out.println("ingrese un cuarto numero");
		int num4= sc.nextInt();
		
		max = (num1>num2) ? num1:num2; //se asigna el numero mayor a max
		max = (max>num3) ? max:num3;
		
		System.out.println("num1 ="+num1);
		System.out.println("num2 ="+num2);
		System.out.println("num3 ="+num3);
		System.out.println("num4 ="+num4);
		System.out.println("max ="+max);
	
		
	}
}
