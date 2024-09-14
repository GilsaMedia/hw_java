import java.security.PublicKey;
import java.util.*;
import java.util.Queue;

public class sorted {
//    public static boolean sorted_or_not(int[] mat) {
//        for (int i = 0; i < mat.length; i++) {
//            if (mat[i] <= mat[i + 1]) {
//                return true;
//            }
//            else {
//                break;
//            }
//        }
//        return false;
//    }
//
//    mission 1 ^^^^
//
//    public static round(double d) {
//        long num = 0;
//            if (d%1 >= 0.5) {
//                d = d+(1-(d%1));
//                num = (long)d;
//            else {
//                return false;
//            }
//        }
//        return false;
//    }
//    mission 1
//
//    public static long round1(double round_about) {
//        long num = 0;
//            if (round_about%1 >= 0.5) {
//                round_about = round_about+(1-(round_about%1));
//                num = (long)round_about;
//            }
//            else {
//                num = (long) round_about;
//            }
//        return num;
//    }
//    mission number 5 ^^^^
//    public static boolean isS ortedUp(int[] arr, int start, int end) {
//        if (start < 0 || start > end && start > arr.length || end > arr.length) {
//            return false;
//        }
//        else {
//            int arr_length1 = (end - start + 1);
//            int h = 0;
//            int[] arr_start = new int[arr_length1];
//            for (int j = start; j < end; j++) {
//                while (h <= arr_length1) {
//                    arr_start[h] = arr[j];
//                    h += 1;
//                    break;
//                }
//            }
//                return sorted_or_not(arr_start);
//        }
//    }
//    public static boolean pos_or_neg(int arr[]) {
//        int pos_count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > 0) {
//                pos_count += 1;
//            } else {
//                pos_count -= 1;
//            }
//        }
//        if (pos_count > 0) {
//            return true;
//        }
//        return false;
//    }
//    mission 7 ^^^^
//    public static int biggest2(int[] arr) {
//        int biggest1 = 0;
//        int biggest_after = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > biggest1) {
//                biggest_after = biggest1;
//                biggest1 = arr[i];
//            }
//        }
//        return biggest_after;
//    }
//    mission 8 ^^^^
//    public static int biggest2(int[] arr) {
//        int biggest1 = 0;
//        int biggest_after = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > biggest1) {
//                biggest_after = biggest1;
//                biggest1 = arr[i];
//            }
//        }
//        return biggest_after;
//    }
//    mission 8 ^^^^
//
//    public staing tic Strequal_or_not(String str1, String str2) {
//        if (str1.contentEquals(str2)) {
//            return "The strings are equal";
//        }
//        return "The strings are not equal";
//    }
//
//    public static Boolean sorted_or_not_2(String str1) {
//        char letter = ' ';
//        String str2 = "";
//        for (int i = 0; i < str1.length(); i++) {

//            letter = str1.charAt(str1.length()-1-i);
//            str2 += letter;
//        }
//        if (str1.contentEquals(str2)) {
//            return true;
//        }
//        return false;
//    }
//
//    public static boolean rowSorted(int[][] mat) {
//        int j;
//        for (j = 0; j < mat.length;) {
//            if (sorted_or_not(mat[j]);) {
//                j++;
//            } else {
//                break;
//            }
//        }
//        return j == (mat.length);
//    }
//    public static boolean arrSorted(int [][]mat) {
//        int j;
//        for ()
//    }
//
//    public static String backwards(String input) {
//        char letter = ' ';
//        String Backwards = "";
//        for (int i = 0; i < input.length(); i++) {
//            letter = input.charAt(input.length()-i);
//            Backwards += letter;
//        }
//        return Backwards;
//    }
//
//    public static int howMuch(String line) {
//        char linechar = line.charAt(0);
//        int cunter = 0;
//        for (int i = 0; i < line.length(); i++) {
//            if (line.charAt(i) == linechar) {
//                cunter++;
//            }
//        }
//        return cunter;
//    }
//
//    public static int Words(String line) {
//        int howMuchWords = 0;
//        for (int i = 0; i < line.length(); i++) {
//            if (line.charAt(i) == ' ') {
//                howMuchWords += 1;
//            }
//        }
//        if (line.charAt(0) == ' ') {
//            howMuchWords += 1;
//        } else if (line.charAt(line.length()-1) != ' ') {
//            howMuchWords += 1;
//        }
//        return howMuchWords;
//    }
//
//    public static String litleWord(String line) {
//        String line2 = line.toLowerCase();
//        return line2;
//    }
//    public static String ABC(String line) {
//        char[] arr = new char[3];
//        String line2 = "";
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = line.charAt(i);
//        }
//        line2 = Arrays.toString(arr);
//        line2 = line2.toLowerCase();
//        for (int i = 0; i < line2.length(); i++) {
//            if (line.charAt(i) == line2.charAt(i)) {
//
//            }
//        }
//        return line2;
//    }

//    public static int caculator(int num1, int num2, String action) {
//        int end = 0;
//        switch (action) {
//            case "%":
//                end = num1%num2;
//                break;
//            case "/":
//                end = num1/num2;
//                break;
//            case "*":
//                end = num1*num2;
//                break;
//            case "-":
//                end = num1-num2;
//                break;
//            case "+":
//                end = num1+num2;
//                break;
//        }
//        return end;
//    }
//
//    public static boolean phoromztiz(String line1, String line2) {
//        int i;
//        if (line1.length() != line2.length()) {
//            return false;
//        }
//        char[] line1chararr = new char[line1.length()];
//        return true;
//    }
//
//    public static int Factorial(int num) {
//        if (num == 0) {
//            return 1;
//        }
//        else {
//            return num * Factorial(num-1);
//        }
//    }

    //    public static int dividingWholes(int denominator, int nubv) {
//        if (denominator-nubv < 0) {
//            return 0;
//        }
//        else {
//            return 1 + dividingWholes(denominator - nubv, nubv);
//        }
//    }
//
//    public static boolean dividing(int num) {
//        if (num < 10) {
//            return num % 2 == 0;
//        } else {
//            int lastDigit = num % 10;
//            int reminderNum = num / 10;
//            boolean currentLastDigit = lastDigit % 2 == 0;
//            boolean currentReminderNum = dividing(reminderNum);
//            return currentReminderNum == currentLastDigit;
//        }
//    }
//
//    public static int evenOrOdd(int n) {
//        if (n == 0) {
//            return 0;
//        }
//        if (n%2 == 0) {
//            return n*n + evenOrOdd(n-1);
//        }
//        else {
//            return n*2 + evenOrOdd(n-1);
//        }
//    }
//
//    public static int addingUp(int num) {
//        List<Integer> numList = new ArrayList<>();
//        int mainInt = 0;
//        for (char c: String.valueOf(num).toCharArray()) {
//            numList.add(Integer.valueOf(String.valueOf(c)));
//            mainInt += Integer.parseInt(String.valueOf(c));
//        }
//        if (mainInt >= 10 ) {
//            return addingUp(mainInt);
//        } else {
//            return mainInt;
//        }
//
//    }
//
//    public static boolean inLine(int n, Queue<Integer> Q) {
//        Q.add(-999);
//        boolean returnThingy = false;
//        if (Q.isEmpty()) {
//            return false;
//        } else {
//            while (!(Q.peek() == -999)) {
//                int x = Q.remove();
//                if (x == n) {
//                    returnThingy = true;
//
//                }
//                Q.add(x);
//            }
//            Q.remove();
//        }
//        return returnThingy;
//    }


}
