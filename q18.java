import java.util.Scanner;
public class q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character a = scanner.nextLine().charAt(0);
        Character []arr =  {'a','e','i','o','u'};
        for(char i:arr){
            if(i==a){
                System.out.println("vowel");
                break;
            }else{
                System.out.println("consonent");
                break;
            }
        }
    }
}
