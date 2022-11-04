import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Kümenin eleman sayısını giriniz: ");
        int n = girdi.nextInt();
        System.out.print("Seçim sayısını giriniz: ");
        int r = girdi.nextInt();

        int ntoplam=1;
        int rtoplam=1;
        int n_rtoplam=1;
        int n_r = n-r;

        for(int i = 1; i<=n ;i++){
            ntoplam*=i;
        }

        for(int i = 1; i<=r ;i++){
            rtoplam*=i;
        }

        for(int i = 1; i<=n_r ;i++){
            n_rtoplam*=i;
        }

        System.out.print("C("+n+","+r+"): "+((ntoplam)/(rtoplam*(n_rtoplam))));

    }
}   
