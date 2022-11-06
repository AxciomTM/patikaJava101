import java.util.*;

public class Main {
    private static final Scanner girdi = new Scanner(System.in);
    public static void main(String[] args)
    {
        int q = girdi.nextInt();
        for (int i=1; i<=q;i++){
            int a= girdi.nextInt();
            int b= girdi.nextInt();
            int n= girdi.nextInt();
            int total=a;
            for (int j=0; j<n; j++){
                total +=(Math.pow(2,j)*b);
                System.out.print(total+" ");
            }
            System.out.println();
        }
    }
}
