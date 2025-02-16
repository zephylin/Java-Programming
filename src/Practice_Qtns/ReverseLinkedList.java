package Practice_Qtns;

public class ReverseLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class ListNode {
	    int val;
	    ListNode next;
	    ListNode(int val) { this.val = val; }
	}

	
	public static ListNode reverseList(ListNode head) {
	        ListNode prev = null, current = head;
	        while (current != null) {
	            ListNode nextTemp = current.next;
	            current.next = prev;
	            prev = current;
	            current = nextTemp;
	        }
	        return prev;
	    }
	


}
