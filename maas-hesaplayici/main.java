import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Adı: ");
        String isim = girdi.nextLine();
        System.out.print("Maaşı: ");
        double maas = girdi.nextDouble();
        System.out.print("Çalışma Saati: ");
        int calismaSaati = girdi.nextInt();
        System.out.print("Başlangıç Yılı: ");
        int baslangicYili = girdi.nextInt();

        System.out.println("----------------------------");

        Employee calisan = new Employee(isim , maas ,calismaSaati , baslangicYili);
        calisan.toString();
    }
}
