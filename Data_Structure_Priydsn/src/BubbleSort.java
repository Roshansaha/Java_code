public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {96, 80, 20, 15};
        System.out.println(arr.toString());
    }

    static void bubbleSor(int arr[]) {
        int n = arr.length - 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //        }return bubbleSor(arr);

    }
}
