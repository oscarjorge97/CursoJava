package SistemasNumericosEntradaDatos;

import javax.swing.JOptionPane;

public class EntradaDatosVentana {

	public static void main(String[] args) {
		// Pedimos el nombre
		String nombre="";
		nombre = JOptionPane.showInputDialog("Introduzca su nombre"); //JOptionPane devolverá un String
		//pedimos un numero
		int numero=0;
		try {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número"));
		} catch (NumberFormatException e) {
			//la idea es dar un mensaje al usuario al haber un error
			JOptionPane.showMessageDialog(null, "Error debe ingresar un número entero");
			
			main(args); //repetimos el proceso desde el principio llamando al metodo main con su argumento
			System.exit(0); //para que no se reproduzca más de una vez lo demás después de salir del catch
		}
		
		
		System.out.println("Nombre: "+nombre+". Número escogido: "+numero);
		
		//
		JOptionPane.showMessageDialog(null, "Nombre: "+nombre);
		JOptionPane.showMessageDialog(null, "Número escogido: "+numero);
		
	}

}
