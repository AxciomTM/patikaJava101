import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Üssü alınacak sayıyı giriniz: ");
        int sayi = girdi.nextInt();
        System.out.print("Alınacak kuvveti giriniz: ");
        int kuvvet = girdi.nextInt();
        int sonuc=0;
        if(kuvvet==1) {
            System.out.println(sayi+" sayısının"+kuvvet+". kuvveti: "+sayi);
        } else if(kuvvet==0){
            System.out.println(sayi+" sayısının"+kuvvet+". kuvveti: 1");
        } else{
            for(int i=1 ; i<=kuvvet ; i++){
                sonuc = sayi*sayi;
            }
            System.out.println(sayi+" sayısının"+kuvvet+". kuvveti: "+sonuc);
        }
    }
}   
