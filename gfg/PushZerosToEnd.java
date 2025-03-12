package gfg;

public class PushZerosToEnd {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
        pushZerosToEndOfArray(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void pushZerosToEndOfArray(int[] arr) {
        if (arr == null || arr.length <= 1)
            return;
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }
    }
}
