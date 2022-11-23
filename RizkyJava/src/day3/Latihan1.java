package day3;

import java.util.Scanner;

public class Latihan1 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		System.out.print("Masukkan jumlah ikan : ");
		int jml = read.nextInt();
		
		String[]ikan= new String[jml];
		read.nextLine();	
		for(int index=0;index<ikan.length;index++)
		{
			System.out.print("ikan ke - "+index+" : " );
			//ikan[index] = read.nextLine();
			ikan[index] = read.nextLine();
			
		}
		System.out.println("HASIL :");
	for(int index=0;index<ikan.length;index++)
		{
		System.out.print("hasil ikan ke- "+index+" : " );
		System.out.println(ikan[index]);
			
		}
		
		read.close();
	}

}
