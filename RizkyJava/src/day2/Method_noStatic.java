package day2;

public class Method_noStatic {
	
	public void cetak() {
		System.out.println("Cetak dari method");
	}
	
	public static void main(String[] args) {
		System.out.println("Mulai");
		//construc
		Method_noStatic mn = new Method_noStatic();
		mn.cetak();
		mn.cetak2();
		System.out.println("Selesai");
	}
	
	public void cetak2() {
		System.out.println("dari bawah");
	}

}
