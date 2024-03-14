public class q25 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int val = 10;
        for(int i = 0; i < val;i++){
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
            
            
        }
    }

