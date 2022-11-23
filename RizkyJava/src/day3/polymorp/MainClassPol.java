package day3.polymorp;

public class MainClassPol {

	public static void main(String[] args) {
		//overloading
		HitungLanjut hj = new HitungLanjut();
		hj.luas(2);
		hj.luas(2,5);
		
		//overiding = yg akan muncul adalah yg paling akhir (extends) -> di HitungLanjut
		hj.segitiga();
	}

}
