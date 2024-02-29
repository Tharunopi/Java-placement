import java.util.Scanner;
public class q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a % b == 0){
            System.out.println(a +" and "+ b +" are divisble");
        }
        else{
            System.out.println(a +" "+ b +" are non-divisble");
        }
    }
}
