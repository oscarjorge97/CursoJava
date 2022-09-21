import java.util.Random;

public class ClaseMathRandom {

	public static void main(String[] args) {
		
		double random=(Math.random());//nunca llega al maximo
		System.out.println("random= "+random);
		
		
		//si queremos que el resultado llege al maximo lo logico es sumarle uno y redondearlo, en este caso pues multiplicarlo por 8
		System.out.println("random entre 0 y 7= "+Math.round((random*8)));//para que vaya entre 0 y un numero, hay que multiplicarlo por ese numero

		
		
		String [] colores= {"azul", "amarillo", "rojo", "verde", "blanco", "negro"};
		double random2=Math.random();
		random2=random2*colores.length;
		System.out.println("Numeros aleatorios entre la cantidad de colores que son entre 0 y 5= "+random2);
		//ya que puede llegar al 5,9 entonces redondeemos hacia abajo y comprobamos de nuevo
		random2=Math.floor(random2);
		System.out.println("Numeros aleatorios entre la cantidad de colores que son entre 0 y 5= "+random2);
		//en el numero de orden de colores, en su parametro le ponemos el numero aletario
		System.out.println(colores[(int) random]);
		
		//objeto random es más flexible
		Random randomObj= new Random();
		
		int randomInt=randomObj.nextInt();
		System.out.println("random int= "+randomInt);
		
		long randomLong=randomObj.nextLong();	//rango más amplio
		System.out.println("random Long= "+randomLong);
		
		int randomInt2=randomObj.nextInt(7);	//ponemos entre parametro el limite en este caso entre 0 y 7
		System.out.println("random int2= "+randomInt2);
		
		int randomInt3=15+randomObj.nextInt((25-15)+1);//entre 15-25, si queremos incluir el 25 sumamos 1
		System.out.println("random int3= "+randomInt3);
		
		int randomIntColores=randomObj.nextInt(colores.length);
		System.out.println("randomIntColores= "+randomIntColores);
		System.out.println(colores[randomIntColores]);
		
	}

}
