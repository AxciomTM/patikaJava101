import java.util.Scanner;


public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args){
        int n = girdi.nextInt();
        int[] list = list = new int[n];
        for(int i = 0; i < list.length; i++) {
            list[i] = girdi.nextInt();
        }
        for (int j : list) {
            System.out.println(j);
        }
    }
}
