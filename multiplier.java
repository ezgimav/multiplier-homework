package ezgi;
import java.util.*;
public class Carpan {

	public static void main(String[] args) {
		// Bu program, kullanıcıdan alınan pozitif sayının çarpanlarını bulur ve ekrana basar..
		
		
	Scanner sayi1 = new Scanner (System.in);
		System.out.println("Carpanlarını bulmak istediginiz pozitif sayiyi giriniz: ");
		int s = sayi1.nextInt();
		
		
		for (int i=1; i<=s; i++) {
			
			 if (s > 0 && s%i == 0) {
	 
				System.out.println(i+ " girdiginiz sayinin bir carpanidir");
				
				}
	
		}

			}
		
		
}

