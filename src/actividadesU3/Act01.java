//Programa que pida una calificación (entre 0 y 10) y visualice su equivalente alfabético, según la siguiente tabla:

//0-3 --> Muy deficiente
//3-5 --> Insuficiente
//5-6 --> Suficiente
//6-7 --> Bien
//7-9 --> Notable
//9-10 --> Excelente

package actividadesU3;

import java.util.Scanner;

public class Act01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int notaNumerica;
		String notaPalabras;

		do {
			System.out.println("Hola, pon tu nota a continuación: ");
			notaNumerica = sc.nextInt();
		} while (notaNumerica < 0);
		
		
		
		
		
		
	}

}
