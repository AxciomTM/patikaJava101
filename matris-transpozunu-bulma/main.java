import java.util.Scanner;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);

    public static void matrisAl(int[][] array) {
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(array[i][j]+"    ");
            }
            System.out.println();
        }

    }
    public static void transpozeAl(int[][] array) {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(array[j][i]+"    ");
            }
            System.out.println();
        }

    }

    public static void matrisTanimla(int[][] array) {
        System.out.println("İlk satırdaki elemanları giriniz;");
        for(int i = 0; i < 3; i++){
            System.out.print((i+1)+". sayıyı giriniz: ");
            array[0][i]= girdi.nextInt();
        }
        System.out.println("İkinci satırdaki elemanları giriniz;");
        for(int i = 0; i < 3; i++){
            System.out.print((i+1)+". sayıyı giriniz: ");
            array[1][i]= girdi.nextInt();
        }
    }

    public static void main(String[] args) {
        int[][] matris = new int[2][3];
        matrisTanimla(matris);
        System.out.println("Matris;");
        matrisAl(matris);
        System.out.println("Transpoze;");
        transpozeAl(matris);
    }
}
