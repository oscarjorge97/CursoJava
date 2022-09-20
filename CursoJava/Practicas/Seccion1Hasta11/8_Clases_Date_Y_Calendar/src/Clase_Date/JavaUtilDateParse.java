package Clase_Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class JavaUtilDateParse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyy-MM-dd");
		
		System.out.println("Ingrese una fecha con formato 'yyy-MM-dd'");

		try {
			Date fecha=sdf.parse(sc.nextLine());
			
			System.out.println("fecha= "+fecha);
			System.out.println("format= "+sdf.format(fecha));
			
			//--------------------------Vamos a comparar fechas
			Date fecha2=new Date();
			if (fecha.after(fecha2)){	//si la fecha es igual o despues de la fecha2
				
				System.out.println("Fecha del usuario es despues que fecha2");
			}else if(fecha.before(fecha2)) {
				
				System.out.println("Fecha es anterior que fecha2");
			}else if(fecha.equals(fecha2)) {
				
				System.out.println("Fecha es igual a fecha2");
			}
			
			
			//Tmbien podemos utilizar el metodo compareTo
			if (fecha.compareTo(fecha2)>0) { // 0: si el resultado es mayor que 0 es por que es correcto y fecha es mayor que fecha2
				System.out.println("fecha1 (del usuario) es después que fecha2 (actual)");
			
			}else if (fecha.compareTo(fecha2)<0) {	// si el resultado es menor que cero entonces fecha es anterior que fecha2
				System.out.println("fecha1 (del usuario) es anterior que fecha2 (actual)");
			
			}else if (fecha.compareTo(fecha2)==0) {	//si el resultado es igual a 0 entonces son iguales las fechas
				System.out.println("fecha es igual a fecha2");
			}
			
			
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}

}
