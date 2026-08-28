import java.util.*;

public class BookDetails {

    String author, title;
    int year;

    String authorList[] = {"ABC", "XYZ", "TSR", "QWE", "UHN"};
    String titleList[] = {"A", "B", "C", "D", "E"};
    int yearList[] = {2020, 2019, 2025, 2023, 2017};

    // Method 1: Only author
    void bookDetails(String author) {
        this.author = author;

        System.out.println("\nBook Details:");
        System.out.println("Author: " + author);
    }

    // Method 2: Author and title
    void bookDetails(String author, String title) {
        this.author = author;
        this.title = title;

        System.out.println("\nBook Details:");
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
    }

    // Method 3: Author, title and year
    void bookDetails(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;

        System.out.println("\nBook Details:");
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BookDetails obj = new BookDetails();

        System.out.print("Enter number of arguments (1, 2 or 3): ");
        int arg = sc.nextInt();
        sc.nextLine(); // consume newline

        if (arg == 1) {

            System.out.print("Enter author: ");
            String author = sc.nextLine();

            obj.bookDetails(author);

        } else if (arg == 2) {

            System.out.print("Enter author: ");
            String author = sc.nextLine();

            System.out.print("Enter title: ");
            String title = sc.nextLine();

            obj.bookDetails(author, title);

        } else if (arg == 3) {

            System.out.print("Enter author: ");
            String author = sc.nextLine();

            System.out.print("Enter title: ");
            String title = sc.nextLine();

            System.out.print("Enter year: ");
            int year = sc.nextInt();

            obj.bookDetails(author, title, year);

        } else {
            System.out.println("Invalid number of arguments!");
        }

        sc.close();
    }
}
