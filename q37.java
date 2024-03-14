public class q37 {
    public static void main(String[] args) {
        int a = 10;
        int b = 30;
        char c = '*';
        switch (c) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("check the enterd symbol");
                break;
        }
    }
}
