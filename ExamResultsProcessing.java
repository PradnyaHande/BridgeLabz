import java.util.Scanner;
public class ExamResultsProcessing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Number of students must be greater than 0.");
            sc.close();
            return;
        }
        int[] marks = new int[n];
        System.out.println("Enter marks:");
        for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
        }
        int highest = marks[0];
        int highestRoll = 1;
        for (int i = 1; i < n; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
                highestRoll = i + 1;
            }
        }
        System.out.println();
        System.out.println("===== Exam Results =====");
        System.out.println("Highest scorer: Roll " + highestRoll);
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeF = 0;
        for (int i = 0; i < n; i++) {
            if (marks[i] >= 90) {
                gradeA++;
            }
            else if (marks[i] >= 75) {
                gradeB++;
            }
            else if (marks[i] >= 50) {
                gradeC++;
            }
            else {
                gradeF++;
            }
        }
        System.out.println("Grade A: " + gradeA);
        System.out.println("Grade B: " + gradeB);
        System.out.println("Grade C: " + gradeC);
        System.out.println("Grade F: " + gradeF);
        System.out.println("Duplicates:");
        boolean duplicateFound = false;
        for (int i = 0; i < n; i++) {
            boolean alreadyPrinted = false;
            for (int j = 0; j < i; j++) {
                if (marks[i] == marks[j]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) {
                continue;
            }
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (marks[i] == marks[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(marks[i] + " -> " + count + " times");
                duplicateFound = true;
            }
        }
        if (!duplicateFound) {
            System.out.println("No duplicated marks");
        }
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int temp = marks[start];
            marks[start] = marks[end];
            marks[end] = temp;
            start++;
            end--;
        }
        System.out.print("Reversed: ");
        for (int i = 0; i < n; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
        int[] backup = new int[n];
        for (int i = 0; i < n; i++) {
            backup[i] = marks[i];
        }
        System.out.print("Enter number of re-exam marks: ");
        int m = sc.nextInt();
        if (m < 0) {
            System.out.println("Number of re-exam marks cannot be negative.");
            sc.close();
            return;
        }
        int[] reExam = new int[m];
        System.out.println("Enter re-exam marks:");
        for (int i = 0; i < m; i++) {
            reExam[i] = sc.nextInt();
        }
        int[] combined = new int[n + m];
        for (int i = 0; i < n; i++) {
            combined[i] = marks[i];
        }
        for (int i = 0; i < m; i++) {
            combined[n + i] = reExam[i];
        }
        System.out.print("Merged: ");
        for (int i = 0; i < combined.length; i++) {
            System.out.print(combined[i] + " ");
        }
        sc.close();
    }
}
