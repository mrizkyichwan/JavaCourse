package day3.inheritance;

public class MainClassBuku {

	public static void main(String[] args) {
		BukuPelajaran bp1 = new BukuPelajaran();
		BukuPelajaran bp2 = new BukuPelajaran();
		
		bp1.nmBuku = "IPA";
		bp2.nmBuku = "IPS";

		System.out.println("Nama Buku 1 : " + bp1.nmBuku);
		System.out.print("Buku 1 dijual di : ");
		bp1.dijualDI();
		System.out.println();
		
		System.out.println("Nama Buku 2 : " + bp2.nmBuku);
		System.out.print("Buku 2 dijual di : ");
		bp1.dijualDI();
		System.out.println();
	}

}
