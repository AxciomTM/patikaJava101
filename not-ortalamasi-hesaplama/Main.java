import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner girdi = new Scanner(System.in);
        Byte matematik, fizik, kimya, turkce, tarih, muzik;
        double toplam = 0;
        System.out.println("Matematik notunuzu giriniz: ");
        matematik = girdi.nextByte();

        System.out.println("Kimya notunuzu giriniz: ");
        kimya = girdi.nextByte();

        System.out.println("Türkçe notunuzu giriniz: ");
        turkce = girdi.nextByte();

        System.out.println("Tarih notunuzu giriniz: ");
        tarih = girdi.nextByte();

        System.out.println("Müzik notunuzu giriniz: ");
        muzik = girdi.nextByte();

        System.out.println("Fizik notunuzu giriniz: ");
        fizik = girdi.nextByte();

        if (matematik<=100 || matematik>=0){
            if (fizik<=100 || fizik>=0){
                if (kimya<=100 || kimya>=0){
                    if (turkce<=100 || turkce>=0){
                        if(tarih<=100 || tarih>=0){
                            if(muzik<=100 ||muzik>=0){
                                toplam = ((double) (matematik+muzik+tarih+turkce+kimya+fizik)/6);
                                System.out.println("Not ortalamanız: "+toplam);
                                if (toplam > 60){
                                    System.out.println("Tebrikler! Sınıfı geçtiniz!");
                                }else{
                                    System.out.println("Sınıfta kaldınız.");
                                }
                            }else{
                                System.out.println("Geçerli bir not giriniz!");
                            }

                        }else{
                            System.out.println("Geçerli bir not giriniz!");
                        }

                    }else{
                        System.out.println("Geçerli bir not giriniz!");
                    }

                }else{
                    System.out.println("Geçerli bir not giriniz!");
                }

            }else{
                System.out.println("Geçerli bir not giriniz!");
            }

        } else{
            System.out.println("Geçerli bir not giriniz!");
        }

    }   
    
}
