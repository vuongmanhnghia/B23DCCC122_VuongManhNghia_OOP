package THUC_HANH_01.BAI_01;

public class PerimeterAndAreaCalculator {

    public static void main(String[] args) {
        try {
            // Kiểm tra nếu đủ tham số
            if (args.length != 2) {
                throw new IllegalArgumentException("Vui lòng nhập chiều rộng và chiều cao của hình chữ nhật.");
            }

            // Chuyển đổi tham số sang số nguyên
            float width = Float.parseFloat(args[0]);
            float height = Float.parseFloat(args[1]);

            // Kiểm tra nếu width và height có phải là số nguyên dương
            if (width <= 0 || height <= 0) {
                throw new IllegalArgumentException("Chiều rộng và chiều cao phải là các số nguyên dương.");
            }

            // Tính chu vi và diện tích
            float perimeter = 2 * (width + height);
            float area = width * height;

            // In kết quả
            System.out.println("Chu vi của hình chữ nhật là: " + perimeter);
            System.out.println("Diện tích của hình chữ nhật là: " + area);

        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập các số nguyên cho chiều rộng và chiều cao.");
        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Lỗi không xác định: " + e.getMessage());
        }
    }
}
