package VariablesPrimitivas;

public class PrimitivosBoolean {
	public static void main(String[] args) {
		boolean datoLogico = true;
		

		double d = 98765.43e-3;// el valor real seria= 98.76543
		float f = 1.2345e2f; // el valor real seria=123.45
		datoLogico = d < f;
		
		System.out.println("datoLogico= " + datoLogico);
		
		boolean esIgual = 3-4==-0;
		System.out.println("Es igual = "+esIgual);
	}
}
 