package Runtime_Propiedades_Sistema_Y_ConfigCustom_Aplicacion;

import java.io.IOException;

public class EjecutarSO_Runtime {

	public static void main(String[] args) {
		Runtime rt= Runtime.getRuntime();//TiempoEjecucion
		Process proceso;//La instancia la retorna el metodo execute de Runtime
		
		
			try {
				if(System.getProperty("os.name").startsWith("Windows")) {
				proceso=rt.exec("notepad");
				}else {
				proceso=rt.exec("textedit");	
				}
				
				proceso.waitFor();	//Para que espere a que finalice el programa
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.err.println("El comando es desconocido :"+e.getMessage());
				System.exit(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Se ha cerrado el editor.");
			System.exit(0);
		
		

	}

}
