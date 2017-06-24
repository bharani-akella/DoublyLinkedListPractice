package interview;

public class DoublyReverse {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    DoublyReverse dll=new DoublyReverse();
    dll.insertFirst(10);
    dll.insertFirst(20);
    dll.insertFirst(30);
    System.out.println("Initial list->");
    dll.printList();
    System.out.println("\nAfter reversing->");
    dll.reverse();
	}
public void printList(){
	Node temp=head;
	while(temp!=null){
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
}
public void insertFirst(int d){
	Node n1=new Node(d);
	if(head==null){
		head=n1;
		return;
	}
	n1.next=head;
	head.prev=n1;
	head=n1;
}
public void reverse(){
   Node temp=head;
   while(temp.next!=null){
	   temp=temp.next;
   }
   Node last=temp;
   while(last!=null){
	   System.out.print(last.data+"->");
	   last=last.prev;
   }
}

}
