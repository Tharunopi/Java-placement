public class q44 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i=0;i<numbers.length;i+=2){
            int temp = numbers[i];
            numbers[i] = numbers[i + 1];
            numbers[i + 1] = temp;     
        }
        for(int i:numbers){
            System.out.println(i + " ");
        }
    }
}
