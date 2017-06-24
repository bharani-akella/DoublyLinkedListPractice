package interview;

public class DoublyDeleteKey {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            DoublyDeleteKey dll=new DoublyDeleteKey();
            dll.insertFirst(10);
            dll.insertFirst(8);
            dll.insertFirst(5);
            dll.insertFirst(3);
            
            dll.printList();
            dll.deleteKey(10);
            System.out.println("");
            dll.printList();
            dll.deleteKey(3);
            System.out.println("");
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
	
	
	public void deleteKey(int key){
		Node temp=head;
		if(head==null){
			System.out.println("List is empty; insert an element prior to deletion");
			return;
		}
		if(temp!=null && temp.data==key){
			head=temp.next;
			return;
		}
		while(temp!=null && temp.data!=key){
			temp=temp.next;
		}if(temp==null){
			System.out.println("Key is not present");
			return;
		}
		if(temp.next!=null){
			temp.prev.next=temp.next;
			temp.next.prev=temp.prev;
		}else{
			temp.prev.next=temp.next;
		}
	
	}
	
}
