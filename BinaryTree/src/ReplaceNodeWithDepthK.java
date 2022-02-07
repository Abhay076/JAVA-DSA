import java.util.Scanner;

public class ReplaceNodeWithDepthK {
	public static BinaryTreeNode<Integer> takeTreeInputBetter(boolean isRoot,int parentData,boolean isLeft){
		if(isRoot) {
		    System.out.println("enter the root");
		 }
		else {
			if(isLeft) {
				System.out.println("Enter left child of "+parentData);
			}
			else {
				System.out.println("Enter right child of "+parentData);
			}
		}
		Scanner sc= new Scanner(System.in);
		int rootData=sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
		BinaryTreeNode<Integer> leftChild=takeTreeInputBetter(false,rootData,true);
		BinaryTreeNode<Integer> rightChild=takeTreeInputBetter(false,rootData,false);
		root.left=leftChild;
		root.right=rightChild;
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
	
	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {
		changeToDepthTree(root,0);
	}
	public static void changeToDepthTree(BinaryTreeNode<Integer> root,int depth) {
		 if (root==null)
	        {
	            return;
	        }
	        root.data=depth;
	        changeToDepthTree(root.left,depth+1);
	        changeToDepthTree(root.right,depth+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeTreeInputBetter(true, 0, true);
		changeToDepthTree(root);
		PrintTreeDetailed(root);

	}

}
