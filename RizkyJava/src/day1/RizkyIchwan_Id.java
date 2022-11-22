package day1;

import java.util.Scanner;

public class RizkyIchwan_Id {

	public static void main(String[] args) {
		Scanner baca = new Scanner(System.in);
		
		System.out.print("inputkan nama : ");
		String nama = baca.nextLine();
		
		System.out.print("inputkan alamat : ");
		String alamat = baca.nextLine();
		
		System.out.print("inputkan umur : ");
		int umur = baca.nextInt();
		
		System.out.println("\nData input Nama : " + nama + ", Alamat : " + alamat + ", Umur : " + umur + "Th");
		baca.close();
	}
}
