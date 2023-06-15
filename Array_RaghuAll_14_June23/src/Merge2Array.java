import java.util.Arrays;

public class Merge2Array {
    public static void main(String[] args) {
        int[] arr={3,6,22,44,5};
        int[] brr={2,32,54,78,97,1};
        int[] z=mergeFunction(arr,brr);
//        for (int i = 0; i <z.length ; i++) {
//            System.out.print(z[i]+" ");
        System.out.println(Arrays.toString(z));
        }


     static int[] mergeFunction(int[] arr, int[] brr) {
        int[] c=new int[arr.length+ brr.length];
         for (int i = 0; i < arr.length ; i++) {
             c[i]=arr[i];
         }
         for (int j = 0; j < brr.length; j++) {
             c[j+arr.length]=brr[j];
         }return c;
    }
}
