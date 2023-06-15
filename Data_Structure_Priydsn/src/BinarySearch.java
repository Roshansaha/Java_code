public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        int target=210;
        int l=0, h=arr.length-1;
        while (l<=h){
            int mid=(l+h)/2;
            if(target==arr[mid])
            {
                System.out.println("found");
                return;
            } else if (target>arr[mid]) {
                l=mid+1;
            }
            else
                h=mid-1;
        }
        System.out.println("not found");
    }

    public static class BubbleSort {
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

    public static class Delete_indexvalue {
        public static void main(String[] args) {
          int[] arr={10,20,30,40,50};
          int[] temp=new int[arr.length-1];
          int target=2, index=0;
            for (int i = 0; i < arr.length; i++)
            {
                if(i !=target)
                    temp[index++]=arr[i];
            }
            arr=temp;
            temp=new int[arr.length-1];
            for (int a:arr) {
                System.out.println(a);
            }
        }
    }
}
