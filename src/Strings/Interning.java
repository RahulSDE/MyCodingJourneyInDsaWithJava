package Strings;

public class Interning {
    public static void main(String[] args) {
        String s = "Raghav";
        // s.charAt(0) = 'M'; Error
        // s.charAt(2) = 'd'; Error
        s = "Madhav";
        String t = "Madhav";
        System.out.println(s);
    }
}
