package day3;

public class StringOpEx {

	public static void main(String[] args) {
		String nama = "xsis Adm";
		//panjang string
		System.out.println(nama.length());
		
		//replace
		String email = "www.xsis.co.id";
		email = email.replace("www", "");
		System.out.println(email);
		email = email.replace(".", "");
		System.out.println(email);
		
		//substring
		String alamat = "jalan pakubuono 3";
		System.out.println(alamat.substring(2));
		System.out.println(alamat.substring(0,5));
		System.out.println(alamat.substring(6,15));
		
		//split
		String namaPanjang = "arnold suasana segar";
		System.out.println(namaPanjang.split(" "));
		String[]aNP=namaPanjang.split(" ");
		System.out.println(aNP.length);
		System.out.println(aNP[1]);
		
		//split per karakter
		String title = "JavaFramework";
		String[]aTitle = title.split("");
		System.out.println(aTitle[3]);
	}
}
