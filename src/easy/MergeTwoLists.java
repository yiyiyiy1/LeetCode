package easy;
public class MergeTwoLists {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    ListNode ans = new ListNode();
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null||l2==null){
            if(l1!=null){
                while(l1!=null){
                    ans.next=l1;
                    ans=ans.next;
                }
            }
            if(l1!=null){
                while(l1!=null){
                    ans.next=l1;
                    ans=ans.next;
                }
            }
        }
        if(l1.val>=l2.val){
            ans.next=new ListNode(l1.val);
            mergeTwoLists(l1.next,l2);
        }else{
            ans.next=new ListNode(l2.val);
            mergeTwoLists(l1,l2.next);
        }
        return ans.next;
    }
}
