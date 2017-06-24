package interview;

public class DoublyDeletePosition {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            DoublyDeletePosition dll=new DoublyDeletePosition();
            dll.insertFirst(10);
            dll.insertFirst(8);
            dll.insertFirst(5);
            dll.insertFirst(3);
            
            dll.printList();
            dll.deletePosition(0);
            System.out.println("");
            dll.printList();
            dll.deletePosition(2);
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
	
	
	
	public void deletePosition(int pos){
		Node temp=head;
		if(pos==0){
			head=temp.next;
			return;
		}
		for(int i=0;i<pos && temp!=null;i++){
			temp=temp.next;
		}if(temp==null){
			System.out.println("Position not present");
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
