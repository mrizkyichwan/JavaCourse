package day2;

public class TryEx {

	public static void main(String[] args) {
		System.out.println("start");
		int hasil = 0;
		try {
			hasil = 100/0;
		}catch(Exception e){
			System.out.println(e);
		}
		System.out.println(hasil);
		System.out.println("end");
	}

}
