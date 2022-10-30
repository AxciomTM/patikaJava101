import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int a = girdi.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int b = girdi.nextInt();
        System.out.print("Üçüncü sayıyı giriniz: ");
        int c = girdi.nextInt();

        if (a>b && a>c){
            if(b>c){
                System.out.println(a + " > " + b + " > " + c);
            } else{
                System.out.println(a + " > " + c + " > " + b);
            }
        } else if(b>a && b>c){
            if(a>c){
                System.out.println(b + " > " + a + " > " + c);
            } else{
                System.out.println(b + " > " + c + " > " + a);
            }
            }else{
                if(a>b){
                    System.out.println(c + " > " + a + " > " + b);
                } else{
                    System.out.println(c + " > " + b + " > " + a);
                }
        }
    }
}   
    
