package UnarioIncrementoDecremento;

public class OperadorIncremental {

	public static void main(String[] args) {
		
		
		int i=1;
		//Pre Incremento		Tanto i como j tendrán el mismo valor final
		int j=++i;
		
		System.out.println("i= "+i);
		System.out.println("j= "+j);
		
		//Post Incremento		i tendrá un valor final distinto ya que se incrementa y j cogerá el valor inicial de i
		i=2;
		j=i++;
		
		System.out.println("i= "+i);
		System.out.println("j= "+j);
		
		
		//Pre Decremento		Tanto i como j tendrán el mismo valor final
		i=3;
		j=--i;
		
		System.out.println("i= "+i);
		System.out.println("j= "+j);
		
		//Post Decremento		i tendrá un valor final distinto ya que se incrementa y j cogerá el valor inicial de i
		i=4;
		j=i--;
		System.out.println("i= "+i);
		System.out.println("j= "+j);
		
		
	}

}
