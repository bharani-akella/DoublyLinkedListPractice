package interview;

public class DoublyLinkedListTraverse {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           DoublyLinkedListTraverse dll=new DoublyLinkedListTraverse();
           
           dll.head=new Node(10);
           Node second =new Node(20);
           Node third=new Node(30);
           dll.head.next=second;
           second.prev=dll.head;
           second.next=third;
           third.prev=second;
           dll.printList();
	}
	
public void printList(){
	Node temp=head;
	while(temp!=null){
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
}

}
