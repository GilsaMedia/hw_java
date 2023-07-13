import java.util.Random;

public class sorted {
    //    public static boolean sorted_or_not(int[] arr2) {
//        for (int i = 0; i< arr2.length; i++){
//            if (arr2[i] <= arr2[i+1]) {
//                return true;
//            }
//        }
//        return false;
//    }
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
//    mission 1 and 6 ^^^^
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
    public static boolean isSortedUp(int[] arr, int start, int end) {
        if (start < 0 || start < end && start > arr.length || end > arr.length) {
            return false;
        } else {
            arr[start] = start;
            arr[end] = end;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == start) {
                    for (i = arr[start]; i < arr.length; i++) {
                        if (arr[i] <= arr[i + 1]) {
                            if (arr[i] == end) {
                                return true;
                            }
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return false;
    }

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
}
