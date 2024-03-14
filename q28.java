public class q28 {
    public static void main(String[] args) {
        int a = 97;
        boolean result = false;
        for(int i = 2; i < a + 1; i++){
            if(i % a == 0){
                result = true;
                break;
            }
        }
        System.out.println(result);
    }
}
