package Trees.BinaryTrees;

import java.util.Scanner;
public class BinaryTree {
    private Node root;

    public void populate(Scanner scanner) {
        System.out.println("Enter the root node:");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        // Inserting a left node
        System.out.println("Do you want to enter a left node for " + node.value + "? (true/false)");
        boolean left = scanner.nextBoolean();

        if (left) {
            System.out.println("Enter the left node value:");
            int leftVal = scanner.nextInt();
            node.left = new Node(leftVal);
            populate(scanner, node.left);
        }

        // Inserting a right node
        System.out.println("Do you want to enter a right node for " + node.value + "? (true/false)");
        boolean right = scanner.nextBoolean();

        if (right) {
            System.out.println("Enter the right node value:");
            int rightVal = scanner.nextInt();
            node.right = new Node(rightVal);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null)
            return;
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(scanner);
        tree.display();
        scanner.close();
    }
}
