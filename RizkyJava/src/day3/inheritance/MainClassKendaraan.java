package day3.inheritance;

public class MainClassKendaraan {

	public static void main(String[] args) {
		KendaraanDarat kd1 = new KendaraanDarat();
		KendaraanDarat kd2 = new KendaraanDarat();
		
		kd1.namaKendaraan = "Truck";
		kd2.namaKendaraan = "Bus";

		System.out.println("Nama Kendaraan 1 : " + kd1.namaKendaraan);
		System.out.print("Kendaraan 1 bergerak di : ");
		kd1.bergerakDI();
		System.out.println();
		System.out.println("Nama Kendaraan 2 : " + kd2.namaKendaraan);
		System.out.print("Kendaraan 2 bergerak di : ");
		kd1.bergerakDI();
		System.out.println();
	}
}
