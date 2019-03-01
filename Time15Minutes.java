package ConditionalStatementsExercise;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int timeInMinutes =  hour * 60 + minutes;
        int timePlus15 = timeInMinutes + 15;
        int finalHour = timePlus15 / 60;
        int finalMinutes = timePlus15 % 60;
        if(finalHour >= 24)
        {
            finalHour -= 24;
        }
        if(finalMinutes < 10)
        {
            System.out.printf("%d:0%d",finalHour,finalMinutes);
        } else
        {
            System.out.printf("%d:%d",finalHour,finalMinutes);
        }
    }
}
