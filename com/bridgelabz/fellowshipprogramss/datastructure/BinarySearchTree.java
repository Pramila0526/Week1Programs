package com.bridgelabz.fellowshipprogramss.datastructure;

import com.bridgelabz.fellowshipprogramss.utility.Utility;

/**
 * @author Pramila0526
 * Date   :19/11/2019
 *
 */
class BinarySearchTree
{
  Node root;
  
  class Node 
    {
		int key;
		Node left, right;

			public Node(int item)
			{
			key = item;
			left = right = null;
			}
}

			void insert(int key) 
			{
			root = insertRec(root, key);
			}


			Node insertRec(Node root, int key) 
			{
			if (root == null) 
			{
			root = new Node(key);
			return root;
			}


		if (key < root.key)
		root.left = insertRec(root.left, key);
		
		else if (key > root.key)
		root.right = insertRec(root.right, key);

		return root;
		}


		void inorder() 
		{
		inorderRec(root);
		}


		void inorderRec(Node root) 
		{
		if (root != null) 
		{
		 
		
		System.out.println(root.key);
		inorderRec(root.right);
		inorderRec(root.left);
		}
		}
		
		public static int combination(int count)
		{
			 int n1,n2;
			int result=0;
			if(count==1 || count==0)
		
				return 1;
		
			for(int i=1;i<=count;i++)
			{
				n1=combination(i-1);
				n2=combination(count-i);
				result +=n1*n2;
				
			}
			return result;
		}




public static void main(String[] args) 
{
BinarySearchTree tree = new BinarySearchTree();
int count=0;
tree.insert(50);
count++;
tree.insert(30);
count++;
tree.insert(20);
count++;
tree.insert(40);
count++;
tree.insert(70);
count++;
tree.insert(60);
count++;
tree.insert(80);
count++;
tree.inorder();
System.out.println("Node counts are : " +count);
System.out.println("Number of Possible Nodes are : " );
System.out.println(combination(count)); 

}
}