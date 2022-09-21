package Runtime_Propiedades_Sistema_Y_ConfigCustom_Aplicacion;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AsignarPropiedadesSistema {

	public static void main(String[] args) {
		
		//1ºCreamos un archivo llamado 'config.properties'
		//2º El texto va sin punto y coma y sin comillas, siempre empieza por una letra
		//3º una vez dado valores a la configuracion, tenemos que agregar estas configuraciones del archivo en las propiedades de la clase system
		//4º creamos una instancia de la clase FileInputStream (en el argumento pasamos la ruta) 
		//5º Una vez tengamos el archivo con su ruta se lo agregamos a un objeto properties
		//6º Al properties le agregamos todas las configuraciones del sistema añadiendo en los parametros del objeto el System.getProperties()
		//7º Además le agregamos las nuevas configuraciones del archivo con properties.load()
		//8º Actualizamos nuestro property en las propiedades del sistema con 'System.setProperties' en plural, y le pasamos como argumento 'properties'
		//9º Para obtener toda la lista actualizada hacemos uso del 'System.getProperties().list(System.out)
		//10º si queremos un property en especial imprimimos 'properties.getProperty("llave")'
		
		try {
			FileInputStream archivo=new FileInputStream("C:\\WkSpaceVerano\\wkUdemy\\CursoJava\\CursoJava\\Practicas\\Seccion1Hasta11\\9_Clase_System\\src\\Propiedades_Sistema_Y_ConfigCustom_Aplicacion\\config.properties");
			
			Properties properties=new Properties(System.getProperties());
			properties.load(archivo);
			properties.setProperty("mi.propiedad.personalizada","Mi valor guardado en el objeto properties");//esta es otra forma en vez de crear el archivo config.properties
			
			System.setProperties(properties);//actualizando 
			System.getProperties().list(System.out);
			System.out.println(properties.getProperty("config.autor.email"));
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			System.err.println("No existe el archivo"+e.getMessage());
			System.exit(1);//Si sucede un error se saldría y podría continuar con el codigo
		} catch (IOException e) {
			
			e.printStackTrace();
			System.err.println("Error en la entrada o salida");
		}
		
		

	}

}
