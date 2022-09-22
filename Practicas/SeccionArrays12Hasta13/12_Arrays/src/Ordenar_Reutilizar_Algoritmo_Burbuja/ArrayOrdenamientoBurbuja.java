package Ordenar_Reutilizar_Algoritmo_Burbuja;

import java.util.Iterator;

public class ArrayOrdenamientoBurbuja {

	public static void main(String[] args) {
		
		String []productos= {"Kingston Pendrive 64GB","Samsung Galaxy","Disco Duro SSD Samsung Externo"
				,"Asus Notebook","Macbook Air","Chromecast 4ta generación","Bicicleta Oxford"};
		
		int total=productos.length;
		
		int contador=0;
		
		for(int i=0;i<total;i++) {
			
			for(int j=0;j<total;j++) {
				contador++;
				
				if(productos[i].compareTo(productos[j]) < 0) {//al ser menor que 0 indicaria que el i sería menor que j
															//intercambiamos de posicion, el valor de i pasaria al valor de j y viceversa
					String auxiliar=productos[i];	//aqui guardamos el valor de producto[i]
					
					productos[i]=productos[j];	//aqui asignamos el valorde 'j' a la 'i', por lo que i pierde su valor al tomar el valor de j
												//pero el valor de i aún está en 'auxiliar'
					productos[j]=auxiliar;		//'j' ahora tiene el valor de 'i'
	
				}
				
			}
		}
		
		for(int i=0;i<total;i++) {
			System.out.println("para indice "+i+" :"+productos[i]);
		}
		System.out.println("n/º de iteraciones= "+contador);

	}

}
