package day3.polymorp;

public class MainRumah {

	public static void main(String[] args) {
		//overloading
		RumahLanjut RL = new RumahLanjut();
		RL.cluster(1);
		RL.cluster(1,500000);
		
		//overiding = yg akan muncul adalah yg paling akhir (extends) -> di HitungLanjut
		RL.susun();
	}
}
