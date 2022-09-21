package objetosVSoperadorNew;

public class EjemploString {

	public static void main(String[] args) {
		
		String curso="Programación Java";
		String curso2=new String("Programación Java");
		String curso3="Programación Java";
		
		boolean esIgual=curso==curso2; //verificamos si el objeto es igual y da false por su forma de crearse
		System.out.println(esIgual);
		
		esIgual=curso.equalsIgnoreCase(curso2);//verificamos si el valor es igual
		System.out.println(esIgual);
		
		esIgual=curso==curso3; //es igual porque se ha creado de la misma forma y tiene mismo contenido
		System.out.println(esIgual);
		
		
		
		//concatenado
		String profesor="Andrés Guzmán";
		//String curso="Programación Java";
		
		String info=curso+" con el instructor "+profesor;
		System.out.println(info);
		
		int numeroA=10;
		int numeroB=5;
		System.out.println(info+numeroA+numeroB); //concatenará sin sumar, solo lo juntará
		System.out.println(info+(numeroA+numeroB));//concatenará pero sumará los int de los parentesis
		
		String info2=curso.concat(" con "+profesor);
		System.out.println(info2);
		
		
		
		//Inmutabilidad
		String resultado= curso.concat(" "+profesor);
		System.out.println("resultado= "+resultado);
		
		String resultado2= curso.transform(c ->{
			return c+" con "+profesor;
			
		});
		System.out.println("resultado2= "+resultado2);
		
		String resultadoReplace= resultado.replace("a", "A");//siempre o casi siempre que hagamos un cambio o modificacion a traves de algun metodo tenemos que poner una nueva variable
		System.out.println("replace= "+resultadoReplace);
		
		
		
	}

}
