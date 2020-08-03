package easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(str));
    }
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length<=0) return "";
        String pre = strs[0];
        StringBuilder same = new StringBuilder(pre);
        for (int i = 0; i < strs.length; i++) {
            String now = strs[i];
            if(i!=0){
                for (int j = 0; j < same.length() ; j++) {
                    if (j>=now.length()||now.charAt(j)!=same.charAt(j)){
                        same.delete(j,same.length());
                        break;
                    }
                }
            }

        }
        if(same.length()<=0)return "";
        return same.toString();
    }
}
