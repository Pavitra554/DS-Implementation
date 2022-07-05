package DATA_STRUCTURE.Tree;

public class BinaryTree {
    static class node {
        int data;
        node left;
        node right;

        node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    node root;

    // Tree Traversals

    // InOrder
    void printInorder(node n) {
        if (n == null)
            return;
        printInorder(n.left);
        System.out.print(n.data + " ");
        printInorder(n.right);
    }

    // PostOrder
    void printPostOrder(node n) {
        if (n == null)
            return;
        printPostOrder(n.left);
        printPostOrder(n.right);
        System.out.print(n.data + " ");
    }

    // PreOrder
    void prinPreOrder(node n) {
        if (n == null)
            return;
        System.out.print(n.data + " ");
        prinPreOrder(n.left);
        prinPreOrder(n.right);
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.root = new node(10);
        bt.root.left = new node(20);
        bt.root.right = new node(30);
        bt.root.left.left = new node(40);
        bt.root.left.right = new node(50);
        bt.root.right.left = new node(60);
        bt.root.right.right = new node(100);

        // Traversals

        // Inorder
        bt.printInorder(bt.root);
        System.out.println();

        // postorder
        bt.printPostOrder(bt.root);
        System.out.println();

        // postorder
        bt.prinPreOrder(bt.root);
        System.out.println();

    }
}