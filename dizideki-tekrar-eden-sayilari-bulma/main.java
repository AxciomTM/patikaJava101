import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Diziye girilecek sayı adedi: ");
        int sayi = girdi.nextInt();
        int[] list = list = new int[sayi];
        for(int i = 0; i < list.length; i++){
            System.out.print((i+1)+". sayıyı giriniz: ");
            list[i]= girdi.nextInt();
        }
        int [] kopya  = new int[sayi];
        int sayac = 0;
        Arrays.sort(list);

        for (int i =0; i<list.length-1; i++) {
            if (list[i]==list[i+1]){
                kopya[sayac++] = list[i];
            }
        }
        System.out.print("Tekrar Eden çift Sayılar:");
        for (int i=0;i<kopya.length-1;i++){
            int gecici = kopya[i];
            if ( (gecici != kopya[i+1]) && (gecici%2==0) ){
                System.out.print(" "+gecici);
            }
        }
    }
}
