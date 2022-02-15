import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NodeToRootPath {
	public static BinaryTreeNode<Integer> takeInputeveWise(){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter root data");
		int rootData=sc.nextInt();
		if(rootData==-1) {
			return null;
		}
		BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
		Queue<BinaryTreeNode<Integer>> pendingChild= new LinkedList<>();
		pendingChild.add(root);
		while(!pendingChild.isEmpty()) {
			BinaryTreeNode<Integer> front=pendingChild.poll();
			System.out.println("enter left child "+front.data);
			int left=sc.nextInt();
			if(left!=-1) {
				BinaryTreeNode<Integer> leftChild=new BinaryTreeNode<Integer>(left);
				front.left=leftChild;
				pendingChild.add(leftChild);
			}
			System.out.println("enter right child "+front.data);
			int right=sc.nextInt();
			if(right!=-1) {
				BinaryTreeNode<Integer> rightChild= new BinaryTreeNode<Integer>(right);
				front.right=rightChild;
				pendingChild.add(rightChild);
			}
		}
		return root;
	}
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		Queue<BinaryTreeNode<Integer>> queue= new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryTreeNode<Integer> node=queue.remove();
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
	
	public static ArrayList<Integer> nodeToRootPath(BinaryTreeNode<Integer> root,int x){
		if(root==null) {
			return null;
		}
		if(root.data==x) {
			ArrayList<Integer> Output= new ArrayList<>();
			Output.add(root.data);
			return Output;
		}
		ArrayList<Integer> leftOutput= nodeToRootPath(root.left, x);
		if(leftOutput!=null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		ArrayList<Integer> rightOutput=nodeToRootPath(root.right, x);
		if(rightOutput!=null) {
			rightOutput.add(root.data);
			return rightOutput;
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode<Integer> root=takeInputeveWise();
		ArrayList<Integer> path=nodeToRootPath(root, 1);
		if(path==null) {
		   System.out.println("Not found");
		}
		else {
			for(int i: path) {
				System.out.println(i);
			}
		}

	}

}
