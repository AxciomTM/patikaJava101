import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Taban değeri giriniz: ");
        int taban = girdi.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int ust = girdi. nextInt();
        System.out.println("Sonuç: "+hesapla(taban, ust));
    }
    public static int hesapla(int x, int y) {
        int sonuc=1;
        if(y==1) {
            return x;
        } else if(y==0){
            return 1;
        } else{
            for(int i=1 ; i<=y ; i++){
                sonuc *= x;
            }
            return sonuc;
        }
    }
}
