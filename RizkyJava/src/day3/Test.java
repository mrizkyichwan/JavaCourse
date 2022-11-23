package day3;

public class Test {

	public static void main(String[] args) {
		//deklar array
		String[]nama = new String[5];
		String[]kota = {"Semarang","Banten","Surabaya"};
		
		//isi
		nama[0] = "Aldo";
		//nama[5] = "wawan";
		for(int i=0;i<nama.length;i++) {
			nama[i] = "isi " + i;
		}
		
		//panggil
		for(int i=0;i<kota.length;i++) {
			System.out.println(kota[i]);
		}
		System.out.println();
		for(int i=0;i<nama.length;i++) {
			System.out.println(nama[i]);
		}
		
		System.out.println(nama[0]);
		//System.out.println(nama[6]);
		System.out.println(kota[0]);
	}

}
