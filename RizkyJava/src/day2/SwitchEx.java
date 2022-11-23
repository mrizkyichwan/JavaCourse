package day2;

public class SwitchEx {

	public static void main(String[] args) {
		String lampu = "grey";
		
		switch(lampu) {
			case "red" :
				System.out.println("berhenti");
				break;
			case "yellow" :
				System.out.println("bersedia");
				break;
			case "green" :
				System.out.println("jalan");
				break;
			default :
				System.out.println("lampu rusak");
		}
	}

}
