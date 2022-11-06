import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Eleman sayısını giriniz: ");
        int eleman = girdi.nextInt();
        int sayac=2, sayi1=0, sayi2=1, sayi3;
        System.out.println(eleman+" elemanlı fibonacci serisi aşağıdaki gibidir;");
        do{
            sayi3=sayi1+sayi2;
            System.out.print(sayi1 + " + " +sayi2 + " = "+sayi3);
            sayi1=sayi2;
            sayi2=sayi3;
            System.out.println();
            sayac++;
        }while(sayac<=eleman);
    }
}
