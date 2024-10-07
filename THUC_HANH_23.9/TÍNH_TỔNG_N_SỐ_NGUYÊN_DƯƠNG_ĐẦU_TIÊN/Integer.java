import java.util.Scanner;

public class Integer {

    public static long sum(long n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for (int i = 0; i < x; i++) {
            long n = sc.nextInt();
            System.out.println(sum(n));
        }
        
        sc.close();
    }
}