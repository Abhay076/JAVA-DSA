class TrieNode{
	char data;
	boolean isTerminal;
	TrieNode children[];
	
	public TrieNode(char data) {
		this.isTerminal=false;
		this.children=new TrieNode[26];
	}
}
public class Trie {
	
	private TrieNode root;
	
	public Trie() {
		root =new TrieNode('\0');
	}
	private void addHelper(TrieNode root,String word) {
		if(word.length()==0) {
			root.isTerminal=true;
			return;
		}
		int childIndex=word.charAt(0)-'A';
		TrieNode child= root.children[childIndex];
		if(child==null) {
			child= new TrieNode(word.charAt(0));
			root.children[childIndex]=child;
		}
		addHelper(root, word.substring(1));
	}
     public void add(String word) {
               addHelper(root, word);
               
     }
    
     public void remove(String word) {
    	 
     }
     
}
