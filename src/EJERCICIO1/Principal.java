package EJERCICIO1;

/**
 * @author Tomas
 *
 */
public class Principal {

	public static void main(String[] args) {
		
		Empleado[] vEmp = new Empleado[5];
		vEmp[0] = new Empleado("Jorge",26);
		vEmp[1] = new Empleado();
		vEmp[2] = new Empleado("Nicole",23);
		vEmp[3] = new Empleado("Tomas",19);
		vEmp[4] = new Empleado("Carlos", 22);

		
		// llamado al metodo
		
		System.out.print("El pr�ximo ID ser� el " + Empleado.devuelveProximoId());	
	}

}
