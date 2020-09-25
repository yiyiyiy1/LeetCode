package medium;

import bean.ListNode;

public class EnterToTheCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        ListNode meet = null;
        while(fast!=slow){
            if(fast==null||slow==null)break;
            fast = head.next.next;
            slow = head.next;
        }
        if(slow!=null||fast!=null) meet = slow;
        else return null;
        return null;
    }
}
