package Flujos_While_DoWhile;

public class SentenciaWhile {
	
	public static void main(String[] args) {
		//En el while comprueba y luego ejecuta
		//En el do/while ejecuta y luego comprueba
		int i=0;
		
		while(i<5) {
			System.out.println("i= "+i);
			i++;
		}
		
		i=0;
		boolean prueba=true;
		while (prueba) {
			if(i==7) {
				prueba=false;
			}
			System.out.println("i= "+i);
			i++;
		}
		System.out.println(prueba);
		
		do {
			System.out.println("se ejecuta al menos una vez");
		}while (prueba==true);
	}
	
	
}
