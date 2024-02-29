public class q7 {
    public static void main(String[] args) {
        double a = 6;
        double b = 8;
        double c = 10;
        double s = (a + b + c) / 2;
        double area = (s * (s - a) * (s - b) * (s - c));
        double sqr = Math.sqrt(area);
        System.out.println(sqr);
    }
}
