import java.util.Scanner;

public class AdijacentNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String number = sc.nextLine();
            if (Adijacent(number)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }

    public static boolean Adijacent(String number) {
        for (int i = 0; i < number.length() - 1; i++) {
            int diff = Math.abs(number.charAt(i) - number.charAt(i + 1));
            if (diff != 1) {
                return false;
            }
        }
        return true;
    }
}
