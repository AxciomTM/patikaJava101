import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.print("Yıl giriniz: ");
        int yil = girdi.nextInt();
        if ((yil%4)==0){
            System.out.print(yil+" bir artık yıldır.");
        } else {
            System.out.print(yil+" bir artık yıl değildir.");
        }
    }
}   
    
