package day2;

import java.util.Scanner;

public class Latihan4 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		System.out.print("inputkan bilangan : ");
		int bilangan = kb.nextInt();
		
		int n = 1, gn = 2, gj = 1;
		System.out.println("Deret bulat ");
		for(int i=0; i<bilangan; i++) {
			if(i<bilangan-1) {
				System.out.print(n +", ");
			}else {
				System.out.print(n +" ");
			}
			n++;
		}
		
		System.out.println();
		System.out.println("Deret genap ");
		for(int i=0; i<bilangan; i++) {
			if(i==bilangan-1) {
				System.out.print(gn +" ");
			}else {
				System.out.print(gn +", ");
			}
			gn +=2;
		}
		
		System.out.println();
		System.out.println("Deret ganjil ");
		for(int i=0; i<bilangan; i++) {
			if(i==bilangan-1) {
				System.out.print(gj +" ");
			}else {
				System.out.print(gj +", ");
			}
			gj +=2;
		}
		
		kb.close();
	}

}
