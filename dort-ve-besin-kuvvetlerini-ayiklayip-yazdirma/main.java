import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Bir sayı giriniz: ");
        int sayi = girdi.nextInt();

        for(int i=1;i<sayi;i*=4){
            if((i%4==0)) {
                    System.out.println("4'ün kuvvetleri: "+i);
            }
        }

        for(int i=1;i<sayi;i*=5){
            if((i%5==0)) {
                System.out.println("5'in kuvvetleri: "+i);
            }
        }

    }
}   
