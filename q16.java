import java.util.Scanner;
public class q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if ((year % 4==0 && year % 100 != 0) || (year % 400 == 0)){
            System.out.println("the year is leap year");
        } 
        else{
            System.out.println("the year is non leap year");
        }
    }
    
}
