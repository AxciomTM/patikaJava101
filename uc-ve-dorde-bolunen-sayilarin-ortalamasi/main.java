import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Bir sayı giriniz: ");
        int sayi = girdi.nextInt();
        int ucunkati=0;
        int dortunkati=0;
        int u=0, d=0;

        for(int i=1;i<sayi;i++){
            if((i%3)==0){
                ucunkati=ucunkati+i;
                u++;
            }
            if((i%4)==0){
                dortunkati+=dortunkati+i;
                d++;
            }
    }
        System.out.println("Üçe bölünen sayıların ortalaması: "+((double) ucunkati)/((double) u));
        System.out.println("Dörde bölünen sayıların ortalaması: "+((double) dortunkati)/((double) d));
    }
}   
