package medium;

public class Regex {
    public static void main(String[] args) {
        String matches = "^(\\d{1,3})(\\.\\d{1,3}){2}$";
        String m = "^(\\d{1,3})";
        String str = "12.12.12";
        System.out.println(str.matches(matches));
    }
}
