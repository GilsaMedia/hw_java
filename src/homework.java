//import java.util.Scanner; // Import the Scanner class
//
//public class EX_1 {
//    public static void main(String[] args) {
//        //installation of the scanner the methode for getting the input from the user
//        Scanner scan = new Scanner(System.in); // Create a Scanner object
//        /*
//        using example getting int.
//        in order to get other type go to:
//        https://www.w3schools.com/java/java_user_input.asp
//        and fid the table with tha other option
//        */
//        int a = scan.nextInt();// Read user input
//        System.out.println(a);// Output user input
//    }
import java.util.Scanner; // Import the Scanner class

public class homework {
    public static void main(String[] args) {
//       1
//        Scanner scan = new Scanner(System.in); // Create a Scanner object
//        System.out.println("enter the first num");
//        int a = scan.nextInt();
//        System.out.println("enter the second num");
//        int b = scan.nextInt();
//
//
//        System.out.println("the the first num "+ a);
//        System.out.println("the second num "+b);
//
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("the the first num "+ a);
//        System.out.println("the second num "+b);
        //2
        Scanner scan = new Scanner(System.in); // Create a Scanner object
//        System.out.println("enter the first num");
//        Double a = scan.nextDouble();
//        System.out.println("enter the second num");
//        Double b = scan.nextDouble();
//        int avreg = (int)(a+b)/2;
//        System.out.println("the avreg num is " + avreg);
        // ex_2
//        1
//        if (a == 0)
//        {
//
//            if (b == 0)
//            {
//                System.out.println("no solution");
//            }
//            else
//            {
//                System.out.println("infinity");
//            }
//        }
//        else
//        {
//            System.out.println("x = "+ (b/a));
//        }
//        int n = scan.nextInt();
//
//        int[] arr = new int[n];
//
//        int counter = 0;
//
//        for (int i = 0; i < n; i++)
//        {
//            arr[i] = (int)(Math.random()*(n+1));
//        }
//        for (int f = 0; f <n; f++)
//        {
//            if (arr[f] == 0)
//            {
//                counter++;
//            }
//        }
//        System.out.println(counter);

//        int lenght = scan.nextInt();
//        for (int i = lenght; i != 0  ; i--)
//        {
//            for(int j = 0; j< i; j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        int lenght = scan.nextInt();
        for (int i = 0; i < lenght  ; i++) {
            for (int g = 0; g < i; g++) {
                System.out.print(" ");
            }
            for(int j = lenght; j <= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = lenght -1 ; i >= 0; i--) {
            for (int g = i; g > 0; g--) {
                System.out.print(" ");
            }
            for(int j = lenght - i +1; j <= 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        }
    }


