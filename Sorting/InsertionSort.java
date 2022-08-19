public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 8, 7, 6, 10, 0};
        display(arr);
        sort(arr);
        display(arr);
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for(int i = 1; i < arr.length; i ++) {
            for(int j = i - 1; j >= 0; j --) {
                if(arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void display(int[] arr) {
        for(int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}