package ConditionalStatementsLab;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceExcursion = Double.parseDouble(scanner.nextLine());
        int puzzleNum = Integer.parseInt(scanner.nextLine());
        int dollsNum = Integer.parseInt(scanner.nextLine());
        int bearsNum = Integer.parseInt(scanner.nextLine());
        int minionsNum = Integer.parseInt(scanner.nextLine());
        int trucksNum = Integer.parseInt(scanner.nextLine());
        double sum = (puzzleNum * 2.6)  + (dollsNum * 3) + (bearsNum * 4.1) + (minionsNum * 8.2) + (trucksNum * 2);
        int sumToy = puzzleNum + dollsNum + bearsNum + minionsNum + trucksNum;
        double discount = 0.0;
        if(sumToy > 50)
        {
            discount = sum * 0.25;
        }
        double totalPrice = sum - discount;
        totalPrice = totalPrice - (totalPrice * 0.10);
        if(priceExcursion <= totalPrice)
        {
            System.out.printf("Yes! %.2f lv left",totalPrice - priceExcursion);
        } else
        {
            System.out.printf("Not enough money! %.2f lv needed", Math.abs(totalPrice-priceExcursion));
        }


    }
}
