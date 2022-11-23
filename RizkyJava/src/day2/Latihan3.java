package day2;

import java.util.Scanner;

public class Latihan3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("inputkan nama : ");
		String nama = kb.nextLine();
		
		System.out.print("inputkan cetak : ");
		int cetak = kb.nextInt();
		
		/*
		for(int i=0; i<cetak; i++) {
			System.out.println(nama);
		} 
		 */
		
		int i=0;
		while(i<cetak) {
			System.out.println(nama);
			i++;
		}
		
		kb.close();
	}

}
