import java.util.Scanner;

public class PrintNodesWithoutSibling {
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
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root==null){
            return;
        }
       if(root.left!=null && root.right==null){
            System.out.print(root.left.data+" ");
       }
        if(root.right!=null&&root.left==null){
            System.out.print(root.right.data+" ");
        }
        printNodesWithoutSibling(root.left);
        printNodesWithoutSibling(root.right);        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeTreeInputBetter(true, 0, true);
		printNodesWithoutSibling(root);
	   PrintTreeDetailed(root);	

	}

}
