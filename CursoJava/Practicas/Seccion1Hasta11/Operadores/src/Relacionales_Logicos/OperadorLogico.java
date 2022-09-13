package Relacionales_Logicos;

public class OperadorLogico {

	public static void main(String[] args) {
		//El '&&' tiene prioridad frente a 'or'
		//Por eso siempre es mejor colocar parentesis
		
		int i= 3;
		byte j= 3;
		float k= 127e-7f;
		double l= 2.1413e3;
		boolean m= false;
		
		boolean b1=i==j && k<l && m==true; 
		System.out.println("b1= "+b1);
		
		boolean b2= i==j || k<l;
		System.out.println("b2= "+b2);
		
		boolean b3= i==j && (k>l || m==false);//sin los parentesis es true, porque con el 'or' nos la da valida, pero con parentesis da false
		System.out.println("b3= "+b3);
		
		boolean b4 =i==j || k<l && m==true; //segun nuestra logica iria primero el 'or'. Pero en realidad primero compara el and
		System.out.println("b4= "+b4);
	}

}
