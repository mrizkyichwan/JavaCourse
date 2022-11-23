package day3;

import java.util.Scanner;

public class Latihan3 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("Input Nama ? ");
		String Nama = kb.nextLine();
		String[]aNama = Nama.split(" ");
		
		for(int i=0;i<aNama.length;i++) {
			//System.out.println(aNama[i]);
			//System.out.println(aNama[i].substring(0,1));
			
			//String awal = aNama[i].substring(0,1);
			//System.out.println(awal.toUpperCase());
			
			//String first = aNama[i].substring(0,1);
			//String middle = aNama[i].substring(1);
			//System.out.println(first.toUpperCase() + middle);
			
			String awal = aNama[i].substring(0,1);
			String akhir = aNama[i].substring(aNama[i].length()-1);
			System.out.println(awal.toUpperCase() + " " + akhir.toUpperCase());
			
		}
		
		/*
		// versi mas fathan
		
		for (int i = 0; i < aNama.length; i++) {
			String hd = aNama[i].substring(0,1).toUpperCase();
			String hs = aNama[i].substring(1);
			System.out.println(hd+hs);
		}
		
		for (int i = 0; i < aNama.length; i++) {
			String hd = aNama[i].substring(0,1).toUpperCase();
			String hb = aNama[i].substring(aNama[i].length()-1).toUpperCase();
			System.out.println(hd+ " " + hb);
		}
		*/
		
		kb.close();
	}

}
