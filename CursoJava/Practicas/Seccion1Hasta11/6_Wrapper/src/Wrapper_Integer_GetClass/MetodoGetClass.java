package Wrapper_Integer_GetClass;

import java.lang.reflect.Method;

public class MetodoGetClass {

	public static void main(String[] args) {
		
		String texto="Hola que tal!";
		
		Class stringClass= texto.getClass();
		
		System.out.println("stringClass.getName()= "+stringClass.getName());	//Muestra el nombre de la clase y el package de en este caso el string texto
		System.out.println("stringClass.getSimpleName()= "+stringClass.getSimpleName());//Muestra solo el nombre de la clase de en este caso el string
		System.out.println("stringClass.getPackageName()= "+stringClass.getPackageName());//Muestra solo el package de en este caso el string
		
		//mostrar metodos de en este caso el string
		for(Method metodo: stringClass.getMethods()) {
			
			System.out.println("metodo.getName()= "+metodo.getName());
		}
		
		
		//Lo mismo pero en vez de String en Integer
		Integer num=34;
		Class intClass=num.getClass();
		
		System.out.println("intClass.getName()"+intClass.getSimpleName());
		System.out.println("intClass.getSuperClass()"+intClass.getSuperclass());//para saber cual es la clase padre de Integer
		System.out.println("intClass.getSuperClass()"+intClass.getSuperclass().getSuperclass());//para saber cual es la clase padre de Numes
		
	}
}
