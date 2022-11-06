import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args)
    {
        String kullanici, sifre;
        Scanner girdi = new Scanner(System.in);
        int hak = 3;
        int bakiye = 1500;
        int secim;
        while (hak > 0) {
            System.out.print("Kullanıcı Adınız:");
            kullanici = girdi.nextLine();
            System.out.print("Parolanız: ");
            sifre = girdi.nextLine();

            if (kullanici.equals("admin") && sifre.equals("password")) {
                System.out.println("Merhaba, Tekrar Hoşgeldiniz!");
                do {
                    System.out.println("""
                            1 - Para Yatırma
                            2 - Para Çekme
                            3 - Bakiye Sorgula
                            4 - Çıkış Yap""");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    secim = girdi.nextInt();
                    switch (secim) {
                        case 1 -> {
                            System.out.print("Para miktarı : ");
                            int price = girdi.nextInt();
                            bakiye += price;
                        }
                        case 2 -> {
                            System.out.print("Para miktarı : ");
                            int miktar = girdi.nextInt();
                            if (miktar > bakiye) {
                                System.out.println("Bakiye yetersiz.");
                            } else {
                                bakiye -= miktar;
                            }
                        }
                        case 3 -> System.out.println("Bakiyeniz : " + bakiye);
                        default -> System.out.println("Tekrar görüşmek üzere.");
                    }
                } while (secim != 4);

                break;
            } else {
                hak--;
                System.out.println("Hatalı kullanıcı adı veya şifre girdiniz. Lütfen tekrar deneyiniz.");
                if (hak == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + hak);
                }
            }
        }

    }
}
