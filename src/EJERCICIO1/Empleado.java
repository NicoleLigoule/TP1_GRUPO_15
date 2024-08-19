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
			setNombre("sin nombre");
			edad = 99;		
		}
		public Empleado(String nombre,int edad){
			contador++;
			this.id=contador;
			this.setNombre(nombre);
			this.edad=edad;
		}
		
		// Getters y Setters
		public int getEdad() {
			return edad;
		}
		public void setEdad(int edad) {
			this.edad = edad;
		}
		public static int getContador() {
			return contador;
		}
		public static void setContador(int contador) {
			Empleado.contador = contador;
		}
		
		// Metodos
		public static int devuelveProximoId() {
			return contador+1;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		
		
}