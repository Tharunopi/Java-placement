public class q4 {
    public static void main(String[] args) {
        int principal = 10000;
        double rate = 0.05;
        int n = 4;
        int years = 5;
        double A = principal * Math.pow(1 + (rate / n), n * years);
        int amount = (int)A - principal;
        System.out.println("total amount is " +A);
        System.out.println("the total interest after "+ n + "years is "+amount);
    }
}
