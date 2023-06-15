import java.util.Scanner;

public class Smallest_elemnt_method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter siza of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter value "+n);
        for (int i = 0; i <arr.length ; i++) {
            arr[i]=sc.nextInt();
        }
        int small=getSmallest(arr);
        System.out.println(small+"  is smallest");
    }

    static int getSmallest(int[] arr) {
        int small=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (small>arr[i])
                small=arr[i];
        }return small;
    }
}
