import java.util.Comparator;
import java.util.Iterator;


public class BstTree<T extends Comparable<T>> implements Iterable<T> {

	private BST<T> root;
	private Comparator<T> comp;
	
	public BstTree(Comparator<T> c)
	
	{
		comp=c;
		root=null;
	}
	
   public BstTree()
	
	{
		comp=null;
		root=null;
	}
   
   private int compare(T x,T y)
   {
	 if(comp==null)
	return x.compareTo(y);
	 
	 else
	return  comp.compare(x, y);
	   
	   
   }
   
   private void insert0(T t)
   {
	   root=insert(t,root);
   }
   
   private void preorder0()
   {
	   preorder(root);
   }
   private BST<T>insert(T t,BST<T> root)
   {
	   
	   if(root==null)
	   {
		   return new BST<T>(t);
	   }
	   
	   else
	   {
		   
		   if(compare(t,root.getT())>0)
		   {
			   root.right=insert(t,root.getRight());
		   }
		   
		   else
		   {
			   root.left=insert(t,root.getLeft());  
		   }
	   }
	return root;
	   
	   
   }
   
   private void postorder(BST<T> root)
   {
	   
	   if(root!=null)
	   {
		   
		   postorder(root.getLeft());
		   
	   }
   }
   private void preorder(BST<T> root)
   {
	   if(root!=null)
	   {
		   preorder(root.getLeft());
		   System.out.print(root.getT()+"here ");
		   preorder(root.getRight());
		   
		   
		   
	   }
	   
   }

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public static void main (String [] args)
	{
		
		Integer [] a={1,22,3,41,5};
		BstTree<Integer> tree=new BstTree<Integer>();
		
		for(Integer n : a) tree.insert0(n);
		 System.out.print("jiyo ");
		tree.preorder(tree.root);
		
		
	}
	
}
