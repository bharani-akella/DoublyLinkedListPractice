package interview;

public class DoublyInsertLast {
	Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                DoublyInsertLast dll=new DoublyInsertLast();
                dll.insertLast(10);
                dll.insertLast(20);
                dll.insertLast(30);
                
                dll.printList();
	}
	
public void printList(){
	Node temp=head;
	while(temp!=null){
		System.out.print(temp.data+"->");
		temp=temp.next;
	}
}

public void insertLast(int d){
	Node n1=new Node(d);
	if(head==null){
		head=n1;
		return;
	}
	Node temp=head;
	while(temp.next!=null){
		temp=temp.next;
	}
	temp.next=n1;
	n1.prev=temp;
}

}

