package exercicios_09_11;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// Faça um programa que receba a idade de 15 pessoas e calcule e mostre;
		Scanner leitura = new Scanner (System.in);
		
		int faixaUm=0,faixaDois=0,faixaTres=0,faixaQuatro=0,faixaCinco=0;
		for (int i=1;i<=15;i=i+1) {
			System.out.println (" Digite a idade da " +i+ " pessoa: ");
			int idade = leitura.nextInt();
		    if (idade<=15) {
		      	faixaUm += +1;
		    }else if(idade<=30) {
		    	faixaDois += +1;
		    }else if(idade<=45){
		    	faixaTres += +1;
		    }else if(idade<=60) {
		    	faixaQuatro += +1;
		    }else {
		    	faixaCinco += +1;
		    }
		}
		    System.out.println (" 1° faixa etária tem " +faixaUm+ " pessoas que demonstram: " + (100*faixaUm/10) + "%");
		    System.out.println (" 2° faixa etária tem " +faixaDois+ " pessoas que demonstram: " + (100*faixaDois/10) + "%"); 
		    System.out.println (" 3° faixa etária tem " +faixaTres+ " pessoas que demonstram: " + (100*faixaTres/10) + "%");
		    System.out.println (" 4° faixa etária tem " +faixaQuatro+ " pessoas que demonstram: " + (100*faixaQuatro/10) + "%");
		    System.out.println (" 5° faixa etária tem " +faixaCinco+ " pessoas que demonstram: " + (100*faixaCinco/10) + "%");
		    
		 leitura.close();   

	}

}
