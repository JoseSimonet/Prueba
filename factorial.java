import java.util.Scanner;

public class factorial {

	// public void factorial(){
	//ESTO ES UNA PRUEBA PARA GITHUB

	public static void main(String[] args) {

		System.out.print("Número?: ");
		Scanner lect = new Scanner(System.in);
		int num = lect.nextInt();
		System.out.println("EL factorial de " + num + "  es: " + factorial(num));
	}

	public static int factorial(int n) {

		if (n > 0) {
			return (n * factorial(n - 1));
		}
		return 1;
	}

}
