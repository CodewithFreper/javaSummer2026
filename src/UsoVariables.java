
public class UsoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte edad; //declaro variable
		var edad2 = 12; //declaro e inicializo, al utilizar inferencia de tipos (var) necesito inicializar
		
		edad = 17; //inicializo variable
		
		System.out.println(edad);
		System.out.println(edad2);
		
		
		double num1 = 7;
		double num2 = 3;
		
		System.out.println(num1%num2);
		
		int numA = 5;
		int numB = 2;
		
		double resultado = numA/numB; //El resultado será incorrecto ya que divide dos enteros, para que el resultado de la división sea decimal al menos uno de los numeros ha de ser double.
		
		System.out.println(resultado);
		
		int numC = 5;
		double numD = 2;
		
		double resultado2 = numC/numD;
		
		System.out.println(resultado2);
		
		String nombre = "Cris";
		
		System.out.println(nombre + " tiene " + edad + " años.");
		
		
		int operador1=7, operador2=9, resultadoOperadores=operador1+operador2;
		
		System.out.println(resultadoOperadores);
	}

}
