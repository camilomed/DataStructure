package addTwoLink;

public class AddLinked {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry=0;

        while(l1!=null && l2!=null || carry!=0){
            int digit1=(l1!=null) ? l1.val :0;
            int digit2= (l2!=null) ? l2.val:0;

            int sum = digit1+digit2+carry;
            carry =sum/10;
            int digit= sum%10;
            ListNode newNode = new ListNode(digit);
            tail.next= newNode;
            tail= newNode;
            
            l1= (l1!=null) ? l1.next:null;
            l2= (l2!=null) ? l2.next:null;
           
        }

        ListNode result = dummyHead.next;
        dummyHead.next= null;
        return result;


        
    }
}
