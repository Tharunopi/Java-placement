public class q12 {
    public static void main(String[] args) {
        double maths = 87;
        double biology = 89;
        double physics = 78;
        double chemistry = 93;
        double social_science = 99;
        double result = (maths + biology + physics + chemistry + social_science) / 5;
        System.out.println("Result is "+ result);
        if (result < 45){
            System.out.println("Your grade for marks "+ result +" is F grade");
        }
        else if (result < 60){
            System.out.println("Your grade for marks "+ result +" is B grade");
        }
        else if (result < 70){
            System.out.println("Your grade for marks "+ result +" is A grade");
        }
        else if (result < 80){
            System.out.println("Your grade for marks "+ result +" is A+ grade");
        }
        else if (result < 90){
            System.out.println("Your grade for marks "+ result +" is O grade");
        }
    }
}
