
public class DeleteNodeinLL {
	public static Node<Integer> deleteNode(Node<Integer> head, int pos) {
		// Write your code here.
         Node<Integer> temp=head;
        if(head==null){
            return head;
        }
         if(pos==0){
            // newNode.next=head;
            // head=newNode;
            // return head;
             // temp.next=temp;
             // return temp;
             return head.next;
        }
       
        int count=0;
        while(temp.next!=null){
          
            if(count==pos-1){
                temp.next=temp.next.next;
               // newNode=temp;
                // temp.next=newNode;
            }
            if(temp==null|| temp.next==null){
                return head;
            }
            count++;
            temp=temp.next;
        }
        return head;
	}
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
	public static void print(Node<Integer> head) {
		Node<Integer> temp= head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=createdLinkedList();
		Node<Integer> ans=deleteNode(head, 0);
		print(ans);

	}

}
