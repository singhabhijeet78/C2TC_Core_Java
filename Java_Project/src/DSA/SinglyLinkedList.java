package DSA;
public class SinglyLinkedList {
	
	private Listnode head;
	
	private static class Listnode {
		private int data; //generic Type
		private Listnode next;
		
		public Listnode(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public void display() {
		Listnode current = head;
		while(current !=null) {
			System.out.print(current.data+ " -->");
			current = current.next;
		}
		System.out.print("null");
	}
	
	public static void main(String[] args) {
		SinglyLinkedList sll=new SinglyLinkedList();
		sll.head = new Listnode(10);
		Listnode second = new Listnode(1);
		Listnode third = new Listnode(8);
		Listnode fourth = new Listnode(11);
		
		//Now we will connect them together to form a chain
		sll.head.next = second; //10-->1
		second.next = third;//10-->1 -->8
		third.next = fourth;//10-->1 -->8 -->11
		
		sll.display();
	}

}
