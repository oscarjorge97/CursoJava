package objetosVSoperadorNew;

public class ValidarString {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder();
		
		
		String curso=null;
		
		boolean esNulo = curso==null;
		
		System.out.println("es Nulo= "+esNulo);
		if(esNulo==false) {
		System.out.println(curso.toUpperCase());
		}
		else {
			curso="Programación Java";
		}
		
		//boolean esVacio=curso.length()==0; //version más larga pero menos usable
		
		boolean esVacio2=curso.isEmpty();
		
		System.out.println("esVacio= "+esVacio2);
		
		if(esVacio2==false) { //if(curso.isEmpty()==false) or  if(!curso.isEmpty())
			StringBuilder info=sb.append("Bienvenido al curso ").append(curso);
			System.out.println(info);
		}
		
		boolean esBlanco = curso.isBlank();
		if(esBlanco==true) {
			//es mas estricto, distingue de null de espacios en blanco o campos vacios
		}
		
		
	}

}
