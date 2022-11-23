package day3;

public class MainIkan {

	public static void main(String[] args) {
		System.out.println("Start");
		System.out.println();
		
		Ikan ikan1 = new Ikan();
		Ikan ikan2 = new Ikan();
		
		ikan1.nama = "Tongkol";
		ikan1.habitat = "Laut";
		ikan2.nama = "Lele";
		ikan2.habitat = "Tawar";

		System.out.println("Nama Ikan 1 : " + ikan1.nama);
		System.out.println("Habitat Ikan 1 : " + ikan1.habitat);
		System.out.print("Bernafas : ");
		ikan1.bernafas();
		System.out.println();
		
		System.out.println("Nama Ikan 2 : " + ikan2.nama);
		System.out.println("Habitat Ikan 2 : " + ikan2.habitat);
		System.out.print("Bernafas : ");
		ikan2.bernafas();
		System.out.println();
		
		System.out.println("End");
	}

}
