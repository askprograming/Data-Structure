
public class ListNode {
		
		public int data;//the data stored in the node
		public ListNode next;//link to the next node in the list
	
		//constructs a node with a data and a null link
		public ListNode() {
			this(0, null);
		}
		public ListNode(int data) {
			this(data, null);
		}
		
		//
		public ListNode(int data, ListNode next) {
			this.data = data;
			this.next = next;
		}
		
}
