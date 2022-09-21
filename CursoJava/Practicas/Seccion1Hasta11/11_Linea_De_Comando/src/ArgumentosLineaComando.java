
public class ArgumentosLineaComando {

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("Debe ingresar argumentos o parámetros!");
			System.exit(-1);//-1 cuando ocurre un error		1 cuando se lanza una excepcion		0 cuando todo sale correcto
		}
		for (int i = 0; i < args.length; i++) {
			
			System.out.println("Argumentos nº"+i+": "+args[i]);
			//1ºCuando estemos en el cmd ubicados en la carpeta del proyecto en este caso en '11_Linea_De_Comando' nos movemos a cd
			//2ºy ejecutamos el comando javac nombreDeLaClase.java , en este caso ArgumentosLineaComando.java, si tenemos problemas de acento o caracteres especiales, despues del java ponemos' -encoding utf8''
			//3ºy nos aparece el .class (bytecode) y el .java (codigo fuente)
			
			//4ºPara ejecutar nuestra aplicacion escribimos el comando en el src 'java ArgumentosLineaComando ....' cada argumento separado por un espacio
			//5ºen los puntos suspensivos son los parametros que le pasamos, cuando está compuesto por más de una palabra se pone ej :"Juan Francisco"
			
			//6ºsi hacemos algun cambio hay que volver a hacer la linea 2 y despues la linea 4 
		}

	}

}
