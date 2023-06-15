public class PrimeNo {
    public static void main(String[] args) {
        int n=11;
        while (true) {
            n = n+1;
            int rs = isPrime(n);
                System.out.println(rs);
            break;
        }
    }
    public  static int isPrime(int x) {
        for (int i = 2; i <= x/2; i++) {
            if (x % i == 0)
                return -1;
        }
        return x;
    }
}
