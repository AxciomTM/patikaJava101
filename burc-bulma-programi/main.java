import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner girdi = new Scanner(System.in);
        System.out.print("Doğduğunuz ayı giriniz: ");
        int ay = girdi.nextInt();

        if (ay>0 && ay<=12){
            System.out.print("Doğduğunuz günü giriniz: ");
            int gun = girdi.nextInt(); 

            if(gun<=31){
                if (ay==1 && gun <= 21){
                    System.out.println("Oğlak burcusunuz.");

                    } else if (ay==1 && gun >= 21){
                    System. out.println("Kova burcusunuz.");

                    } else if (ay==2 && gun <= 19){
                    System.out.println("Kova burcusunuz.");

                    } else if (ay==2 && gun >= 19){
                        if (gun<=29){
                            System. out.println("Balık burcusunuz.");

                        } else {
                            System.out.println("Geçerli bir gün giriniz!");
                        }

                    } else if (ay==3 && gun <= 20){
                    System.out.println("Balık burcusunuz.");

                    } else if (ay==3 && gun >= 20){
                    System. out.println("Koç burcusunuz.");

                    } else if (ay==4 && gun <= 20){
                    System.out.println("Koç burcusunuz.");

                    } else if (ay==4 && gun >= 20){
                    System. out.println("Boğa burcusunuz.");

                    } else if (ay==5 && gun <= 21){
                    System.out.println("Boğa burcusunuz.");

                    } else if (ay==5 && gun >= 21){
                    System. out.println("İkizler burcusunuz.");

                    } else if (ay==6 && gun <= 22){
                    System.out.println("İkizler burcusunuz.");

                    } else if (ay==6 && gun >= 22){
                    System. out.println("Yengeç burcusunuz.");

                    } else if (ay==7 && gun <= 22){
                    System.out.println("Yengeç burcusunuz.");

                    } else if (ay==7 && gun >= 22){
                    System. out.println("Aslan burcusunuz.");

                    } else if (ay==8 && gun <= 22){
                    System.out.println("Aslan burcusunuz.");

                    } else if (ay==8 && gun >= 22){
                    System. out.println("Başak burcusunuz.");

                    } else if (ay==9 && gun <= 22){
                    System.out.println("Başak burcusunuz.");

                    } else if (ay==9 && gun >= 22){
                    System. out.println("Terazi burcusunuz.");

                    } else if (ay==10 && gun <= 22){
                    System.out.println("Terazi burcusunuz.");

                    } else if (ay==10 && gun >= 22){
                    System. out.println("Akrep burcusunuz.");

                    } else if (ay==11 && gun <= 21){
                    System.out.println("Akrep burcusunuz.");

                    } else if (ay==11 && gun >= 21){
                    System. out.println("Yay burcusunuz.");

                    } else if (ay==12 && gun <= 21){
                    System.out.println("Yay burcusunuz.");

                    } else if (ay==12 && gun >= 21){
                    System. out.println("Oğlak burcusunuz.");

                }

            } else {
                System.out.println("Geçerli bir gün giriniz!");
            }

            } else {
                System.out.println("Geçerli bir ay giriniz!");
            }
    }
}   
    
