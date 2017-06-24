package interview;

public class DoublyInsertBeforeKey {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            DoublyInsertBeforeKey dll=new DoublyInsertBeforeKey();
            dll.insertFirst(10);
            dll.insertBeforeKey(10, 5);
            dll.insertBeforeKey(10, 8);
            dll.insertBeforeKey(5, 3);
            
            dll.printList();
	}

	public void insertFirst(int d){
		Node n1=new Node(d);
		Node temp=head;
		if(head==null){
			head=n1;
			return;
		}
		n1.next=head;
		head.prev=n1;
		head=n1;
	}
	
	public void printList(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		
	}
	
	public void insertBeforeKey(int key,int d){
		Node n1=new Node(d);
		Node temp=head;
		if(temp!=null && temp.data==key){
			n1.next=head;
			head.prev=n1;
			head=n1;
			return;
		}
		while(temp!=null && temp.data!=key){
			temp=temp.next;
		}if(temp==null){
			System.out.println("Key is not present");
			return;
		}
		n1.prev=temp.prev;
		temp.prev.next=n1;
		n1.next=temp;
		temp.prev=n1;
	}
	
}
