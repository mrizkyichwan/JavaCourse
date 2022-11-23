package day2;

import java.util.Scanner;

public class Latihan1 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("inputkan bilangan : ");
		int bilangan = kb.nextInt();
		String hasil = "";
		
		if(bilangan <= 5) {
			System.out.println("bilangan tidak di hitung");
		}else {
			if(bilangan%2==0) {
				hasil = "Genap";
			}else {
				hasil = "Ganjil";
			}
			System.out.println("bilangan " + bilangan + " merupakan " + hasil);
		}
		kb.close();
	}

}
