package day4.abstrac;

public abstract class Crud {
	
	int timeOut = 100;
	
	void cekdata() {
		
	}
	
	abstract void BuatKoneksi();
	abstract void TutupKoneksi();
	
}
