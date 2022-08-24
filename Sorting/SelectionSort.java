public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 8, 7, 6, 10, 0};
        display(arr);
        sort(arr);
        display(arr);
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n - 1; i ++) { // O()
            int min = i;
            for(int j = i + 1; j < n; j ++) {
                if(arr[j] < arr[min]) min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }

    public static void display(int[] arr) {
        for(int i : arr) System.out.print(i + " ");
        System.out.println();
    }
}