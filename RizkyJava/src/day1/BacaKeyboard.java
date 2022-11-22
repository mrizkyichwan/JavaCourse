package day1;

import java.util.Scanner;

public class BacaKeyboard {

	public static void main(String[] args) {
		// deklarasi var baca keyboard
		Scanner baca = new Scanner(System.in);
		
		System.out.print("inputkan nama : ");
		String nama = baca.nextLine();
		
		System.out.print("inputkan nilai : ");
		int nilai = baca.nextInt(); // read keyboard int
		
		System.out.println("Nama : " + nama);
		System.out.println("Nilai : " + nilai);
		baca.close();
	}

}
