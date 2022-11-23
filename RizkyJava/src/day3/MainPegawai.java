package day3;

public class MainPegawai {

	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println();
		
		Pegawai pegawai1 = new Pegawai();
		Pegawai pegawai2 = new Pegawai();
		
		pegawai1.nama = "Rizky";
		pegawai1.alamat = "Bekasi";
		pegawai2.nama = "Kiano";
		pegawai2.alamat = "Jakarta";
		
		System.out.println("Nama Pegawai 1 : " + pegawai1.nama);
		System.out.println("Alamat Pegawai 1 : " + pegawai1.alamat);
		System.out.print("Berangkat dengan : ");
		pegawai1.kendaraan1();
		System.out.println();
		
		System.out.println("Nama Pegawai 2 : " + pegawai2.nama);
		System.out.println("Alamat Pegawai 2 : " + pegawai2.alamat);
		System.out.print("Berangkat dengan : ");
		pegawai1.kendaraan2();
		System.out.println();
		
		System.out.println("End");
	}

}
