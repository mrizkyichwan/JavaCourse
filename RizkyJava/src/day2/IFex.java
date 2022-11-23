package day2;

public class IFex {
	
	// CTRL SHIFT F untuk merapikan
	
	public static void main(String[] args) {
		System.out.println("awal");
		int nilai = 10;
		int point = 6;
		
		// if sebaris
		if(point>5) System.out.println("tinggi");
		
		// jika point 5 maka lulus, jika tidak gagal
		if (point == 5) {
			System.out.println("lulus");
		} else {
			System.out.println("gagal");
		}

		// jika nilai berisi 10 maka cetak sepuluh
		if (nilai == 10) {
			System.out.println("sepuluh");
		}

		if (true) {
			System.out.println("benar");
		}
		System.out.println("akhir");
	}

}
