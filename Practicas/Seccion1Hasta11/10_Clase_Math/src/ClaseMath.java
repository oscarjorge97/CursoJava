
public class ClaseMath {

	public static void main(String[] args) {
		
		int absoluto=Math.abs(-3);	//absoluto de un numero
		System.out.println("Absoluto= "+absoluto);
		
		
		double max=Math.max(3.5, 5.2);//maximo entre dos numeros
		System.out.println("maximo= "+max);
		
		double min=Math.min(3.5, 5.2);//minimoentre dos numeros
		System.out.println("minimo= "+min);
		
		double redondeoMax=Math.ceil(3.54);//redondear hacia arriba
		System.out.println("redondeo hacia arriba= "+redondeoMax);
		
		double redondeoMin=Math.floor(3.54);//redondear hacia abajo
		System.out.println("redondeo hacia arriba= "+redondeoMin);
		
		long redondeoOficial=Math.round(Math.PI);//si es menor que 5 redondea hacia abajo, si es mayor o igual redondea hacia arriba
		System.out.println("redondeo oficial= "+redondeoOficial);
		
		double exponencial=Math.exp(2);	//valor de la exponencial
		System.out.println("exponencial= "+exponencial);
		
		double logaritmo=Math.log(10);	//logaritmo narutal de en este caso 10
		System.out.println("logaritmo de 10= " +logaritmo);
		
		double potencia =Math.pow(10, 3); //potencia de 10 elevado a 3
		System.out.println("potencia de 10 elevado a 3= "+potencia);
		
		double raizCuadrada=Math.sqrt(5); //Raiz cuadrada
		System.out.println("raiz cuadrada de 5= "+raizCuadrada);
		
		double radianAGrados=Math.toDegrees(1.57);//radian a grados
		System.out.println("radian a grados 1,57= "+radianAGrados);
		
		double gradosARadianes=Math.toRadians(89.954);//grados a radian 
		System.out.println("grados a radianes 89,954= "+gradosARadianes);
		
		System.out.println("sin(90): "+Math.sin(gradosARadianes));	//seno de 90
		System.out.println("cos(90): "+Math.cos(gradosARadianes));
		
	}
}
