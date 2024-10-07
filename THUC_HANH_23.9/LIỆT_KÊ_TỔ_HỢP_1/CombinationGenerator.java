import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationGenerator {

    public static void generateCombinations(int N, int K) {
        List<Integer> combination = new ArrayList<>();
        backtrack(combination, 1, N, K);
    }

    private static void backtrack(List<Integer> combination, int start, int N, int K) {
        if (combination.size() == K) {
            for (int num : combination) {
                System.out.print(num + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= N; i++) {
            combination.add(i);
            backtrack(combination, i + 1, N, K);
            combination.remove(combination.size() - 1);
        }
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        generateCombinations(N, K);
        int totalCombinations = factorial(N) / (factorial(K) * factorial(N - K));
        System.out.println("Tong cong co " + totalCombinations + " to hop");
        
        scanner.close();
    }
}
