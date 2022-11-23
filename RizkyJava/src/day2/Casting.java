package day2;

public class Casting {

	public static void main(String[] args) {
		int n1 = 10;
		long n2 = 1000;
		String xnilai = "100";
		
		System.out.println(n1);
		System.out.println(n2);
		
		n2 = n1;
		
		System.out.println(n1);
		System.out.println(n2);
		
		n1 = (int)n2;

		System.out.println(n1);
		System.out.println(n2);
		
		n1 = Integer.parseInt(xnilai);

		System.out.println(n1);
		System.out.println(n2);
	}

}
