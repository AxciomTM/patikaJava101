import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Dizinin boyutu (n): ");
        int sayi = girdi.nextInt();
        int[] list = list = new int[sayi];
        System.out.println("Dizinin elemanlarını giriniz: ");
        for(int i = 0; i < list.length; i++){
            System.out.print((i+1)+". sayıyı giriniz: ");
            list[i]= girdi.nextInt();
        }
      //Insertion Sort Algoritması//
        for(int i = 1; i < list.length; i++) {
            int value = list[i];
            int j = i - 1;
            while(j >= 0 && list[j] > value) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = value;
        }
        System.out.print(Arrays.toString(list));
    }
}
