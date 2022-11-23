package day3.polymorp;

public class RumahLanjut extends Rumah {
	void cluster (int cluster, int diskon) {
		int harga = 1000000 - diskon;
		System.out.println("Harga : " + harga);
	}
	
	void susun() {
		System.out.println("Rumah Susun 2");
	}
}
