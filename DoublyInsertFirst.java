package interview;

public class DoublyInsertFirst {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            DoublyInsertFirst dll=new  DoublyInsertFirst();
            dll.insertFirst(10);
            dll.insertFirst(20);
            dll.insertFirst(30);
            dll.insertFirst(40);
            
            dll.printList();
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

}
