package exercicios_09_11;

import java.util.Scanner;

public class refeitoterceiro {

	public static void main(String[] args) {
		// leia  um  número  inteiro  e  informe  ao  final  se  o  número  lido  é primo ou não.
        Scanner leitura = new Scanner(System.in);
		
		int primo = 0;
		
		System.out.println("Digite um numero:");
		int numero = leitura.nextInt();
		
		for (int i = 1; i <= numero; i=i+1) {
			
			if (numero % i == 0) {
				primo += 1;
			}
		}
		if (primo == 2) {
			System.out.println(numero + " é primo.");
		} else {
			System.out.println(numero + " não é primo.");
		}
		
		leitura.close();
	}

}
