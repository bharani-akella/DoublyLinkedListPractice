package interview;

public class DoublyLinkedList {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             DoublyLinkedList dll=new DoublyLinkedList();
             dll.insertFirst(10);
             dll.insertLast(40);
             dll.insertLast(100);
             dll.insertAfterKey(100, 50);
             dll.insertAfterKey(50, 60);
             dll.insertAfterKey(10, 20);
             dll.insertBeforeKey(60, 55);
             
             dll.insertBeforeKey(10, 5);
             dll.insertBeforeKey(20, 15);
             dll.insertBeforeKey(100, 80);
             
             dll.PrintList();
             System.out.println("");
             dll.printReverse();
             
            
	}
	public void PrintList(){
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
			System.out.println("Key not present");
			return;
		}
		n1.prev=temp.prev;
		temp.prev.next=n1;
		n1.next=temp;
		temp.prev=n1;
	}
	
	public void insertAfterKey(int key,int d){
		if(head==null){
			System.out.println("Insert a node first");
			return;
		}
		Node n1=new Node(d);
		Node temp=head;
		if(temp!=null && temp.data==key){
		n1.next=temp.next;
		temp.next.prev=n1;
		temp.next=n1;
		n1.prev=temp;
		return;
		}
		while(temp!=null && temp.data!=key){
			temp=temp.next;
		}
		
		if(temp==null){
			System.out.println("Key not present");
			return;
		}
		n1.next=temp.next;
		if(temp.next!=null){
			temp.next.prev=n1;
			temp.next=n1;
			n1.prev=temp;
		}else{
			temp.next=n1;
			n1.prev=temp;
		}
		
	}
	
public void printReverse(){
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
