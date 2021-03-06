
public class TreeNodeUse {
	
	public static void printTree(TreeNode<Integer> root) {
		//special case if root is null than simple return it...// not base case 
		if(root==null) {
			return;
		}
		System.out.print(root.data+" : ");
		for(int i=0;i<root.children.size();i++) {
			System.out.print(root.children.get(i).data+" ");
		}
		System.out.println();
	    for(int i=0;i<root.children.size();i++) {
	    	TreeNode<Integer> child=root.children.get(i);
	    	printTree(child);
	    }
	}
	
	public static int countNumberNode(TreeNode<Integer> root) {
		int count=1;
		for(int i=0;i<root.children.size();i++) {
			int countNodes=countNumberNode(root.children.get(i));
			count+=countNodes;
			
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode<Integer> root =new TreeNode<Integer>(4);
		TreeNode<Integer> node1=new TreeNode<Integer>(2);
		TreeNode<Integer> node2=new TreeNode<Integer>(3);
		TreeNode<Integer> node3=new TreeNode<Integer>(1);
		TreeNode<Integer> node4=new TreeNode<Integer>(5);
		TreeNode<Integer> node5=new TreeNode<Integer>(6);
		root.children.add(node1);
		root.children.add(node2);
		root.children.add(node3);
		node2.children.add(node4);
		node2.children.add(node5);
//		printTree(root);
		int ans=countNumberNode(root);
		System.out.println(ans);

	}

}
