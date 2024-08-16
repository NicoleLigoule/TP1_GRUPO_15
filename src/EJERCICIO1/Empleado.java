package EJERCICIO1;

public class Empleado {
	private int id;
	private String nombre;
	private int edad;
	
	static int contador = 999;
	
	//Constructores
	
		public Empleado() {
			contador++;
			id = contador;
			nombre = "sin nombre";
			edad = 99;		
		}
}
