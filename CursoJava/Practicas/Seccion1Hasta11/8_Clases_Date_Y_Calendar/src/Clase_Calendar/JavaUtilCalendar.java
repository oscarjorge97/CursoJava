package Clase_Calendar;

import java.util.Calendar;
import java.util.Date;

public class JavaUtilCalendar {

	public static void main(String[] args) {

		//Es una clase abstracta por lo que no podemos utilizar el operador new para crearlo
		//creamos un objeto de la clase calendar
		Calendar calendario= Calendar.getInstance();
		
		//el metodo set de calendario nos permite indicar una fecha en especifico
		//en el mes empieza desde 0
		calendario.set(2022, 9, 4,0,20,10);	//año, mes, dia, hora, minutos, segundos
		
		Date fecha=calendario.getTime();
		System.out.println("calendario= "+fecha);
		

	}

}
