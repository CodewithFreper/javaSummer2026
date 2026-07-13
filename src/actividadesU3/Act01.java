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

		System.out.println("Hola, pon tu nota a continuación: ");
		do {
			notaNumerica = sc.nextInt();
			if (notaNumerica < 0 || notaNumerica > 10) {
				System.out.println("Por favor, introduce una notra entre 0 y 10.");
			}
		} while (notaNumerica < 0 || notaNumerica > 10);

		
		if (notaNumerica < 3) {
			notaPalabras = "Muy deficiente";
		} else if (notaNumerica < 5) {
			notaPalabras ="Insuficiente";
		} else if (notaNumerica < 6) {
			notaPalabras = "Suficiente";
		} else if (notaNumerica < 7) {
			notaPalabras = "Bien";
		} else if (notaNumerica < 9) {
			notaPalabras = "Notable";
		} else {
			notaPalabras = "Excelente";
		}
		
		System.out.println(notaPalabras);
		
	}

}
