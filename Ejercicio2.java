import java.util.*;

public class Ejercicio2 {

	public static void main(String args[]){
		double contador;
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el primer n�mero");
		n = scanner.nextInt();
		contador = 0;
		for (contador=1;contador<=n-1;contador++) {
			System.out.println("Los n�meros comprendidos son: "+contador);
		}
	}


}

