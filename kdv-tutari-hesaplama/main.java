import java.util.Scanner;

public class Demo {
    public static void main(String[] args)
    {
        Scanner girdi;
        girdi= new Scanner(System.in);
        float anapara;
        float kdv = 0;
        System.out.println("Kredi miktarını giriniz: ");
        anapara = girdi.nextFloat();
        if(anapara<1000 && anapara>0){
            kdv = (anapara/100)*18;
            System.out.println("KDV'siz Fiyat: "+anapara+"TL");
            System.out.println("KDV'li Fiyat: "+(anapara+kdv)+"TL");
            System.out.println("KDV tutarı: "+kdv+"TL");
        }else if (anapara>=1000){
            kdv = (anapara/100)*8;
            System.out.println("KDV'siz Fiyat: "+anapara+"TL");
            System.out.println("KDV'li Fiyat: "+(anapara+kdv)+"TL");
            System.out.println("KDV tutarı: "+kdv+"TL");
        }else {
            System.out.println("Geçerli bir miktar giriniz!");
        }
    }
}
