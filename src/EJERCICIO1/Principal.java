package EJERCICIO1;

public class Principal {

	public static void main(String[] args) {
		
		Empleado[] vEmp = new Empleado[5];
		vEmp[0] = new Empleado("Jorge",26);
		vEmp[1] = new Empleado();
		vEmp[2] = new Empleado("Nicole",23);

		
		// llamado al metodo
		System.out.print("El próximo ID será el " + devuelveProximoId());
	}

}
