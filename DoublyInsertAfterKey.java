package interview;

public class DoublyInsertAfterKey {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            DoublyInsertAfterKey dll=new DoublyInsertAfterKey();
            dll.insertLast(50);
            dll.insertAfterKey(50, 60);
            dll.insertAfterKey(60, 70);
            dll.printList();
	}
	
	public void insertAfterKey(int key,int d){
		Node n1=new Node(d);
		Node temp=head;
		
		while(temp!=null && temp.data!=key){
			temp=temp.next;
		}
		if(temp==null){
			System.out.println("Key not present");
			return;
		}
		
		if(temp.next!=null){
			n1.next=temp.next;
			temp.next.prev=n1;
			n1.prev=temp;
			temp.next=n1;
		}else{
			temp.next=n1;
			n1.prev=temp;
			
		}
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
