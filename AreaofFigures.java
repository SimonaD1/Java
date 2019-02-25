package ConditionalStatementsLab;

import java.util.Scanner;

public class AreaofFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figureType = scanner.nextLine();
        double area = 0;
        switch (figureType)
        {
            case "square":
                double a = Double.parseDouble(scanner.nextLine());
                area = a * a;
                break;
            case "rectangle":
                double a1 = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                area = a1 * b;
                break;
            case "circle" :
                double r = Double.parseDouble(scanner.nextLine());
                area = Math.PI * r * r;
                break;
            case "triangle" :
                double b1 = Double.parseDouble(scanner.nextLine());
                double h = Double.parseDouble(scanner.nextLine());
                area = h * b1/2;
                break;
                default:
                    System.out.println("invalid figure");
                    break;
        }
        System.out.printf("%.3f",area);
    }
}
