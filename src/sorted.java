import java.util.Random;

public class sorted {
    //        public static boolean isSorted(int[] arr2) {
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
//            }
//            else {
//                num = (long) round_about;
//            }
//        return num;
//    }
//    mission number 5 ^^^^
    public static boolean isSortedUp(int[] arr, int start, int end) {
        int startLoc = new Random().nextInt(arr.length);
        start = arr[startLoc];
        System.out.println(arr[startLoc]);
        int endLoc = new Random().nextInt(startLoc+1, arr.length);
        end = arr[endLoc];
        System.out.println(arr[endLoc]);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == start) {
                for (i = startLoc; i < arr.length; i++) {
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
        return false;
    }
//    public static boolean mostPositive(int arr[]) {
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
}