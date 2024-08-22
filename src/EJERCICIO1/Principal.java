package EJERCICIO1;


public class Principal {

	public static void main(String[] args) {
		
		Empleado[] vEmp = new Empleado[5];
		vEmp[0] = new Empleado("Jorge",26);
		vEmp[1] = new Empleado();
		vEmp[2] = new Empleado("Nicole",23);
		vEmp[3] = new Empleado("Tomas",19);
		vEmp[4] = new Empleado();

		
		System.out.print(vEmp[0].toString());
		System.out.print(vEmp[1].toString());
		System.out.print(vEmp[2].toString());
		System.out.print(vEmp[3].toString());
		System.out.print(vEmp[4].toString());
		
		// llamado al metodo
		
		System.out.print("\nEl próximo ID será el " + Empleado.devuelveProximoId());	
	}

}
