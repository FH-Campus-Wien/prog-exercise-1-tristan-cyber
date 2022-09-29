package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");// input your solution here
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901\n" +
                            "         __\n" +
                            " _(\\    |@@|\n" +
                            "(__/\\__ \\--/ __\n" +
                            "   \\___|----|  |   __\n" +
                            "       \\ }{ /\\ )_ / _\\\n" +
                            "       /\\__/\\ \\__O (__\n" +
                            "      (--/\\--)    \\__/\n" +
                            "      _)(  )(_\n" +
                            "     `---''---`"

        );

        // input your solution here
    }

    //todo Task 3
    public void sumOfLiterals(){
        char a = 'Z';
        int b = 0xface;
        int c = 012;
        float d = 80L;
        float e = 44e-1f;
        float f = 5.5f;
        double g = 8.88e1;
        double h = 99.9;

        int sum = (int) a + b + c + (int) d +  (int) e + (int) f + (int) g + (int)h;

        System.out.println(sum);

        // input your solution here
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        System.out.println("Before Swap:");
        System.out.print("x: ");
        System.out.print("y: ");

        x = x+y;
        y = x-y;
        x = x-y;

        System.out.println("After Swap:");
        System.out.println("x: "+ x);
        System.out.println("y: "+ y);


        // input your solution here
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("n1: ");
        int n1 = scanner.nextInt();
        System.out.print("n2: ");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("n1 > n2");
        } else if (n2 > n1) {
            System.out.println("n2 > n1");
        } else if (n1 == n2) {
            System.out.println("n1 == n2");
        }



        // input your solution here
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        int revenue = scanner.nextInt();


        if (revenue < 0 || revenue >= 100000) {
            System.out.println("Invalid Revenue");
        } else if (0 <= revenue && revenue < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (20000 <= revenue && revenue < 50000) {
            System.out.println("Average Sales Revenue");
        } else if (50000 <= revenue && revenue < 80000) {
            System.out.println("Good Sales Revenue");
        } else if (80000 <= revenue && revenue < 100000) {
            System.out.println("Excellent Sales Revenue");
        }


        // input your solution here
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int commission = scanner.nextInt();

        switch (commission) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }

        // input your solution here
    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scanner.nextInt();

        int div4 = year%4;
        int div100 = year%100;
        int div400 = year%400;

        if (div4 != 0) {
            System.out.println("Not a Leapyear");
        } else if (div100 != 0) {
            System.out.println("Leapyear");
        } else if (div400 == 0) {
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number < 1000 && number > 0) {
           int one = number%10;
           number = number/10;
           int ten = number%10;
           int hundert = number/10;
            System.out.println(one + "" +ten + ""+ hundert);
        }


        // input your solution here
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}