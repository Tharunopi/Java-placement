public class q35 {
    public static void main(String[] args) {
        String a = "M";
        switch (a.toLowerCase()) {
            case "m":
                System.out.println("male");
                break;
            case "f":
                System.out.println("female");
            default:
                System.out.println("only to genders");
                break;
        }
    }
}
