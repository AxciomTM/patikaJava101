import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner girdi = new Scanner(System.in);
        String username = "java";
        String password = "1234";

        System.out.print("Kullanıcı adınızı giriniz: ");
        String user = girdi.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        String pass = girdi.nextLine();

        if (user.equals(username)){
            if (pass.equals(password)){
                System.out.println("Giriş başarılı!");
            }else{
                System.out.println("Şifre hatalı!");
                System.out.println("Şifrenizi yenilemek isterseniz \"yenile\" yazınız.");
                String inp = girdi.nextLine();
                if(inp.equals("yenile")){
                    System.out.print("Yeni şifrenizi giriniz: ");
                    String newPass = girdi.nextLine();
                    if (newPass.equals(password)){
                        System.out.println("Şifreniz, bir önceki şifreniz ile aynı olamaz!");
                    } else {
                        password = newPass;
                        System.out.println("Şifreniz değiştirildi!");
                    }
                } else {
                    System.out.println("Giriş yapılamadı...");
                }
            }
        } else{
            System.out.println("Kullanıcı adı hatalı!");
        }
    }
}
