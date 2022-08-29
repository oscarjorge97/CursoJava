package objetosVSoperadorNew;

import java.util.Iterator;

public class TestRendimientoConcatenacion {

	public static void main(String[] args) {
		//Es más rentable usar el StringBuilder
		String a="a";
		String b="b";
		String c="a";
		
		StringBuilder sb=new StringBuilder();
		
		long inicio=System.currentTimeMillis();//retorna un Long
		
		for (int i = 0; i < 100000; i++) {
			//c=c.concat(a).concat(b).concat("\n"); //500 =>2ms	100.000 =>5000ms
			//c += a + b + "\n"; //500 =>1ms	100.000 =>3500ms
			sb.append(a).append(b).append(c).append("\n"); //500 =>0ms	100.000 =>8ms
			
		}
		
		long fin=System.currentTimeMillis();
		
		System.out.println("c= "+c);
		System.out.println("sb= "+sb.toString());//toString es para que genere el string completo
		System.out.println(fin-inicio);
		
	}
}
