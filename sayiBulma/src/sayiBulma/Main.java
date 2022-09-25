package sayiBulma;

public class Main {

	public static void main(String[] args) {
		 int[] sayilar=new int[] {1,2,3,4,5,6,7,8,9};
		 int aranacak=54;
		 boolean varMi=false;
		 
		 for (int sayi : sayilar) {
			if (sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		 if (varMi) {
			System.out.println("sayi mevcut...");
		} else {
			System.out.println("Sayi mevcut değil...");

		}

	}

}
