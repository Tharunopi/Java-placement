public class q5 {
    public static void main(String[] args) {
        int principal = 10000;
        double rate = 0.05;
        int years = 5;
        double A = principal * rate * years;
        int amount = (int) A - principal;
        System.out.println("total amount is " +A);
        System.out.println("the total interest after "+ years + "years is "+amount);
    }    
}
