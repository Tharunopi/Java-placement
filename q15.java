public class q15 {
    public static void main(String[] args) {
        String a ="HI";
        String b = "upper case";
        b.toLowerCase();
        if (b == "lower case"){
            System.out.println(a.toUpperCase());
        }
        else if (b == "upper case"){
            System.out.println(a.toLowerCase());
        }
        else{
            System.out.println("enter a vaild conversion meathod");
        }
    }
}
