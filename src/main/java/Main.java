import java.util.Scanner;

/**
 * Created by Иван on 27.05.2017.
 */
public class Main {
    public static void main (String[] args){
//        RightTriangle rt1 = new RightTriangle();
//        rt1.check();
//        RightTriangle rt2 = new RightTriangle(5,6,7);
//        rt2.check();
//        RightTriangle rt3 = new RightTriangle(5,3,4);
//        rt3.check();

//        EvenOdd e1 = new EvenOdd();
//        e1.even();
//        EvenOdd e2 = new EvenOdd(3);
//        e2.even();

//        Bigger b1 = new Bigger();
//        b1.checkBigger(-1,2);
//        b1.checkBigger(2,2);
//        b1.checkBigger(3,2);

        menu();

    }

    public static void menu() {

        RightTriangle rightTriangle = new RightTriangle();
        EvenOdd evenOdd = new EvenOdd();
        Bigger bigger = new Bigger();

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nPlease choose a program:\n1 - Right-angle check\n2 - Even or odd check\n3 - Bigger number check\n4 - Exit");

        int check = scanner.nextInt();
        if (check == 1) {
            System.out.println("Enter 3 sides of triangle\na:");
            rightTriangle.a = scanner.nextDouble();
            System.out.println("b:");
            rightTriangle.b = scanner.nextDouble();
            System.out.println("c:");
            rightTriangle.c = scanner.nextDouble();

            System.out.println(rightTriangle.check());

            pressAnyKeyToContinue();
            menu();
        } else if (check == 2) {
            System.out.println("Enter number to check if it is even or odd:");
            evenOdd.number = scanner.nextInt();

            System.out.println(evenOdd.even());

            pressAnyKeyToContinue();
            menu();
        } else if (check == 3) {
            System.out.println("Enter 2 numbers to check which is bigger\na:");
            int a = scanner.nextInt();
            System.out.println("b:");
            int b = scanner.nextInt();

            System.out.println(bigger.checkBigger(a, b));

            pressAnyKeyToContinue();
            menu();
        } else if (check == 4){

        } else{
            System.out.println("You've entered wrong number. Try again");
            menu();
        }
    }

    public static void pressAnyKeyToContinue()
    {
        System.out.println("Press Enter to continue...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }
}
