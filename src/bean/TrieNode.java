package bean;

public class TrieNode {
    public TrieNode[] children;
    public String word;
    public TrieNode() {
        children = new TrieNode[26];
    }
}

