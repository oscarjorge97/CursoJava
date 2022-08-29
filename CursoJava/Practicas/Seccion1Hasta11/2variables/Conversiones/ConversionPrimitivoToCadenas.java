package Conversiones;

public class ConversionPrimitivoToCadenas {

	public static void main(String[] args) {
		
		int numeroInt =100;
		System.out.println("numeroInt= "+numeroInt);
		
		String numeroString=Integer.toString(numeroInt);//Convertimos el int en String
		System.out.println("numeroString= "+numeroString);
		
		
		//otra forma
		numeroString=String.valueOf(numeroInt); //e
		System.out.println("numeroString= "+numeroString);
		
		numeroString=String.valueOf(numeroInt + 10); //e
		System.out.println("numeroString= "+numeroString);
		
		numeroString=String.valueOf(numeroString+10); //e
		System.out.println("numeroString= "+numeroString);
		
		double numeroDouble=1.23456;
		
		String doubleString=Double.toString(numeroDouble);
		System.out.println("doubleString= "+doubleString);
		
		
		String numerDouble=String.valueOf(numeroDouble);
		System.out.println("doubleString= "+doubleString);
	}
}
