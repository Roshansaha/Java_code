import java.util.Scanner;

public class Biggest_elemnt {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the value");
        int[] arr={44,66,1,78,34,91};

        int big=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (big<arr[i])
            {
                big=arr[i];
            }
        }
        System.out.println(big);
//
    }
}