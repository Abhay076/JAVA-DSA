import java.util.LinkedList;
import java.util.Queue;

public class ConstructBST {
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
	public static BinaryTreeNode<Integer> SortedArrayToBST(int arr[],int s,int e){
		if(s>e) {
			return null;
		}
		int mid=(s+e)/2;
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(arr[mid]);
		root.left=root.left=SortedArrayToBST(arr,s,mid-1);
	    root.right= SortedArrayToBST(arr,mid+1,e);
	      return root;
	}
	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr){
		 return SortedArrayToBST(arr,0,arr.length-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5};
		BinaryTreeNode<Integer> root=SortedArrayToBST(arr);
		printLevelWise(root);

	}

}
