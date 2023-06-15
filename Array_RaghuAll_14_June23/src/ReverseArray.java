public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={33,66,44,11,78};
        System.out.println(arr+" before reverse");
        for (int a:arr) {
            int reverse=getReverse(arr);
            System.out.println(reverse);
        }
///////////////////////////////////////// wrong -------------------
    }
    static int getReverse(int[] arr){
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i<j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                    j--;
                }
            }
        }return 1;
    }
}
