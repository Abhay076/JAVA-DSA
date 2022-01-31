import java.util.Scanner;


public class NumbersOfNodes {
	
	public static BinaryTreeNode<Integer> takeInputBetter(boolean isRoot,int parentData,boolean isLeft){
		if(isRoot) {
			System.out.println("Enter the root");
		}
		else {
			if(isLeft) {
				System.err.println("Enter the left Child of "+parentData);		
			}
			else {
				System.out.println("Enter the right child of "+parentData);
				
			}
		}
		Scanner sc = new Scanner(System.in);
		int rootData=sc.nextInt();
		if(rootData==-1) {
			return null;
		}
	    BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
	    BinaryTreeNode<Integer> leftroot=takeInputBetter(false, rootData, true);
	    BinaryTreeNode<Integer> rightroot=takeInputBetter(false,rootData, false);
	    root.left=leftroot;
	    root.right=rightroot;
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
	public static int numbersOfNodes(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftchild=numbersOfNodes(root.left);
		int rightchild=numbersOfNodes(root.right);
		return 1+leftchild+rightchild;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInputBetter(true, 0, true);
		PrintTreeDetailed(root);
		 int ans=numbersOfNodes(root);
		 System.out.println(ans);

	}

}
