package mukkemelSayi;

public class Main {

	public static void main(String[] args) {
		/*
		 * int number =28; 
		 * int total=0; 
		 * for (int i = 1; i < number; i++) { 
		 * if (number%i==0) { 
		 * total=total+i; } 
		 * } 
		 * if (total==number) {
		 * System.out.println("Mükemmel sayıdır..."); } 
		 * else {
		 * System.out.println("Mükemmel sayı değildir..."); }
		 */
		
		for (int j = 1; j < 100000000; j++) {
			 int number =j; 
			  int total=0; 
			  for (int i = 1; i < number; i++) { 
			  if (number%i==0) { 
			  total=total+i; } 
			  } 
			  if (total==number) {
			  System.out.println(j+" Mükemmel sayıdır..."); } 
			 
		}
		 
		 

	}

}
