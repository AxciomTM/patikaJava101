import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner girdi = new Scanner(System.in);
		double pi = 3.14;
		System.out.print("Dairenin yarıçapını giriniz: ");
		double a = girdi.nextDouble();
		double alan = 0;
		if (a>0){
			System.out.print("Merkez açısının ölçüsünü giriniz: ");
			double r = girdi.nextDouble();
			if (r>0){
				alan = (pi*(r*r)*a)/360;
				System.out.println("Dairenin alanı: "+alan);
			}else{
				System.out.println("Pozitif bir değer giriniz!");
			}
		} else{
			System.out.println("Pozitif bir değer giriniz!");
		}
	}
}

