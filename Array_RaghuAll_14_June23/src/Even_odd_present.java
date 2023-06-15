public class Even_odd_present {
    public static void main(String[] args) {
        int[] arr={2,55,6,77,89,4};

    }
    void dispArray(int[] arr)
    {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"");
        }
        System.out.println();
    }
    int getBiggest(int[] arr){
        int big=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (big>arr[i])
            {
                big=arr[i];
            }

        }return big;
    }
    int getSmallest(int[] arr){
        int small=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (small>arr[i])
                small=arr[i];
        }return small;
    }
    int sumOfArray(int[] arr){
        int sum=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];
        }return sum;
    }
    int[] countEvenOdd(int[] arr){
        int evenc=0,oddc=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]%2==0)
                evenc++;
            else oddc++;

        }
        int[] count={evenc,oddc};
        return count;
    }
}
