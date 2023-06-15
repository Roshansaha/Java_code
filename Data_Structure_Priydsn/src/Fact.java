public class Fact {
    public static void main(String[] args) {
        int n=5;

        System.out.println(fact(n));

    }
    static  int fact(int n){
        if (n==1)
            return 1;
        else
            return n*fact(n-1);
    }
}
