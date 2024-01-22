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
//        int lenght = scan.nextInt();
//        for (int i = 0; i < lenght  ; i++) {
//            for (int g = 0; g < i; g++) {
//                System.out.print(" ");
//            }
//            for(int j = lenght - i -1; j >= 0; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        lenght -= 1;
//        for (int i = lenght -1 ; i >= 0; i--) {
//            for (int g = i ; g > 0; g--) {
//                System.out.print(" ");
//            }
//            for(int j = lenght - i +1; j != 0; j--) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//
//        int[] arr1 = {10, 6 , 20 , 7 , 98};
//
//        int[] arr2 = {1, 5, 20, 50, 100};
//
//        boolean b = sorted.isSorted(arr2);
//        System.out.println(b);
//
//        double d = scan.nextDouble();
//        long num = sorted.round(d);
//        System.out.println(num);
//
//        int[] arr = {5, 56, -1000, -467, -30, -50, 3774, 47, -46,47};
//        boolean v = sorted.mostPositive(arr);
//        System.out.println(v);
//
//        int[] arr = {2, 54, 100, 3, 4, 89, 32, 324};
//        int g = sorted.biggest2(arr);
//        System.out.println(g);
//
//        System.out.println("give me a start index ");
//        int start = scan.nextInt();
//        System.out.println("give me an higher end index");
//        int end = scan.nextInt();
//
//        int[] arr = {6, 20, 7, 98, 100, 43, 53, 12, 70, 23, 67, 93, 62, 10, 3, 17, 45, 26, 71, 21};
//
//        int[] arr = {1, 5, 20, 50, 100, 123, 159, 193, 206, 237, 285, 300, 327, 391, 409, 469};
//
//        boolean b = sorted.isSortedUp(arr, start, end);
//        System.out.println(b);
//
//        double round_about = scan.nextDouble();
//        long num = sorted.round1(round_about);
//        System.out.println(num);
//
//        int[] arr = {5, 56, -1000, -467, -30, -50, 3774, 47, -46,47};
//        boolean v = sorted.pos_or_neg(arr);
//        System.out.println(v);
//
//        int[] arr = {2, 54, 100, 3, 4, 89, 32, 324};
//        int g = sorted.biggest2(arr);
//        System.out.println(g);
//
//        System.out.println("put a word");
//        String str1 = scan.nextLine();
//
//        System.out.println("put another word");
//        String str2 = scan.nextLine();
//
//        String pout = sorted.equal_or_not(str1, str2);
//        System.out.println(pout);
//
//        System.out.println("put a word");
//        String str1 = scan.nextLine();
//
//        boolean sorted_or_not = sorted.sorted_or_not_2(str1);
//        System.out.println(sorted_or_not);
//
//        int[][] mat = {{34, 432, 666, 2544, 3000},
//                        {4, 232, 234, 300, 301, 456},
//                        {1, 54, 100, 345, 5677}};
//        int[][] mat = {{654, 3, 85, 2},
//                        {47, 2, 3467, 33,78},
//                        {23,3,46,7,2,4,58}};
//        boolean b = sorted.rowSorted(mat);
//        System.out.println(b);
//
//        String input = scan.nextLine();
//
//        String b = sorted.backwards(input);
//        System.out.println(b);
//
//        String line = scan.nextLine();
//
//        int b = sorted.howMuch(line);
//        System.out.println(b);
//
//        String line = scan.nextLine();
//
//        int b = sorted.Words(line);
//        System.out.println(b);
//        String line = scan.nextLine();
//
//        String b = sorted.litleWord(line);
//        System.out.println(b);
//
//        System.out.println("give 3 letters");
//        String line = scan.nextLine();
//
//        String b = sorted.ABC(line);
//        System.out.println(b);
//
//        String action = scan.nextLine();
//        int num1 = scan.nextInt();
//        int num2 = scan.nextInt();
//
//        int b = sorted.caculator(num1, num2, action);
//
//        System.out.println(num1+(action)+num2+"="+b);
//
//        String line1 = scan.nextLine();
//        String line2 = scan.nextLine();
//
//        boolean b = sorted.phoromztiz(line1, line2);
//        System.out.println(b);
//
//        int num = scan.nextInt();
//
//        int b = sorted.Factorial(num);
//        System.out.println(b);
//
//        int denominator = scan.nextInt();
//        int nubv = scan.nextInt();
//        int b = sorted.dividingWholes(denominator, nubv);
//        System.out.println(b);
//
//        int num = scan.nextInt();
//        boolean b = sorted.dividing(num);
//        System.out.println(b);
//
//        int num = scan.nextInt();
//        int b = sorted.evenOrOdd(num);
//        System.out.println(b);
//
//        System.out.println("give a number");
//        int num = scan.nextInt();
//        int b = sorted.addingUp(num);
//        System.out.println(b);

    }
}


