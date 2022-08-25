package Conversiones;

public class ConversionCadenasToPrimitivo {

	public static void main(String[] args) {
		String numeroString = "20";
		int numeroParseado=Integer.parseInt(numeroString);
		System.out.println("numeroInt= "+numeroParseado);
		
		String doubleString ="23.563e-3";
		double doubleParseado=Double.parseDouble(doubleString);
		System.out.println("numeroDouble= "+doubleParseado);
		
		String booleanString="true";
		boolean booleanParseado=Boolean.parseBoolean(booleanString);
		System.out.println("Boolean: "+booleanParseado);
	}

}
