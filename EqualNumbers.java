package ConditionalStatementsLab;

import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNum = Integer.parseInt(scanner.nextLine());
        int thirdNum = Integer.parseInt(scanner.nextLine());
        if (firstNum == secondNum && secondNum == thirdNum) {
            System.out.println("yes");
        } else
        {
            System.out.println("no");
        }


    }
}
