import java.util.Scanner;

public class PreOrderTree {
	
	public static BinaryTreeNode<Integer> takeInput(boolean isTree,int parentData,boolean isLeft){
		if(isTree) {
			System.out.println("Enter the root");
		}
		else {
			if(isLeft) {
				System.out.println("Enter the left tree of "+parentData);
			}else {
				System.out.println("Enter the right tree of "+parentData);
			}
		}
		Scanner sc= new Scanner(System.in);
		int rootData=sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild= takeInput(false, rootData, true);
		BinaryTreeNode<Integer> rightChild=takeInput(false, rootData, false);
		root.left=leftChild;
		root.right=rightChild;
		return root;
		
	}
	
	public static void printTree(BinaryTreeNode<Integer> root) {
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
		printTree(root.left);
		printTree(root.right);
		
	}
	public static void perOrder(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.print(root.data+" ");
		perOrder(root.left);
		perOrder(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root= takeInput(true, 0, true);
		printTree(root);
		perOrder(root);
	}

}
