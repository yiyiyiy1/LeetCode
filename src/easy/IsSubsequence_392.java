package easy;

public class IsSubsequence_392 {
    public static void main(String[] args) {
        String s= "axb";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
    public static boolean isSubsequence(String s, String t) {
        StringBuilder sb_t = new StringBuilder(t);
        StringBuilder sb_s = new StringBuilder(s);
        for (int i = 0; i < sb_s.length(); i++) {
            if(sb_t.length()<=0) return false;
            int index = sb_t.indexOf(String.valueOf(sb_s.charAt(i)));
            if(index<0) return false;
             sb_t.delete(0,index+1);
        }
        return true;
    }
}
