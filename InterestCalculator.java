import java.util.Scanner;

public class InterestCalculator{

    double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    double compoundInterest(double p, double r, double t) {
        return p * Math.pow((1 + r / 100), t) - p;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        InterestCalculator obj = new InterestCalculator();

        int choice;
        double principal, rate, time;
        double interest, totalAmount;

        System.out.print("Enter saving principal amount: ");
        principal = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        rate = sc.nextDouble();
        System.out.print("Enter time in years: ");
        time = sc.nextDouble();

        do {
            System.out.println("\n===== BANK ACCOUNT =====");
            System.out.println("1. Saving Account");
            System.out.println("2. Loan Account");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\n--- Saving Account ---");

                    interest = obj.simpleInterest(principal, rate, time);
                    totalAmount = principal + interest;

                    System.out.println("\nSimple Interest = " + interest);
                    System.out.println("Principal Amount = " + principal);
                    System.out.println("Total Amount = " + totalAmount);

                    break;

                case 2:
                    System.out.println("\n--- Loan Account ---");

                    interest = obj.compoundInterest(principal, rate, time);
                    totalAmount = principal + interest;

                    System.out.println("\nCompound Interest = " + interest);
                    System.out.println("Principal Amount = " + principal);
                    System.out.println("Total Amount = " + totalAmount);

                    break;

                case 3:
                    System.out.println("\nThank you! Exiting program...");
                    break;

                default:
                    System.out.println("\nInvalid choice! Please try again.");
            }

        } while (choice != 3);

        sc.close();
    }
}