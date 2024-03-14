public class q31 {
    public static void main(String[] args) {
        int a = 24;
        int b = 36;
        int lcm = (a * b) / gcd(a, b);
        System.out.println(lcm);
    }

    public static int gcd(int a, int b) {
        while(b!= 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
