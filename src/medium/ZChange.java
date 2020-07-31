package medium;

import java.util.ArrayList;
import java.util.List;

public class ZChange {

    public static void main(String[] args) {

    }
    public String convert(String s, int numRows) {
        List<StringBuilder> list = new ArrayList<>();
        if(numRows==1)return s;
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }
        int row = 0,dif=1;
        for (int i = 0; i < s.length(); i++) {
            list.get(row).append(s.charAt(i));
            row+=dif;
            if(row==numRows-1)dif=-1;
            if(row==0)dif=1;
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder sb: list
             ) {
            ans.append(sb);
        }
        return ans.toString();
    }
}
