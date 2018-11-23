import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        int count = 0;

        int[] register = new int[100];
        for (int r: register) {
            r = 0;
        }

        for (int s: ar) {
            register[s-1] += 1;
        }

        for (int r: register) {
            count += r/2;
        }

        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        System.out.println(String.format("socks:%d", sockMerchant(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20})));
    }
}
