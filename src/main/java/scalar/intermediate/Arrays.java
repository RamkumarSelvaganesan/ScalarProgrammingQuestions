package scalar.intermediate;

public class Arrays {
    public int[] reverse(int[] arr) {
        int n = arr.length - 1;
        for (int i = 0, j = n; i < j; i++, j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }

    public int[] reverseByParts(int[] arr, int start, int end) {
        for (int i = start, j = end; i < j; i++, j--) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }

    public int[] rotateByTimes(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr);
        reverseByParts(arr, 0, k - 1);
        reverseByParts(arr, k, arr.length - 1);
        return arr;
    }
}
