import java.util.Scanner;

public class save {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        double savingsGoal;
        double dailyContribution;

        // Prompt the user to set a savings goal
        System.out.print("Enter your savings goal: $");
        savingsGoal = scanner.nextDouble();

        // Prompt the user to set the daily contribution amount
        System.out.print("Enter your daily savings amount: $");
        dailyContribution = scanner.nextDouble();

        if (dailyContribution <= 0) {
            System.out.println("Invalid input. Please enter a positive daily savings amount.");
        } else {
            int daysRequired = (int) Math.ceil(savingsGoal / dailyContribution);
            System.out.println("To reach your goal of $" + savingsGoal + " with a daily savings of $" + dailyContribution + ":");
            System.out.println("It will take approximately " + daysRequired + " days.");
        }

        // Close the Scanner
        scanner.close();
    }
}
