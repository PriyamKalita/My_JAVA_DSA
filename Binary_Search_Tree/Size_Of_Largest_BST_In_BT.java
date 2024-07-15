public class Size_Of_Largest_BST_In_BT {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    public static int maxBST = 0;

    public static Info largestBST(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }
        Info leftInfo = largestBST(root.left);
        Info rightInfo = largestBST(root.right);

        if (leftInfo.isBST && rightInfo.isBST && root.data > leftInfo.max && root.data < rightInfo.min) {
            int size = leftInfo.size + rightInfo.size + 1;
            maxBST = Math.max(maxBST, size);
            int min = Math.min(root.data, leftInfo.min);
            int max = Math.max(root.data, rightInfo.max);
            return new Info(true, size, min, max);
        } else {
            return new Info(false, 0, 0, 0);
        }
    }

    public static void main(String[] args) {
        /*
                 50
                /  \
               30   60
              / \   / \
             5   20 45 70
                       / \
                      65  80 
        */

        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        root.right = new Node(60);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        /*
                  60
                 /  \
                45  70
                    / \
                   65 80
                
                Expected BST : Size = 5

        */

        Info info = largestBST(root);
        System.out.println("Largest BST Size : " + maxBST);
    }
}
