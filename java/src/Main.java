class Node {
    int value;
    Node left, right;
    int count;

    public Node(int value) {
        this.value = value;
        left = right = null;
        count = 1;
    }
}

class BST {
    Node root;

    public BST() {
        root = null;
    }

    public void insert(int value) {
        root = insertUtil(root, value);
    }

    private Node insertUtil(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insertUtil(node.left, value);
        } else if (value > node.value) {
            node.right = insertUtil(node.right, value);
        }

        node.count++; // Update the count of nodes in the subtree rooted at this node

        return node;
    }

    public int countSubtreesInRange(int low, int high) {
        return countSubtreesInRangeUtil(root, low, high);
    }

    private int countSubtreesInRangeUtil(Node node, int low, int high) {
        if (node == null) {
            return 0;
        }

        if (node.value >= low && node.value <= high) {
            return 1 + countSubtreesInRangeUtil(node.left, low, high) + countSubtreesInRangeUtil(node.right, low, high);
        } else if (node.value < low) {
            return countSubtreesInRangeUtil(node.right, low, high);
        } else {
            return countSubtreesInRangeUtil(node.left, low, high);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BST bst = new BST();
        int[] nodes = {5,50,1,40,5,100};
        int low = 5;
        int high = 45;

        int root = 10;
        int numNodes = 6;
        bst.insert(root);
        for (int i = 0; i < numNodes; i++) {
            bst.insert(nodes[i]);
        }

        int count = bst.countSubtreesInRange(low, high);
        System.out.println("Number of subtrees within the range [" + low + ", " + high + "]: " + count);
    }
}
