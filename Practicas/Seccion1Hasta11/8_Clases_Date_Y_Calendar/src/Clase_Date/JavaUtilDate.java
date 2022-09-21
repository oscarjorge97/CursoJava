package Clase_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaUtilDate {

	public static void main(String[] args) {
		//Utilizamos el de util, NO el de sql, y sirve para saber la fecha y el tiempo
		Date fecha= new Date();
		
		System.out.println("fecha= "+fecha);//muestra fecha completa
		
		//Lo customizamos con la clase SimpleDateFormat
		SimpleDateFormat sdf=new SimpleDateFormat("dd"); // "dd" para mostrar dia	"MMMM" para mes		"yyy" para año, 	"dd MMMM, yyy" para todo
		SimpleDateFormat dma=new SimpleDateFormat("dd 'de' MMMM,yyy"); //para añadir alguna palabra o letra añadir comilla simple
		
		String fechaString=dma.format(fecha);
		
		//Contar los milisegundos
		long j=0;
		
		for (int i=0;i<10000000;i++) {
			j+=i;
		}
		
		System.out.println("j= "+j);
		
		Date fecha2=new Date();
		
		long tiempoFinal=(fecha2.getTime()-fecha.getTime());
		
		System.out.println("Tiempo transcurrido en el for: "+tiempoFinal);
		
		
		System.out.println("dia= "+fechaString);
		
		

	}

}
