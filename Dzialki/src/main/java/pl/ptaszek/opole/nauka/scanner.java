package pl.ptaszek.opole.nauka;
import java.util.Scanner;
public class scanner {
	public static void main(String[] args) {
		double a;
		double b;
		Scanner odczyt = new Scanner(System.in);
		
		System.out.println("Podaj a: ");
		a=odczyt.nextDouble();
		System.out.println("Podaj b: ");
		b=odczyt.nextDouble();
		
		System.out.println("a+b="+(a+b));
		System.out.println("a-b="+(a-b));
		System.out.println("a*b="+(a*b));
		System.out.println("a/b="+(a/b));
	}
}
