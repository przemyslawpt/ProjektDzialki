package pl.ptaszek.opole.nauka;
import java.util.Scanner;

public class porownanie {
	public static void main(String[] args) {
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Podaj pierwsz� liczb�");
		int a= odczyt.nextInt();
		System.out.println("Podaj drug� liczb�");
		int b= odczyt.nextInt();
		
	if(a==b)
	System.out.println("a jest r�wne b");
	else if (a>b)
	System.out.println("a jest wi�ksze od b");
	else
	System.out.println("a jest mniejsze od b");
	
	}
}
