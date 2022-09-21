package Bucles_General;

public class SentenciasBucleEtiquetas {

	public static void main(String[] args) {
		
		//añadir etiquetas a los for, tiene que estar justo encima del bucle, se le pone un nombre y dos puntos
		
		bucle1:
		for (int i=0;i<5;i++) {
			System.out.println();
			
			bucle2:
			for (int j=0;j<5;j++) {
				
				if(j==2) {
					continue bucle2;// nos saltaremos el dos del j
				}
				System.out.print("[i= "+i+",j= "+j+"]");
			}
			
		}

	}

}
