package day3;

import java.util.Scanner;

public class Latihan2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int[]aDeret= {3,2,1,4,5,6,9,8};
		
		System.out.print("Cari bilangan ? ");
		int cariBil=kb.nextInt();
		boolean ada=false;
		
		for(int i=0;i<aDeret.length;i++) {
			if(aDeret[i]==cariBil) {
				ada=true;
				break; // keluar dari loop
			}
		}
		
		if(ada==true) {
			System.out.println("Bilangan " + cariBil + " ada dalam array");
		}else {
			System.out.println("Bilangan " + cariBil + " tidak ada dalam array");
		}
		kb.close();
	}
}
