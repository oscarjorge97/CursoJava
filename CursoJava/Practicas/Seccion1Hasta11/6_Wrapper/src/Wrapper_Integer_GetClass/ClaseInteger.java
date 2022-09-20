package Wrapper_Integer_GetClass;

public class ClaseInteger {

	public static void main(String[] args) {
		
		//creando objeto con operador new
		/*Integer intObjeto=new Integer(345);//deprecado*/
		Integer intObjeto=Integer.valueOf(345543);//esto se llama unboxing, toma un valor entero primitivo y lo convierte a un objeto
		Integer intObjeto2=32768; //esto se llama autoboxing, de forma directa
		
		System.out.println("intObjeto: "+intObjeto);
		System.out.println("intObjeto2: "+intObjeto2);
		//al revés
		
		int num= intObjeto;
		System.out.println("num: "+num);
		int num2=intObjeto2.intValue();//lo mismo de forma explicita
		System.out.println("num2: "+num2);
		
		String valorTvLcd="67000";
		Integer valor=Integer.valueOf(valorTvLcd);
		System.out.println("valor= "+valor);
		
		Short shortObjeto=intObjeto.shortValue();	//aquí podemos convertirlo pero tendremos perdida de información porque sobrepasa el limite de short
		System.out.println("shortObjeto="+shortObjeto);
		
		Byte byteObjeto=intObjeto.byteValue();	//aquí podemos convertirlo pero tendremos perdida de información porque sobrepasa el limite de byte
		System.out.println("byteObjeto="+byteObjeto);
		
		Long longObjeto=intObjeto.longValue();	//aquí no perdemos informacion porque long abarca más que el int
		System.out.println("longObjeto="+longObjeto);
	}

}
