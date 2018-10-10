package Zaj_1;

import java.util.Scanner;

public class zad2 {
	int liczba;
	private Scanner odczyt;
	
	public zad2(int a){
		liczba = a;
	}
	public zad2(){
		liczba = 0;
	}
	
	public void Podaj(){
		System.out.print("Podaj liczbe: ");
		odczyt = new Scanner(System.in);
		zad2.this.liczba = odczyt.nextInt();			
	}
	
		public static void main(String[] args){
		
			zad2[] tablica;
			tablica = new zad2[3];
			for (int i = 0; i < 3; i++){
				tablica[i] = new zad2();
				tablica[i].Podaj();
			}
		
			int suma = 0, i = 0;
		
			while ((i < 3) && (tablica[i].liczba != 13)){
				suma += tablica[i].liczba;	
				i++;
			}
			System.out.print("Suma liczb = "+suma);		
		}
}