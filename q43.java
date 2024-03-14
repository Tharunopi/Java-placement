public class q43 {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 500, 5};
        int num1[] = new int[num.length - 1];
        int delete = 0;
        for(int i =0, j=0;i<num.length;i++){
            if(i == delete){
                continue;
            }
            else{
                num1[j++] = num[i];
            }
        }
        for(int i:num1){
            System.out.println(i + " ");
        }
    }
}
