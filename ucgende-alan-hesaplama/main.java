import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    Scanner girdi = new Scanner(System.in);
	    System.out.println("Üçgenin köşelerini giriniz: ");
	    int a = girdi.nextInt();
	    int b = girdi.nextInt();
	    int c = girdi.nextInt();
	    
	    int eksiab = Math.abs(a-b);
	    int eksiac = Math.abs(a-c);
	    int eksibc = Math.abs(b-c);
	    
	    int artiab = Math.abs(a+b);
	    int artiac = Math.abs(a+c);
	    int artibc = Math.abs(b+c);

        if (eksiab<c && c<artiab){
            if (eksiac<b && b<artiac){
                if (eksibc<a && a<artibc){
                    int u = ((a+b+c)/2);
	                double alan = ((double) (u*(u-a)*(u-b)*(u-c)) );
	                double sonuc = Math.sqrt(alan);
	                System.out.println("Üçgenin alanı: "+sonuc);
                } else {
                    System.out.println("Geçersiz bir üçgen girdiniz!");
                }
            } else {
                System.out.println("Geçersiz bir üçgen girdiniz!");
            }
        } else {
            System.out.println("Geçersiz bir üçgen girdiniz!");
        }


	}
}

