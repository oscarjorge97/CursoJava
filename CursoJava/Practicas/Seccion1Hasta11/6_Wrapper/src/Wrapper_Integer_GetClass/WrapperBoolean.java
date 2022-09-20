package Wrapper_Integer_GetClass;

public class WrapperBoolean {

	public static void main(String[] args) {
		//se puede comparar con el '.equals(object)' o '=='
		Integer num1,num2;
		num1=1;
		num2=2;
		
		boolean primBoolean=num1>num2; //false
		
		Boolean objBoolean=Boolean.valueOf(primBoolean);
		Boolean objBoolean2=Boolean.valueOf("false");
		
		System.out.println("primBoolean= "+primBoolean);
		System.out.println("objBoolean= "+objBoolean);
		System.out.println("objBoolean2= "+objBoolean2);
		
		System.out.println("comparando dos objetos boolean: "+(objBoolean==objBoolean2));
		System.out.println("comparando dos objetos boolean: "+(objBoolean.equals(objBoolean2)));

		boolean primBoolean2=objBoolean2.booleanValue();
		System.out.println(primBoolean2);
	}

}
