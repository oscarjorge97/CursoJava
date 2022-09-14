package PrecedenciaOperador_Depuracion;

public class PrecedenciaOperadores {

	public static void main(String[] args) {
		//En resumen tener en cuenta los decimales poniendo las cosas en double y los parentesis
		
		
		int i =14;
		int j= 8;
		int k= 20;
		
		double promedio= (i+j+k)/3.0;
		System.out.println(promedio);
		
		
		promedio= ++i + j-- + k / 3.0 * 10d;	// promedio = 15 + 8 + 66,6666667=> promedio=89,6666667
		System.out.println("promedio= "+promedio);
		System.out.println("i= "+i);
		System.out.println("j= "+j);
		
		
		
	}
}
