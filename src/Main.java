
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Task 1 - Enter a number: ");
        int num1 = sc.nextInt();

        if (num1 > 0)
            System.out.println("Positive number");
        else if (num1 < 0)
            System.out.println("Negative number");
        else
            System.out.println("Zero");



        System.out.print("Task 2 - Enter a number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Invalid day number");
        }



        System.out.print("Task 3 - Enter a number: ");
        int limit = sc.nextInt();

        System.out.print("Odd numbers: ");
        for (int i = 1; i <= limit; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();





        System.out.print("Task 5 - Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);

        if (age < 18) {
            System.out.println("Access denied");
        } else {
            if (gender == 'M' || gender == 'm')
                System.out.println("Male access granted");
            else if (gender == 'F' || gender == 'f')
                System.out.println("Female access granted");
            else
                System.out.println("Invalid gender entered");
        }


        System.out.print("Task 6 - How many Fibonacci numbers: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a valid number");
        } else {
            int a = 0, b = 1;
            for (int i = 1; i <= n; i++) {
                System.out.print(a + (a % 2 == 0 ? " (Even) " : " (Odd) "));
                int next = a + b;
                a = b;
                b = next;
            }
            System.out.println();
        }



        System.out.print("Task 7 - Enter a number: ");
        int factNum = sc.nextInt();

        if (factNum < 0) {
            System.out.println("Factorial does not exist for negative numbers");
        } else {
            long fact = 1;
            for (int i = 1; i <= factNum; i++) {
                fact *= i;
            }
            System.out.println("Factorial = " + fact);
        }



        System.out.print("Task 8 - Enter a number: ");
        int strong = sc.nextInt();
        int strongTemp = strong;
        int strongSum = 0;

        while (strongTemp > 0) {
            int digit = strongTemp % 10;
            int f = 1;
            for (int i = 1; i <= digit; i++) f *= i;
            strongSum += f;
            strongTemp /= 10;
        }

        if (strongSum == strong)
            System.out.println("Strong number");
        else
            System.out.println("Not a strong number");



        System.out.print("Task 9 - Enter a number: ");
        int arm = sc.nextInt();
        int armTemp = arm;
        int digits = String.valueOf(arm).length();
        int armSum = 0;

        while (armTemp > 0) {
            int digit = armTemp % 10;
            armSum += Math.pow(digit, digits);
            armTemp /= 10;
        }

        if (armSum == arm)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");

        sc.close();
    }
}
