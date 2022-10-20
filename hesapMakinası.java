package myjavaprograms;
import java.util.Scanner ;


public class hesapMakinasý {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int number1, number2, selection ;
		
		// Sayý girdilerini alma
		System.out.print("Ýlk Sayýyý Giriniz: ");
		number1 = input.nextInt();
		
		System.out.print("Ýkinci Sayýyý Giriniz: ");
		number2 = input.nextInt();
		
		//Ýþlem girdisini alma
		
		System.out.println("1-Toplama 2-Çýkarma 3-Çarpma 4-Bölme");
		System.out.println("Seçiminiz: ");
		selection =input.nextInt();
		
		switch(selection) {
		
		case 1:
			System.out.println(number1 + number2);
			
			break;
		case 2:
			System.out.println(number1 - number2);
			
			break;
		case 3:
			System.out.println(number1 * number2);
			
			break;
		case 4:
			if(number2!=0)
				System.out.println(number1 / number2)  ;
			else
			System.out.println("ikinci sayý 0 olamaz. Tekrar Deneyiniz !");
			
			break;
		
		default:
			System.out.println("Yanlýþ bir iþlem numarasý girdiniz tekrar deneyiniz.");
			}
		
		System.out.println("ProgramEND");
		
		
		
		

		
		 
		

		

		

	}

}
