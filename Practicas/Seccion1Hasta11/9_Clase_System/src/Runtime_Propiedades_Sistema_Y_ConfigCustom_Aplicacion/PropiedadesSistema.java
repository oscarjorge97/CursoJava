package Runtime_Propiedades_Sistema_Y_ConfigCustom_Aplicacion;

import java.util.Properties;

public class PropiedadesSistema {
	
	public static void main(String[] args) {
		
		String username=System.getProperty("user.name");//nombre usuario del sistema operativo,	entre comillas la "llave"
		System.out.println("username: "+username);
		
		String home=System.getProperty("user.home");//La ruta del usuario
		System.out.println("user.home: "+home);
		
		String workSpace= System.getProperty("user.dir");//La ruta del workSpace de eclipse usado en este momento
		System.out.println("workSpace: "+workSpace);
		
		String versionJava= System.getProperty("java.version");//Version de java
		System.out.println("Version de java: "+versionJava);
		
		String lineSeparator=System.getProperty("line.separator");
		
		System.out.println("lineSeparator: "+lineSeparator+ "Una Línea nueva");
		
		//Si queremos listar las configuraciones completas de todas las propiedades del sistema..
		Properties properties=System.getProperties();
		properties.list(System.out);
	}
	
	
}
