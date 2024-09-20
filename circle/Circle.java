package circle;

public class Circle {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getPrimeter() {
        return 2 * radius * (float) Math.PI;
    }

    public float getArea() {
        return radius * radius * (float) Math.PI;
    }

    public static void main(String[] args) {
        try {
            if(args.length != 1) {
                throw new IllegalArgumentException("Vui lòng nhập bán kính hình tròn.");
            };

            float radius = Float.parseFloat(args[0]);
            
            if(radius <= 0) {
                throw new IllegalArgumentException("Bán kính hình tròn không thể là số âm.");
            };

            Circle circle = new Circle(radius);

            System.out.println("Chu vi của hình tròn là: " + circle.getPrimeter());
            System.out.println("Diện tích của hình tròn là: " + circle.getArea());

        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập các giá trị số thực hợp lệ.");
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
