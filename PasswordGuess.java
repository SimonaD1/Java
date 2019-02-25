package ConditionalStatementsLab;

import java.util.Scanner;

public class PasswordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if(password.equalsIgnoreCase("s3cr3t!P@ssw0rd"))
        {
            System.out.println("Welcome");
        } else
        {
            System.out.println("Wrong password");
        }
    }
}
