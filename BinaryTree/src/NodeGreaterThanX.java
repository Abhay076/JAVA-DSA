import java.util.Scanner;

public class NodeGreaterThanX {
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
	
	public static int greaterThanx(BinaryTreeNode<Integer> root,int x) {
		if(root==null) {
			return -1;
		}
		int count=0;
		if(root.data==x) {
			count++;
		}
		 if(root.left!=null){
	         count+=greaterThanx(root.left,x);
	       }
	      if(root.right!=null){
	          count+=greaterThanx(root.right,x);
	       }		
	      return count;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeTreeInputBetter(true, 0, true);
		int ans=greaterThanx(root, 2);
		System.out.println(ans);

	}

}
