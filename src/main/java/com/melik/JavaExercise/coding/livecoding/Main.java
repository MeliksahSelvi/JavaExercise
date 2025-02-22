public class Main {

    public static void main(String[] args) {

//        int[]arr= {11,2,3,4,5,7,8,6};
//        int result = isTrue(arr);
//        System.out.println("result-> "+result);
    }

    private static int isTrue(int[] arr) {
        int result = -1;
        for (int i = 1; i < arr.length - 1; i++) {
            int previous = arr[i - 1];
            int self = arr[i];
            int next = arr[i + 1];
            if (previous < self && next < self) {
                result = i;
                break;
            }
        }
        return result;
    }
}