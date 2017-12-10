package pl.ptaszek.opole.nauka;
import java.util.Scanner;

public class porownanie {
	public static void main(String[] args) {
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Podaj pierwsz¹ liczbê");
		int a= odczyt.nextInt();
		System.out.println("Podaj drug¹ liczbê");
		int b= odczyt.nextInt();
		
	if(a==b)
	System.out.println("a jest równe b");
	else if (a>b)
	System.out.println("a jest wiêksze od b");
	else
	System.out.println("a jest mniejsze od b");
	
	}
}
