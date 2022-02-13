import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TakeInputLevelWise {
	
	public static BinaryTreeNode<Integer> takeInputLevel(){
		Scanner sc = new Scanner(System.in);
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
			System.out.println("Enter left child of "+front.data);
			int left=sc.nextInt();
			if(left!=-1) {
				BinaryTreeNode<Integer> leftChild= new BinaryTreeNode<Integer>(left);
				front.left=leftChild;
				pendingChildren.add(leftChild);
			}
			System.out.println("Enter right child of "+front.data);
			int right=sc.nextInt();
			if(right!=-1) {
				BinaryTreeNode<Integer> rightChild= new BinaryTreeNode<Integer>(right);
				front.right=rightChild;
				pendingChildren.add(rightChild);
			}
		}
		return root;
	}
	public static void PrintTreeDetailed(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
        System.out.print(root.data+":");
        if(root.left!=null) {
        	System.out.print("L"+root.left.data+", ");
        }
        if(root.right!=null) {
        	System.out.print("R"+root.right.data);
        }
        System.out.println();      
		PrintTreeDetailed(root.left);
		PrintTreeDetailed(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root= takeInputLevel();
		PrintTreeDetailed(root);

	}

}
