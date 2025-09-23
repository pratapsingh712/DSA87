package easyProblems;


class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class MaximumDepth {

    public static void main(String[] args) {

        // Representation of the input tree:
        //     12
        //    /  \
        //   8   18
        //  / \
        // 5   11
        Node root = new Node(3);
        root.left = new Node(9);
        root.right = new Node(20);
        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println(height(root));
    }

    static int height(Node root) {
        if (root == null)
            return -1;

        // compute the height of left and right subtrees
//        int lHeight = height(root.left);
//        int rHeight = height(root.right);

        return Math.max(height(root.left)+1, height(root.right)+1); // this function and above function are doing the same job we are returning edges
    }
}
