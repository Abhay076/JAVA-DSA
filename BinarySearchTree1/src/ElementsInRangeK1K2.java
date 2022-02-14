import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ElementsInRangeK1K2 {
	
	public static BinaryTreeNode<Integer> takeInputLevelWise(){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData=sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
        Queue<BinaryTreeNode<Integer>> pendingChildren= new LinkedList<BinaryTreeNode<Integer>>();
	    pendingChildren.add(root);
	    while(!pendingChildren.isEmpty()) {
	    	BinaryTreeNode<Integer> front=pendingChildren.poll();
	    	System.out.println("enter left child "+front.data);
	    	int left=sc.nextInt();
	       if(left!=-1) {
	    	   BinaryTreeNode<Integer> leftChild= new BinaryTreeNode<Integer>(left);
	    	   front.left=leftChild;
	    	   pendingChildren.add(leftChild);
	       }
	       System.out.println("enter right child "+front.data);
	       int right=sc.nextInt();
	       if(right!=-1) {
	    	   BinaryTreeNode<Integer> rightChild= new BinaryTreeNode<Integer>(right);
	    	   front.right=rightChild;
	    	   pendingChildren.add(rightChild);
	       }
	    }
	    return root;
	}
	
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> queue= new LinkedList<BinaryTreeNode<Integer>>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> node= queue.remove();
			String str=node.data+":L:";
			if(node.left!=null) {
				queue.add(node.left);
				str+=node.left.data+",";
			}
			else {
				str+=-1+",";
			}
			if(node.right!=null) {
				queue.add(node.right);
				str+="R:"+node.right.data;
			}
			else {
				str+="R:"+-1;
			}
			System.out.println(str);
		}
	}
	
	public static void printRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2) {
		if(root==null) {
			return;
		}
		if(root.data>=k1) {
			printRangeK1K2(root.left,k1,k2);
		}
		if(root.data>=k1&&root.data<=k2) {
			System.out.print(root.data+" ");
		}
		if(root.data<=k2) {
			printRangeK1K2(root.right, k1, k2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		printLevelWise(root);
		printRangeK1K2(root, 6, 10);
		

	}

}
