package Flujos_Switch_Case;

import java.util.Scanner;

public class SwitchCaseNumDiasMes {

	public static void main(String[] args) {

	Scanner sc =new Scanner(System.in);
	
	System.out.println("Ingrese el número del mes 1- 12");
	int mes=sc.nextInt();
	
	int numeroDias=0;
	System.out.println("Ingrese el año (YYYY)");
	int anio=sc.nextInt();
	
	
		switch(mes) {
		case 1,3,5,7,8,10,12:
			numeroDias=31;
			break;
		
		case 4,6,9,11:
			numeroDias=30;
		break;
		
		case 2:
			if(anio%400==0 || ((anio%4==0) && (anio%100 !=0))) {
				numeroDias=29;
			}else {
				numeroDias=28;
			}
			break;
		
		default:
			System.out.println("El número de mes no es correcto");
			break;
		}
		
		System.out.println("numeroDias= "+numeroDias);
		
		
	
	}

}
