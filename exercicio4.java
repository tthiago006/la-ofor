package exercicios_09_11;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// sequência de fibonacci.
		Scanner leitura = new Scanner (System.in);
		
		int valorUm=1,valorDois=0,termo;
	    System.out.println (" digite o termo desejado: ");
	    termo = leitura.nextInt();
	    System.out.println (" a sequencia de fibonacci do termo " +termo+ " é igual a: ");
	    System.out.println (valorUm);
	    for (int i=1; i<termo; i++) {
	    	valorUm = valorUm + valorDois;
	    	valorDois = valorUm - valorDois;
	    	System.out.println (valorUm);
	    }
	
         leitura.close();
	}

}
