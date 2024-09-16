package rectangle;

public class Rectangle02 {
    private float width;
    private float height;

    public Rectangle02(float width, float height) {
        this.width = width;
        this.height = height;
    }

    public float getPerimeter() {
        return 2 * (width + height);
    }

    public float getArea() {
        return width * height;
    }

    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                throw new IllegalArgumentException("Vui lòng nhập chiều rộng và chiều cao.");
            }

            float width = Float.parseFloat(args[0]);
            float height = Float.parseFloat(args[1]);

            Rectangle02 rect = new Rectangle02(width, height);

            System.out.println("Chu vi của hình chữ nhật là: " + rect.getPerimeter());
            System.out.println("Diện tích của hình chữ nhật là: " + rect.getArea());

        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập các giá trị số thực hợp lệ.");
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
