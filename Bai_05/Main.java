package Bai_05;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        try {
            // Duyệt qua các tham số để khởi tạo các đối tượng hình học
            for (int i = 0; i < args.length; i++) {
                String shapeType = args[i].toLowerCase();
                if (shapeType.equals("rectangle")) {
                    // Kiểm tra đủ tham số cho rectangle (2 tham số tiếp theo là width và height)
                    if (i + 2 < args.length) {
                        double width = Double.parseDouble(args[++i]);
                        double height = Double.parseDouble(args[++i]);
                        shapes.add(new Rectangle(width, height));
                    } else {
                        System.out.println("Thiếu tham số cho hình chữ nhật.");
                    }
                } else if (shapeType.equals("circle")) {
                    // Kiểm tra đủ tham số cho circle (1 tham số tiếp theo là radius)
                    if (i + 1 < args.length) {
                        double radius = Double.parseDouble(args[++i]);
                        shapes.add(new Circle(radius));
                    } else {
                        System.out.println("Thiếu tham số cho hình tròn.");
                    }
                } else {
                    System.out.println("Hình không hợp lệ: " + shapeType);
                }
            }

            // Tính tổng diện tích và chu vi
            double totalPerimeter = 0;
            double totalArea = 0;

            for (Shape shape : shapes) {
                totalPerimeter += shape.getPerimeter();
                totalArea += shape.getArea();
            }

            // In kết quả
            System.out.println("Tổng chu vi của tất cả các hình: " + totalPerimeter);
            System.out.println("Tổng diện tích của tất cả các hình: " + totalArea);
        } catch (NumberFormatException e) {
            System.out.println("Vui lòng nhập tham số số hợp lệ.");
        }
    }
}
