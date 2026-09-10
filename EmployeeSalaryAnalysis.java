import java.util.Scanner;

public class EmployeeSalaryAnalysis {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Number of employees must be greater than 0.");
            sc.close();
            return;
        }
        double[] salary = new double[n];
        System.out.println("Enter salaries of employees:");
        for (int i = 0; i < n; i++) {
            salary[i] = sc.nextDouble();
        }
        double total = 0;
        for (int i = 0; i < n; i++) {
            total = total + salary[i];
        }
        double average = total / n;
        double highest = salary[0];
        double lowest = salary[0];
        int highestEmployee = 1;
        int lowestEmployee = 1;

        for (int i = 1; i < n; i++) {
            if (salary[i] > highest) {
                highest = salary[i];
                highestEmployee = i + 1;
            }

            if (salary[i] < lowest) {
                lowest = salary[i];
                lowestEmployee = i + 1;
            }
        }
        int aboveAverage = 0;
        for (int i = 0; i < n; i++) {
            if (salary[i] > average) {
                aboveAverage++;
            }
        }
        int withinAverage = 0;
        for (int i = 0; i < n; i++) {
            if (salary[i] >= average - 5000 &&
                salary[i] <= average + 5000) {

                withinAverage++;
            }
        }
        System.out.println();
        System.out.println("===== Salary Analysis Report =====");
        System.out.println("Employees: " + n);
        System.out.println("Total Payroll: Rs." + total);
        System.out.printf("Average Salary: Rs.%.2f%n", average);
        System.out.println("Highest Salary: Rs." + highest+ " (Employee " + highestEmployee + ")");
        System.out.println("Lowest Salary: Rs." + lowest+ " (Employee " + lowestEmployee + ")");
        System.out.println("Above Average: "+ aboveAverage + " employees");
        System.out.println("Within Rs.5000 of Average: "+ withinAverage + " employees");
        sc.close();
    }
}