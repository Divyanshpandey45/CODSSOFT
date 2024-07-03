import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of five subjects:");
        
        System.out.println("Enter the marks of Physics:");
        int Physics = sc.nextInt();
        
        System.out.println("Enter the marks of Chemistry:");
        int Chemistry = sc.nextInt();
        
        System.out.println("Enter the marks of Maths:");
        int Maths = sc.nextInt();
        
        System.out.println("Enter the marks of Hindi:");
        int Hindi = sc.nextInt();
        
        System.out.println("Enter the marks of English:");
        int English = sc.nextInt();
        
        int total = Physics + Chemistry + Maths + Hindi + English;
        float percentage = total / 5.0f;
        
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
        
        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else if (percentage >= 50) {
            System.out.println("Grade E");
        } else if (percentage >= 40) {
            System.out.println("Grade F");
        } else {
            System.out.println("Fail");
        }
        
        sc.close();
    }
}