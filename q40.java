public class q40 {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 500, 5};
        int largest = 0;
        for(int i:num){
            if(i > largest){
                largest = i;
            }
        }
        System.out.println(largest);
    }
}
