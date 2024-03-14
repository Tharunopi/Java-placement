public class q27 {
    public static void main(String[] args) {
        String a = "153";
        int len = a.length();
        int result = 0;
        for(int i = 0;i<len;i++){
            Character m = a.charAt(i);
            int next = m - '0';
            result += Math.pow(next, len);
        }
        System.out.println(result);
    }
}
