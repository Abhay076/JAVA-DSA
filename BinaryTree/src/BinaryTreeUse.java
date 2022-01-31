
public class BinaryTreeUse {
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
	
	public static void PrintTree(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return;
		}
		System.out.println(root.data);
		PrintTree(root.left);
		PrintTree(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(1);
		BinaryTreeNode<Integer> rootleft= new BinaryTreeNode<Integer>(2);
		BinaryTreeNode<Integer> rootright= new BinaryTreeNode<Integer>(3);
		root.left=rootleft;
		root.right=rootright;
		
		BinaryTreeNode<Integer> leftTwo= new BinaryTreeNode<Integer>(4);
		BinaryTreeNode<Integer> rightTwo= new BinaryTreeNode<Integer>(5);
		rootleft.right=leftTwo;
		rootright.left=rightTwo;
		PrintTreeDetailed(root);

	}

}
