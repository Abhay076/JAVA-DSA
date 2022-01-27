
public class Length {

	public static Node<Integer> createdLinkedList(){
		Node<Integer> node1=new Node<Integer>(10);
		Node<Integer> node2=new Node<Integer>(20);
		Node<Integer> node3=new Node<Integer>(30);
		Node<Integer> node4=new Node<Integer>(40);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		return node1;



		
	}
	public static int length(Node<Integer> head) {
		int count=0;
        Node<Integer> temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=createdLinkedList();
         int ans=length(head);
         System.out.println(ans);

	}

}
