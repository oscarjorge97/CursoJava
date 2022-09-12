package Aritmeticos_Asignacion;

import java.util.Scanner;

public class OperadorAritmetico {

	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder();
		Scanner sc=new Scanner(System.in);
		
		int i=5, j=4, suma=i+j;
		
		System.out.println(suma);
		
		
		System.out.println("i + j= "+suma);
		
		int resta=i-j;
		System.out.println("resta= "+resta);
		
		int multi=i*j;
		System.out.println("multi= "+multi);
		
		double division=(double)i/j;//basta con convertir uno para que salgan todos sus decimales
		System.out.println("division= "+division);
		
		
		int resto=i%j;//vemos el resto, se suele utilizar para numeros pares
		System.out.println(resto);
		double numero=0;
		
		System.out.println("ingrese un numero para saber si es par");
		numero=sc.nextDouble();
		if(numero%2==0) {
			System.out.println("El numero es par");
			
		}else {
			System.out.println("El numero es impar");
		}
		
		
	}

}
