package Zaj_1;
import java.util.Scanner;

public class zad3 {
	int liczba;
	private Scanner odczyt;
		
	public zad3(int a){
			liczba = a;
	}
	public zad3(){
		liczba = 0;
	}
	
	public void Podaj(){
		System.out.print("Podaj liczbe: ");
		odczyt = new Scanner(System.in);
		zad3.this.liczba = odczyt.nextInt();			
	}
		
	static Scanner odczyt2;	
 
		public static void main(String[] args){
			
			System.out.print("Podaj ilosc liczb: ");
			odczyt2 = new Scanner(System.in);
			int DlugTab = odczyt2.nextInt();
			
			zad3[] tablica;
			tablica = new zad3[DlugTab];
			for (int i = 0; i <DlugTab; i++){
				tablica[i] = new zad3();
				tablica[i].Podaj();
			}
			
			for (int i = 0; i < DlugTab; i++){
				if((tablica[i].liczba == 1) && ((i+2) < DlugTab) && (tablica[i+1].liczba == 2) && (tablica[i+2].liczba == 3))
				System.out.print("True - wystepuje ciag liczb 1 -> 2 -> 3 ");	
			}
		}
}