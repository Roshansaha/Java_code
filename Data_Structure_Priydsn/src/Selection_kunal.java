import java.util.Arrays;

public class Selection_kunal {
    public static void main(String[] args) {
        int[] arr={21,55,66,2,1,7};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void selection(int[] arr) {
         for (int i = 0; i < arr.length; i++) {
             int last=arr.length-i-1;
             int maxIndex=getMaxIndex(arr,0,last);
             swap(arr,maxIndex,last);
         }
    }

    private static int getMaxIndex(int[] arr, int start, int last) {
        int max=start;
        for (int j = start; j <=last ; j++) {
            if (arr[max]<arr[j])
                max=j;

        }return max;
    }
    static void  swap(int[] arr,int start,int second){
        int temp=arr[start];
        arr[start]=arr[second];
        arr[second]=temp;
    }
}
