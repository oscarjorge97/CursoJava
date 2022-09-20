package Wrapper_Integer_GetClass;

public class WrapperOperadoresRacionales {
	
	public static void main(String[] args) {
		//Moraleja: Para comparar objetos Integer usar '=='
		//			Para comparar valores usar '.equals(object)' o 'intValue' etc
		Integer num1=Integer.valueOf(1000);
		Integer num2=num1;
		
		System.out.println("Imprimiendo objeto num1 = "+num1);
		System.out.println("Imprimiendo objeto num2 = "+num2);
		
		System.out.println("Son el mismo objeto?: "+(num1==num2));
		//si es menor que 127 por defecto java aunque sean objetos los compara por el valor y no por objeto/instancia
		num2=1000;
		
		System.out.println("Imprimiendo objeto num1 = "+num1);
		System.out.println("Imprimiendo objeto num2 = "+num2);
		
		System.out.println("Son el mismo objeto?: "+(num1==num2));	//Contiene el mismo valor pero distinta instancia/objeto
																	//en primitivos con == compara por el valor, aquí no
		
		System.out.println("Son el mismo objeto?=: "+(num1.equals(num2)));//Compara por el valor
		
		System.out.println("Son el mismo objeto?=: "+((num1.intValue()==num2.intValue())));//lo comparamos en primitivos por lo que será true
		
		num2=500;
		
		boolean condicion=num1>num2;
		System.out.println("condicion= "+condicion);
		
		boolean condicion2=num1.intValue()>num2.intValue();
		System.out.println("condicion2= "+condicion2);
	}
}
