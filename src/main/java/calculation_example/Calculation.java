package calculation_example;

public class Calculation {
    private int x;
    private int y;

    public Calculation() {

    }

    public void calculate(int x, int y) {
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;

            System.out.println("Tổng của " + x + " và " + y + " là: " + a);
            System.out.println("Hiệu của " + x + " và " + y + " là: " + b);
            System.out.println("Tích của " + x + " và " + y + " là: " + c);
            System.out.println("Thương của " + x + " và " + y + " là: " + d);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Bạn bị mắc lỗi chia cho 0");
        }
    }
}
