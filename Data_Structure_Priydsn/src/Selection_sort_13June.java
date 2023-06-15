public class Selection_sort_13June {
// insertion sort ,arr[small_indx]=arr[j] where we are sorting 2 pointer approch

//    public static void main(String[] args) {
//        int[] arr={5,15,10,3,9,7};
////        int[] arr={7,15,5,2,3};
//        for (int i = 0; i <arr.length-1 ; i++) {
//            int s=i;
//            for (int j = i+1; j <arr.length ; j++) {
//                if (arr[s]>arr[j])
//                    s=j;
//                }
//                int temp=arr[s];
//                arr[s]=arr[i];
//                arr[i]=temp;
//        }
//        for (int a:arr) {
//            System.out.print(a+" ");
//        }
//    }

    // **********--- Rule 2_______**********
    public static void main(String[] args) {

        int[] arr={2,55,6,22,1};
//        int[] arr={0,2,1,2,0};
        for (int i = 0; i <arr.length-1 ; i++) {
            int small=i;
            for (int j =i+1; j <arr.length ; j++) {
                if (arr[small]>arr[j])
                    small=j;
            }

            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
        for (int a:arr)

        {
            System.out.println(a);
        }
    }
}
