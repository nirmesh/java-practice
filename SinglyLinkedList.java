class SinglyLinkedList{

	private Node head;

	private static class  Node{
		private Node next;
		private int data;
		private Node(int data){
			this.data =data;
			this.next=null;
		}

	}

	public void display(){
		 Node current =head;
		while(current!=null) {
			System.out.print(current.data+" --> ");
			current =current.next;

		}
		System.out.println("null");
	}

	public int length(){
		int count=0;
		Node current =head;
		while(current!=null) {
		current = current.next;
			count++;
		}
		return count;
	}
	public void insertAtFirst(int value){
	 	Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}

	public void insertAtLast(int value) {
		Node newNode = new Node(value);
		//newNode.next = null;
		Node current = head;
		if(head==null){
			head =newNode;
			return;
		}
		while (current.next != null){
			current = current.next;
		}
		current.next = newNode;
	}

	public static void main(String [] args){
		SinglyLinkedList  sll = new SinglyLinkedList();
		sll.head = new Node(10);
		Node first = new Node(20);
		Node second = new Node(30);
		Node third = new Node(40);

		// lets link
		sll.head.next = first;
		first.next= second;
		second.next = third;
		third.next=  null;
		sll.insertAtFirst(5);
		sll.insertAtLast(100);
		sll.display();
		System.out.println(sll.length());;
	}
}