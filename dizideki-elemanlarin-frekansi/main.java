import java.util.Arrays;

public class Main {
    static boolean ignore(int[] arr, int value, int c) {
        for (int i = 0; i < c; i++) {
            if (value == arr[i]) {
                return false;
            }
        }
        return true;
    }

    static int equalCount(int[] arr, int value) {
        int count = 0;
        for (int i : arr) {
            if (i == value)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.println("Tekrar Sayıları");

        for (int i = 0; i < list.length; i++) {
            if (ignore(list, list[i], i)) {
                System.out.println(list[i] + " sayısı " + equalCount(list, list[i]) + " kez tekrar edildi.");
            }
        }
    }
}
