package Zaj_1;
import java.util.*;


public class zad1 {
	int liczba;
	private Scanner odczyt;
	
	public zad1( int a){
		liczba = a;
	}
	public zad1(){
		liczba = 0;
	}
	
	public void Podaj(){
		System.out.print("Podaj liczbe: ");
		odczyt = new Scanner(System.in);
		zad1.this.liczba = odczyt.nextInt();			
	}
	
	static boolean isTeen(int wartosc){
		if ((wartosc >= 13 ) && (wartosc <= 19 ))
		return true;
		else return false;
	}
	
	
		public static void main(String[] args){
		
			zad1 Num1 = new zad1();
			Num1.Podaj();
			zad1 Num2 = new zad1();
			Num2.Podaj();
		
			if ((isTeen(Num1.liczba)) != (isTeen(Num2.liczba)))
				System.out.print("Teen");
		}
}
