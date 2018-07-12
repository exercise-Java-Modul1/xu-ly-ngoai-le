package calculation_example;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập a: ");
        int a = sc.nextInt();
        System.out.print("Mời bạn nhập b: ");
        int b = sc.nextInt();

        Calculation calc = new Calculation();
        calc.calculate(a, b);
    }
}
