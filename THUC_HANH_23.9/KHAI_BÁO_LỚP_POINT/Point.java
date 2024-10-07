import java.util.Scanner;

public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(Point secondPoint) {
        double dx = this.x - secondPoint.x;
        double dy = this.y - secondPoint.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static double distance(Point p1, Point p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            Point p1 = new Point(x1, y1);

            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            Point p2 = new Point(x2, y2);

            double distance = Point.distance(p1, p2);
            System.out.printf("%.4f\n", distance);
        }

        scanner.close();
    }
}

