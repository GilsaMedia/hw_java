import java.security.PublicKey;

public class sorted {
//    public static boolean sorted_or_not(int[] mat) {
//        for (int i = 0; i < mat.length; i++) {
//            if (mat[i] <= mat[i + 1]) {
//                return true;
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
//    public static boolean mostPositive(int arr[]) {
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
//    public static String equal_or_not(String str1, String str2) {
//        if (str1.contentEquals(str2) || str2.contentEquals(str1)) {
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
//            boolean b = sorted_or_not(mat[j]);
//            if (b) {
//                j++;
//            }
//            else {break;}
//        }
//        System.out.println(j);
//        System.out.println(mat.length);
//        System.out.println(j == (mat.length-1));
//        return j == (mat.length - 1);
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
//        int howmuch = 0;
//        for (int i = 0; i < line.length(); i++) {
//            if (line.charAt(i) == linechar) {
//                howmuch++;
//            }
//        }
//        return howmuch;
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
//    public static String litleWord(String line) {
//        String line2 = line.toLowerCase();
//        return line2;
//    }
}
