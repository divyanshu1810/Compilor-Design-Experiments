// Define the node class for the syntax tree

import java.util.Stack;

class TreeNode {
    char data;
    TreeNode left, right;

    // Constructor
    public TreeNode(char data) {
        this.data = data;
        this.left = this.right = null;
    }
}

// Define the syntax tree class
class SyntaxTree {
    private TreeNode root;

    // Constructor
    public SyntaxTree() {
        root = null;
    }

    // Method to construct the syntax tree from a given postfix expression
    public void constructTree(String postfixExpression) {
        Stack<TreeNode> stack = new Stack<>();

        // Iterate through each character in the postfix expression
        for (int i = 0; i < postfixExpression.length(); i++) {
            char c = postfixExpression.charAt(i);

            // If the character is an operand, create a tree node for it and push it onto
            // the stack
            if (Character.isLetterOrDigit(c)) {
                stack.push(new TreeNode(c));
            }
            // If the character is an operator, pop two nodes from the stack, create a new
            // node with
            // the operator as data, and make the popped nodes its children. Then push the
            // new node onto the stack.
            else {
                TreeNode rightNode = stack.pop();
                TreeNode leftNode = stack.pop();
                TreeNode operatorNode = new TreeNode(c);
                operatorNode.left = leftNode;
                operatorNode.right = rightNode;
                stack.push(operatorNode);
            }
        }

        // The last item in the stack will be the root of the syntax tree
        root = stack.pop();
    }

    // Method to traverse and print the syntax tree (inorder traversal)
    public void inorderTraversal(TreeNode node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    // Method to print the infix expression from the syntax tree
    public void printInfixExpression() {
        System.out.print("Infix expression: ");
        inorderTraversal(root);
        System.out.println();
    }
}

// Main class
public class SynTaxTree {
    public static void main(String[] args) {
        // Create a syntax tree
        SyntaxTree tree = new SyntaxTree();

        // Example postfix expression: ab+
        String postfixExpression = "ab+";

        // Construct the syntax tree
        tree.constructTree(postfixExpression);

        // Print the infix expression
        tree.printInfixExpression();
    }
}
