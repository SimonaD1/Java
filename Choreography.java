package ConditionalStatementsExercise;

import java.util.Scanner;

public class Choreography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int steps = Integer.parseInt(scanner.nextLine());
        int dancers = Integer.parseInt(scanner.nextLine());
        int daysForLearning = Integer.parseInt(scanner.nextLine());
        double totalStepsPerDay = (steps /  daysForLearning) /steps;
        double stepsForDancers = totalStepsPerDay / dancers;
        if(totalStepsPerDay <= 13)
        {
            System.out.printf("Yes, they will succeed in that goal! %.2f ",stepsForDancers);
        } else
        {
            System.out.printf("No, they will not succeed in that goal! %.2f steps to be learned per day.", stepsForDancers);
        }
    }
}
