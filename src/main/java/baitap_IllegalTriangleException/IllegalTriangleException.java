package baitap_IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleException extends Throwable {
    public void TriangleException(double a, double b, double c) {
        try {
            if (a <= 0 || b <= 0 || c <= 0 || (a + b) <= c || (a + c) <= b || (b + c) <= a) {
                throw new IllegalAccessException();
            } else {
                double perimeter = (a + b + c);
                System.out.println("Diện tích của tam giác là: " + perimeter);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.out.println("Tam giác bạn nhập không hợp lệ.");
        }
    }

    public static void main(String[] args) {
        IllegalTriangleException triangle = new IllegalTriangleException();
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập cạnh thứ nhất: ");
        double a = sc.nextDouble();
        System.out.print("Mời bạn nhập cạnh thứ hai: ");
        double b = sc.nextDouble();
        System.out.print("Mời bạn nhập cạnh thứ ba: ");
        double c = sc.nextDouble();
        triangle.TriangleException(a, b, c);
    }
}
