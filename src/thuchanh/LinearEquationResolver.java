package thuchanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Bộ phân giải tuyến tính");
        System.out.println("Cho một phương trình a * x + b = 0 vui lòng nhập hằng số");

        Scanner scanner = new Scanner(System.in);
        System.out.println("a: ");
        Double a  = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        if (a!=0) {
            double solution = -b/a;
            System.out.print("The solution is "  + solution);
        }else {
            if (b == 0) {
                System.out.println("The solution is all x");
            }else {
                System.out.println("No solution!");
            }
        }
    }
}
