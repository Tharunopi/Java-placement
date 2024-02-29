import java.util.Scanner;
public class program2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        a.toLowerCase();
        for (char i :a.toCharArray()){
            int ascii = i;
            if (i >=97 && i <=122){
                System.out.println("an alphabet");
                break;
            }else{
                System.out.println("not an alphabet");
                break;
            }
        }
    }
}
