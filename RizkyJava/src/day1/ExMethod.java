package day1;

public class ExMethod {
	
	static void cetak(String nama, String alamat, int umur) {
		System.out.println("cetak dari nama, alamat, umur = " + nama + ", " + alamat + ", " + umur);
	}
	
	static String cetak2() {
		return "H20";
	}
	
	public static void main(String[] args) {
		//int nilai = 10;
		String nama = "Rizky";
		String alamat = "Pondok Gede";
		int umur = 30;
		
		System.out.println("Start");
		cetak(nama,alamat,umur);
		String hasil = cetak2();
		System.out.println(hasil);
		System.out.println("End");
	}

}
