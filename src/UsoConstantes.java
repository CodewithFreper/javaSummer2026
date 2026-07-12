
public class UsoConstantes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int ejemplo = 9; //al agregar final no nos deja modificar el valor nunca
		final double pi = 3.1416;
		
		System.out.println(ejemplo);
		System.out.println(pi);

		final double aCentimetros = 2.54;
		int pulgadas = 7;
		
		double resultado = pulgadas * aCentimetros;
		System.out.println("En " + pulgadas + " pulgadas hay " + resultado + " centímetros.");
	}

}
