package exercicios_09_11;

public class exercicio1 {

	public static void main(String[] args) {
		// tabuadasdos números de 1 a 10.
		
		int resultado;
		
		for (int valor = 1; valor <= 10; valor = valor+1) {
			System.out.println ();
			System.out.println ("=== tabuada do: " +valor+ " === ");
			System.out.println ("");
		
		for (int i = 1; i<=10;i = i+1) {
			resultado = valor*i;
			System.out.println (valor+"X"+i+"=" +resultado);
		}
		}

	}

}
