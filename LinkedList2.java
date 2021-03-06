class LinkedList2{
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node (int d){
			data=d;
			next=null;
		}
	}
	
	Node reverse(Node node){
		Node prev=null;
		Node current=node;
		Node next=null;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=prev;
		}
		node=prev;
		return node;
		
	}
	
	void display(Node node){
		while(node!=null){
			System.out.print(node.data+" ");
			node=node.next;
		}
	}
	
	public static void main(String[] ak){
		LinkedList2 s1=new LinkedList2();
		s1.head=new Node(5);
		s1.head.next=new Node(4);
		s1.head.next.next=new Node(3);
		s1.head.next.next.next=new Node(2);
		s1.head.next.next.next.next=new Node(1);
		
		
		s1.display(head);
		head=s1.reverse(head);
		System.out.println("Reverse");
		s1.display(head);
	}

}