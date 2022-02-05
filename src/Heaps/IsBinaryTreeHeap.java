package Heaps;

public class IsBinaryTreeHeap {
    public static TreeNode createNode(int val){
        return new TreeNode(val);
    }

    public static boolean isMaxHeap(TreeNode root, int n, int index){
        if(root == null){
            return true;
        }

        if(index >= n){
            return false;
        }

        if(root.left != null && root.left.val >= root.val || root.right != null && root.right.val >= root.val){
            return false;
        }

        return isMaxHeap(root.left, n, 2*index+1) && isMaxHeap(root.right, n, 2*index+2);
    }

    public static int countNodes(TreeNode root){
        if(root == null){
            return 0;
        }
        return (1 + countNodes(root.left) + countNodes(root.right));
    }

    static boolean isHeap(TreeNode root) {
        if(root == null){
            return true;
        }
        int n = countNodes(root);

        return isMaxHeap(root, n, 0);
    }

    public static void main(String []args){
        TreeNode root = createNode(4);
        root.left = createNode(2);
        root.right = createNode(6);
        root.left.left = createNode(1);
        root.left.right = createNode(3);
        root.right.left = createNode(5);
        root.right.right = createNode(7);

        System.out.println("Is Max Heap: " + isHeap(root));
    }
}
