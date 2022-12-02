package exercicios_09_11;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner (System.in);
		int i, idade, velho = 0, novo = 200;
		double media,soma=0;
		
		for (i=1;i<=10;i=i+1) {
			System.out.println (" Informe a sua idade: ");
			idade = leitura.nextInt();
			System.out.println (" idade: " +idade);
			soma = soma + idade;
			if (idade>novo) {
				velho = idade+0;
			}else if (novo>idade) {
				novo = idade+0;
			}
		}     
            System.out.println (" o mais velho tem " +velho+ " anos ");
            System.out.println (" o mais novo tem " +novo+ " anos ");
            media = soma/10; 
            System.out.println (" A média sera: " +media);

		}

	}


