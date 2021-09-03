package com.revature.poassignments;

public class SortedArrayToBTS {
	 static BTSNode root;
	 
	    BTSNode sortedArrayToBST(int arr[], int start, int end) {
	 
	        if (start > end) {
	            return null;
	        }
	 
	        int mid = (start + end) / 2;
	        BTSNode node = new BTSNode(arr[mid]);
	        node.left = sortedArrayToBST(arr, start, mid - 1);
	        node.right = sortedArrayToBST(arr, mid + 1, end);
	         
	        return node;
	    }
	 
	    void preOrder(BTSNode node) {
	        if (node == null) {
	            return;
	        }
	        System.out.print(node.data + " ");
	        preOrder(node.left);
	        preOrder(node.right);
	    }
	     
	    public static void main(String[] args) {
	    	SortedArrayToBTS tree = new SortedArrayToBTS();
	        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7};
	        int n = arr.length;
	        root = tree.sortedArrayToBST(arr, 0, n - 1);
	        tree.preOrder(root);
	    }
}
