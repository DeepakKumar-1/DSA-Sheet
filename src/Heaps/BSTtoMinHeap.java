package Heaps;

import java.util.ArrayList;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(){
        this.left = null;
        this.right = null;
    }

    TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class BSTtoMinHeap {

    public static ArrayList<Integer> bstToArray(TreeNode root, ArrayList<Integer> list){
        // Store Element in InOrder Fashion
        if(root != null){
            bstToArray(root.left, list);
            list.add(root.val);
            bstToArray(root.right, list);
        }
        return list;
    }
    static int index = 0;
    public static void arrToMinHeap(TreeNode root, ArrayList<Integer> list){
        if(root != null) {
            root.val = list.get(index++);
            arrToMinHeap(root.left, list);
            arrToMinHeap(root.right, list);
        }
    }
    public static void convertToMinHeap(TreeNode root){
        ArrayList<Integer> arr = bstToArray(root, new ArrayList<>());
        arrToMinHeap(root, arr);
    }

    public static TreeNode createNode(int val){
        return new TreeNode(val);
    }

    public static void preOrder(TreeNode root){
        if(root != null){
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public static void main(String []args){
        // BST formation
        TreeNode root = createNode(4);
        root.left = createNode(2);
        root.right = createNode(6);
        root.left.left = createNode(1);
        root.left.right = createNode(3);
        root.right.left = createNode(5);
        root.right.right = createNode(7);

        System.out.println("Preorder Traversal Before Conversion : ");
        preOrder(root);
        convertToMinHeap(root);

        System.out.println("\nPreorder Traversal After Conversion :");
        preOrder(root);
    }
}
