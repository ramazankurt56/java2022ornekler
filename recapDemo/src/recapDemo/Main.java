package recapDemo;

public class Main {

	public static void main(String[] args) {
		int sayi1=20;
		int sayi2=21;
		int sayi3=22;
		int enbuyuk=sayi1;
		
		if (enbuyuk<sayi2) {
			enbuyuk=sayi2;
		}
		if (enbuyuk<sayi3) {
			enbuyuk=sayi3;
		}
		System.out.println("En büyük sayı :"+enbuyuk);

	}

}
