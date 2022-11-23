package day3;

public class ArrayEx {

	public static void main(String[] args) {
		String[]nama = new String[5];
		String[]kota =  {"A","B","C"};
		
		nama[0]="Rizky";
		
		for(int index=0;index<kota.length;index++)
		{
			System.out.println("kota ke- "+index );
			System.out.println(kota[index]);
			
		}
		
		for(int index=0;index<nama.length;index++)
		{
			System.out.println("Nama ke- "+index );
			System.out.println(nama[index]);
			
			
		}
		
	}

}
