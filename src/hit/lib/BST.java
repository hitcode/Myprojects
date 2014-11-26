package hit.lib;

public class BST<Key extends Comparable<Key>,Value> {

	
	Node<Key,Value> root;
	
	   public BST()
	   {
	      root = null;
	      //comparator = null;
	   }
	private class Node<Key,Value>
	{
		Key key;
		Value value;
		Node<Key,Value> left;
		Node<Key,Value> right;
		
		
		Node(Key key,Value value)
		{
			this.key=key;
			this.value=value;
			this.left=null;
			this.right=null;
		}


		
		
	};
	
	
	Node<Key,Value> insert(Key key,Value value,Node<Key,Value> root)
	{
	 
		if(root==null)
			return new Node<Key, Value>(key,value);
		
		else if(root.key.compareTo(key)==0)
			return root;
		
		else if(root.key.compareTo(key)<0)
			root.left=insert(key,value,root.left);
		
		else 
			root.right=insert(key,value,root.right);
		
		return root;
		
		
	}
	
	
	
	
}
