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
//        boolean b = sorted.sorted_or_not(arr2);
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
        int[] arr = {2, 54, 100, 3, 4, 89, 32, 324};
        int g = sorted.biggest2(arr);
        System.out.println(g);
    }
}


