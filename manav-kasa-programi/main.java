import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5;

		System.out.print("Armut kaç kilo?: ");
		double a = girdi.nextDouble();
		if (a>0){
			System.out.print("Elma kaç kilo?: ");
			double b = girdi.nextDouble();
			if (b>0){
				System.out.print("Domates kaç kilo?: ");
				double c = girdi.nextDouble();
				if (c>0){
					System.out.print("Muz kaç kilo?: ");
					double d = girdi.nextDouble();
					if(d>0){
						System.out.print("Patlıcan kaç kilo?: ");
						double e = girdi.nextDouble();
						if (e>0){
							double toplam = a+b+c+d+e;
							System.out.println("Toplam tutar: "+toplam);
								} else{
									System.out.println("Geçerli bir miktar giriniz!");
							}
						} else{
							System.out.println("Geçerli bir miktar giriniz!");
						}
					} else{
						System.out.println("Geçerli bir miktar giriniz!");
					}
				} else{
					System.out.println("Geçerli bir miktar giriniz!");
				}
			}else{
				System.out.println("Geçerli bir miktar giriniz!");
			}
	} 
}

