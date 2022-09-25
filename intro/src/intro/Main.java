package intro;

public class Main {
        //Main javada başlangıç noktasıdır
	public static void main(String[] args) {
		System.out.println("Hello world!!!");
		
		String ortaMetin="İlgilinizi çekebilir";
		String altMetin="Vade süresi";
		System.out.println(ortaMetin);
		int vade=12;
		double dolarDun=18.10;
		double dolarBugun=18.15;
		boolean dolarDustumu=true;
		String okYonu="";
		if (dolarBugun<dolarDun) {
			okYonu="down.svg";
			System.out.println(okYonu);
		}else if (dolarBugun>dolarDun) {
			okYonu="up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu="equal.svg";
			System.out.println(okYonu);
		}
		
		String[] krediler= {"Hızlı kredi","Maaşın Halkbanktan","Mutlu Emekli"};
	    for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		for (String kredi : krediler) {
			System.out.println(kredi);
		}
		

	}

}
