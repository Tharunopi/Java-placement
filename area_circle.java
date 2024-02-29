import java.util.Scanner;

public class area_circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the radius of the circle");
        double radius = scanner.nextDouble();
        double area = 3.14 * radius * radius;
        double circumference = 2 * 3.14 * radius;
        System.out.println("area of the circle is " + area);
        System.out.println("circumference of the circle is " + circumference);

    }
}
