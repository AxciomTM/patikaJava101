import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);

		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
		double boy = girdi.nextDouble();
		if (boy>0 && boy<3){
			System.out.print("Lütfen kilonuzu giriniz: ");
			double kilo = girdi.nextDouble();
			if (kilo>0 && kilo<650){
				System.out.println("Vücut kitle indeksiniz: "+(kilo/(boy*boy)));
			} else{
				System.out.println("Geçerli bir boy giriniz!");
			}
		} else{
			System.out.println("Geçerli bir boy giriniz!");
		}		
	}
}

