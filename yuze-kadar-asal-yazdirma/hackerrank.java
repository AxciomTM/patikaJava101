import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        byte sayac=1;
        do{
            System.out.println(N+" x "+sayac+" = "+(sayac*N));
            sayac++;
        }while(sayac<=10);
    }
}
