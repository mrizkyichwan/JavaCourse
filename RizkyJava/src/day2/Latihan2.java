package day2;

import java.util.Scanner;

public class Latihan2 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		System.out.print("inputkan huruf : ");
		String huruf = kb.nextLine();
		huruf = huruf.toUpperCase();
		String hasil = "";
		
		/*
		if(huruf.equals("A") || huruf.equals("I") || huruf.equals("U") || huruf.equals("E") || huruf.equals("O")){
			hasil = "Huruf " + huruf + " merupakan vokal";
		}else{
			hasil = "Huruf " + huruf + " merupakan konsonan";
		}
		*/
		
		switch(huruf) {
			/*
			 case "A" :
			 case "I" :
			 case "U" :
			 case "E" :
			 case "O" :
			 	hasil = "Huruf " + huruf + " merupakan vokal";
				break;
			default :
				hasil = "Huruf " + huruf + " merupakan konsonan";
			 */
			
			case "A" :
				hasil = "Huruf " + huruf + " merupakan vokal";
				break;
			case "I" :
				hasil = "Huruf " + huruf + " merupakan vokal";
				break;
			case "U" :
				hasil = "Huruf " + huruf + " merupakan vokal";
				break;
			case "E" :
				hasil = "Huruf " + huruf + " merupakan vokal";
				break;
			case "O" :
				hasil = "Huruf " + huruf + " merupakan vokal";
				break;
			default :
				hasil = "Huruf " + huruf + " merupakan konsonan";
		}
		System.out.println(hasil);
		kb.close();
	}

}
