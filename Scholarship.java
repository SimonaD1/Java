package ConditionalStatementsExercise;

import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double leva = Double.parseDouble(scanner.nextLine());
        double sredenUspeh = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());
        double socialS= 0;
        double excellentS = 0;
        if(leva > minSalary || sredenUspeh < 5.50)
        {
            System.out.println("You cannot get a scholarship");
        }
        if(leva < minSalary && sredenUspeh > 4.50)
        {
            socialS = minSalary * (0.35 * 100);
            System.out.printf("You get a Social scholarship %.0f BGN",Math.floor(socialS));
        }
        else if(sredenUspeh > 5.50)
        {
            excellentS = sredenUspeh * 25;
            System.out.printf("You get a scholarship for excellent results %.0f BGN",Math.floor(excellentS));
        }
 }
}
