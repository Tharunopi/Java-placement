import java.util.Scanner;
public class program1 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a < 0){
            System.out.println("enter number is Negative");
        }
        else{
            System.out.println("enter number is Positive");
        }
    }
}
