import java.util.Scanner;


public class Rectangle {
    private double width;
    private double height;
    private String color;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
        this.color = "WHITE";
    }

    public Rectangle(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = capitalizeFirstLetter(color);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }
    
    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double findArea() {
        return this.width * this.height;
    }

    public double findPerimeter() {
        return 2 * (this.width + this.height);
    }

    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        String color = scanner.next();

        if (width <= 0 || height <= 0) {
            System.out.println("INVALID");
        } else {
            Rectangle rectangle = new Rectangle(width, height, color);
            double perimeter = rectangle.findPerimeter();
            double area = rectangle.findArea();

            System.out.printf("%.0f %.0f %s\n", perimeter, area, rectangle.getColor());
        }

        scanner.close();
    }
}
