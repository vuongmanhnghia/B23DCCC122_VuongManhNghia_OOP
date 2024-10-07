import java.io.*;

public class HELLOFILE {
    public static void main(String[] args) {
        // Tên file văn bản cần đọc
        String fileName = "Hello.txt";

        // Sử dụng BufferedReader để đọc nội dung file
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                // In từng dòng nội dung ra màn hình
                System.out.println(line);
            }
        } catch (IOException e) {
            // Xử lý ngoại lệ nếu có lỗi trong quá trình đọc file
            System.out.println("Đã xảy ra lỗi khi đọc file: " + e.getMessage());
        }
    }
}

