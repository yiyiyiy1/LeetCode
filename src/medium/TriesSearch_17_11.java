package medium;

import bean.TrieNode;
import test.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TriesSearch_17_11 {
    public static void main(String[] args) {
        int[] n = {1,3,4,5};
        String big = "mississippi";
        String[] small = {"is","ppi","hi","sis","i","ssippi"};
        System.out.println(Arrays.deepToString(multiSearch(big,small)));
    }
    public static int[][] multiSearch(String big, String[] smalls) {
        TrieNode root = new TrieNode();
        //建字典树
        Map<String, ArrayList<Integer>> map = new HashMap<>();
        for (String s:smalls) {
            map.put(s,new ArrayList<>());
            TrieNode cur = root;
            for (char e: s.toCharArray()) {
                if (cur.children[e-'a']==null)cur.children[e-'a']=new TrieNode();
                cur = cur.children[e-'a'];
            }
            cur.word = s;
        }
        int[][] ans = new int[smalls.length][];

        for (int i = 0; i < big.length(); i++) {
            TrieNode cur = root;
            for (int j = i; j < big.length(); j++) {
                char e = big.charAt(j);
                if(cur.children[e-'a']==null)break;
                if(cur.children[e-'a']!=null&&cur.children[e-'a'].word!=null){
                    map.get(cur.children[e-'a'].word).add(i);
                }
                cur = cur.children[e-'a'];

            }
        }
        for (int i = 0; i < smalls.length; i++) {
            ans[i] = map.get(smalls[i]).stream().mapToInt(Integer::valueOf).toArray();
        }
        return ans;
    }
}
