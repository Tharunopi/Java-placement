public class q21 {
    public static void main(String[] args) {
        int cost_price = 1000;
        int selling_price = 1024;
        int proit_loss = cost_price - selling_price;
        if(proit_loss>=0){
            System.out.println("The loss is "+proit_loss);
        }
        else{
            System.out.println("The profit is "+(proit_loss - (proit_loss *2)));
        }
    }
}
