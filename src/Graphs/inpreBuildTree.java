package Graphs;

import java.util.LinkedList;
import java.util.Queue;

class BinaryTreeNode<T>{
    int data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
    BinaryTreeNode(int value){
        this.data = value;
        this.left = null;
        this.right = null;
    }
}
public class inpreBuildTree {

    public static void printTreeLevelWise(BinaryTreeNode<Integer> root) {
        if(root.data==-1) {
            return;
        }
        Queue<BinaryTreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {

                int n = q.size();
                while (n > 0) {
                    BinaryTreeNode<Integer> front=q.remove();
                    System.out.print(front.data+" ");
                    if(front.left!=null) {
                        q.add(front.left);
                    }
                    if(front.right!=null) {
                        q.add(front.right);
                    }


                    n--;
                }
                System.out.println();



        }
    }
    public static int findPosition(int[] inOrder, int element, int n) {
        for (int i = 0; i < n; i++) {
            if (inOrder[i] == element) {
                return i;
            }
        }
        return -1;
    }

    private static int index = 0;
    public static BinaryTreeNode<Integer> solve(int[] preOrder, int[] inOrder, int inorderStart,
                                                int inorderEnd, int n) {
        if (inorderStart > inorderEnd) {
            return null;
        }

        int element = preOrder[index];
        index++;

        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(element);
        int position = findPosition(inOrder, element, n);

        if(position == -1){
            return null;
        }

        root.left = solve(preOrder, inOrder, inorderStart, position - 1, n);
        root.right = solve(preOrder, inOrder, position + 1, inorderEnd, n);
        return root;

    }



    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {

        int n = inOrder.length;

        BinaryTreeNode<Integer> root = solve(preOrder, inOrder, 0, inOrder.length - 1, n);
        return root;

    }
    public static void main(String[] args) {
        int inorder[]= {4,2,5,1,6,3,7};
        int preOrder[]= {1,2,4,5,3,6,7};
        BinaryTreeNode<Integer> root=buildTree(preOrder,inorder);
        printTreeLevelWise(root);

    }

}