public class sorted {
//    public static boolean sorted_or_not(int[] arr2) {
//        for (int i = 0; i< arr2.length; i++){
//            if (arr2[i] <= arr2[i+1]) {
//                return true;
//            }
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
    public static int biggest2(int[] arr) {
        int biggest1 = 0;
        int biggest_after = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > biggest1) {
                biggest_after = biggest1;
                biggest1 = arr[i];
            }
        }
        return biggest_after;
    }
//    mission 8 ^^^^
}