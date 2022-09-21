package Wrapper_Integer_GetClass;

public class WrapperArray {

	public static void main(String[] args) {

		Integer[] enteros= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		
		int suma=0;
		//cada valor de entero se agregará al objeto i
		for (Integer i : enteros) {
			//si el valor de del array es divisible entre 2...
			if(i.intValue()%2==0) {
				//se sumará con el valor del array
				suma=suma+i.intValue();
			}
		}
		System.out.println("suma= "+suma);

	}

}
