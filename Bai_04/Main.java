package Bai_04;

public class Main {
    public static void main(String[] args) {
        try {
            if (args.length != 1 && args.length != 2) {
                throw new Exception("Vui lòng nhập giá trị hợp lệ.");
            }

            if (args.length == 1) {
                double radius = Double.parseDouble(args[0]);
                Shape circle = new Circle(radius);
                System.out.println("Chu vi hình tròn: " + circle.getPerimeter());
                System.out.println("Circle area: " + circle.getArea());
            }

            if (args.length ==2) {
                double width = Double.parseDouble(args[0]);
                double height = Double.parseDouble(args[1]);
                Shape rectangle = new Rectangle(width, height);
                System.out.println("Chu vi hình chữ nhật: " + rectangle.getPerimeter());
                System.out.println("Diện tích hình chữ nhật: " + rectangle.getArea());
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
