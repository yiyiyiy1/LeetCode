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
    ListNode solution = ans;
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        while (l1!=null||l2!=null){
            if (l1.val>l2.val){
                ans.next=new ListNode(l2.val);
                l2=l2.next;
            }
            else{
                ans.next=new ListNode(l1.val);
                l1=l1.next;
            }
            ans=ans.next;
        }
       if(l1!=null)ans.next=l1;
       if(l2!=null)ans.next=l2;
        return solution.next;
    }
}
