import java.util.Scanner;

public class InOrder {
	
	public static BinaryTreeNode<Integer> takeInput(boolean isTree,int parentData,boolean isLeft){
		if(isTree) {
			System.out.println("Enter the Root");
		}
		else {
			if(isLeft) {
				System.out.println("Enter the left of "+parentData);
			}
			else {
				System.out.println("Enter the right of "+parentData);
			}
		}
		Scanner sc= new Scanner(System.in);
		int rootData=sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> rootLeft= takeInput(false, rootData, true);
		BinaryTreeNode<Integer> rootRight= takeInput(false, rootData, false);
		root.left=rootLeft;
		root.right=rootRight;
		return root;
	}
	public static void printTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+":");
		if(root.left!=null) {
			System.out.print("L"+root.left.data+" ,");
		}
		if(root.right!=null) {
			System.out.print("R"+root.right.data);
		}
		System.out.println();
		printTree(root.left);
		printTree(root.right);
		
	}
	public static void inOrder(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root= takeInput(true, 0, true);
		printTree(root);
		inOrder(root);

	}

}
