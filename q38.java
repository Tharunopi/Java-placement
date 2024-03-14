public class q38 {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7,8,9,10};
        int odd[] = new int[num.length];
        int even[] = new int[num.length];
        int odd_index = 0;
        int even_index = 0;
        for (int i : num) {
            if(i % 2 == 0){
                even[even_index] = i;
                even_index++;
            }
            else{
                odd[odd_index] = i;
                odd_index++;
            }
        }
        for(int i=0; i<odd_index;i++){
            System.out.print(odd[i] + " ");
        }
        System.out.println();
        for(int i =0;i<even_index;i++){
            System.out.print(even[i] + " ");
        }
    }
}
