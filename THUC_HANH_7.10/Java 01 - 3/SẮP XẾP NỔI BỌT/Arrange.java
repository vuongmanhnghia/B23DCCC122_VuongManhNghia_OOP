import java.util.Scanner;

public class Arrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr, n);
        sc.close();
    }
    
    public static void bubbleSort(int[] arr, int n) {
        boolean swapped; 
        int step = 1;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Hoán đổi 2 phần tử
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // In ra mảng sau mỗi bước sắp xếp nếu có sự hoán đổi
            if (swapped) {
                System.out.print("Buoc " + step + ": ");
                printArray(arr, n);
                step++;
            } else {
                break;
            }
        }
    }

    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
