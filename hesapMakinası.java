package myjavaprograms;
import java.util.Scanner ;


public class hesapMakinas� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int number1, number2, selection ;
		
		// Say� girdilerini alma
		System.out.print("�lk Say�y� Giriniz: ");
		number1 = input.nextInt();
		
		System.out.print("�kinci Say�y� Giriniz: ");
		number2 = input.nextInt();
		
		//��lem girdisini alma
		
		System.out.println("1-Toplama 2-��karma 3-�arpma 4-B�lme");
		System.out.println("Se�iminiz: ");
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
			System.out.println("ikinci say� 0 olamaz. Tekrar Deneyiniz !");
			
			break;
		
		default:
			System.out.println("Yanl�� bir i�lem numaras� girdiniz tekrar deneyiniz.");
			}
		
		System.out.println("ProgramEND");
		
		
		
		

		
		 
		

		

		

	}

}
