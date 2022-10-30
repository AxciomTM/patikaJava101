import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Mesafeyi (Km) giriniz: ");
        int kiloMetre = girdi.nextInt();

        System.out.println("Yolculuk tipini seçiniz:\nTek Yön (1)\nGidiş-Dönüş (2)");
        Byte secim = girdi.nextByte();

        if(secim==1 || secim==2){
            System.out.print("Yaşınızı giriniz: ");
            Byte yas = girdi.nextByte();
            if (yas>=0){
                if(yas<12){
                    double indirim = 0.5;
                    switch (secim){
                        case 1:
                        System.out.println("Toplam tutar: "+(kiloMetre*0.10*indirim));
                        break;
    
                        default:
                        System.out.println("Toplam tutar: "+(2*kiloMetre*0.10*indirim));
                        break;
                    }
                } else if (yas>=12 && yas<24){
                    double indirim = 0.9;
                    switch (secim){
                        case 1:
                        System.out.println("Toplam tutar: "+(kiloMetre*0.10*indirim));
                        break;
    
                        default:
                        System.out.println("Toplam tutar: "+(2*kiloMetre*0.10*indirim));
                        break;
                    }
                } else if (yas>=24 && yas<65){
                    double indirim = 1;
                    switch (secim){
                        case 1:
                        System.out.println("Toplam tutar: "+(kiloMetre*0.10*indirim));
                        break;
    
                        default:
                        System.out.println("Toplam tutar: "+(2*kiloMetre*0.10*indirim));
                        break;
                    }
                } else{
                    double indirim = 0.8;
                    switch (secim){
                        case 1:
                        System.out.println("Toplam tutar: "+(kiloMetre*0.10*indirim));
                        break;
    
                        default:
                        System.out.println("Toplam tutar: "+(2*kiloMetre*0.10*indirim));
                        break;
                    }
                }         
            } else {
                System.out.println("Geçerli bir yaş giriniz!");
            }
            

        } else{
            System.out.println("Geçerli bir seçenek seçiniz!");
        } 
    }
}   
    
