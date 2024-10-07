import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        
        if (length <= 0 || width <= 0) {
            System.out.println(0);
        } else {
            int perimeter = 2 * (length + width);
            int area = length * width;
            
            System.out.println(perimeter + " " + area);
        }
        
        sc.close();
    }
}