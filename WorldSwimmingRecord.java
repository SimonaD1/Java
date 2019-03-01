package ConditionalStatementsExercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timeInSecondsFor1Metar = Double.parseDouble(scanner.nextLine());
        double timeInsec = distanceMeters * timeInSecondsFor1Metar;
        double slowSpeed = (distanceMeters / 15) * 12.5;
        double fullTime = timeInsec + slowSpeed;
        double timeForRecord = fullTime - record;
        if(fullTime < record)
        {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", fullTime);
        }
        else
        {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeForRecord);
        }

    }
}
