package NestedConditionalStatementsLab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        if(city.equals("Sofia") && product.equals("coffee"))
        {
            price = 0.50;
        } else if(city.equals("Sofia") && product.equals("water"))
        {
            price = 0.80;
        } else if(city.equals("Sofia") && product.equals("beer"))
        {
            price = 1.20;
        } else if(city.equals("Sofia") && product.equals("sweets"))
        {
            price = 1.45;
        } else if(city.equals("Sofia") && product.equals("peanuts"))
        {
            price = 1.60;
        } else if(city.equals("Plovdiv") && product.equals("coffee"))
        {
            price = 0.40;
        } else if(city.equals("Plovdiv") && product.equals("water"))
        {
            price = 0.70;
        } else if(city.equals("Plovdiv") && product.equals("beer"))
        {
            price = 1.15;
        }else if(city.equals("Plovdiv") && product.equals("sweets"))
        {
            price = 1.30;
        } else if(city.equals("Plovdiv") && product.equals("peanuts"))
        {
            price = 1.50;
        } else if(city.equals("Varna") && product.equals("coffee"))
        {
            price = 0.45;
        } else if(city.equals("Varna") && product.equals("water"))
        {
            price = 0.70;
        } else if(city.equals("Varna") && product.equals("beer"))
        {
            price =1.10;
        } else if(city.equals("Varna") && product.equals("sweets"))
        {
            price = 1.35;
        } else if(city.equals("Varna") && product.equals("peanuts"))
        {
            price = 1.55;
        }
        double result = price * quantity;
        System.out.println(result);

    }
}
