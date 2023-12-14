package application;

import java.util.Stack;

public class TraverserIterativ {

    public <T> void preOrder(final BinaryTreeNode<T> root) {
        Stack<BinaryTreeNode<T>> nodes = new Stack<>();
        nodes.push(root);
        while (!nodes.isEmpty()) {
            BinaryTreeNode<T> current = nodes.pop();
            System.out.printf("%s ", current.getData());
            if (current.getRChild() != null) {
                nodes.push(current.getRChild());
            }
            if (current.getLChild() != null) {
                nodes.push(current.getLChild());
            }
        }
    }

    public <T> void inOrder(final BinaryTreeNode<T> root) {
        Stack<BinaryTreeNode<T>> nodes = new Stack<>();
        BinaryTreeNode<T> current = root;
        while (!nodes.isEmpty() || current != null) {
            if (current != null) {
                nodes.push(current);
                current = current.getLChild();
            }
            else
            { BinaryTreeNode<T> node = nodes.pop();
                System.out.printf("%s ", node.getData());
                current = node.getRChild();
            }
        }
    }

    public <T> void postorder(final BinaryTreeNode<T> root) {
        if (root == null) {
            return;
        }
        Stack<BinaryTreeNode<T>> stack = new Stack<>();
        Stack<BinaryTreeNode<T>> resultStack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            BinaryTreeNode<T> current = stack.pop();
            if(current != null){
                resultStack.push(current);
                if (current.getLChild() != null) {
                    stack.push(current.getLChild());
                }
                if (current.getRChild() != null) {
                    stack.push(current.getRChild());
                }
            }
        }
        while (!resultStack.isEmpty()) {
            BinaryTreeNode<T> node = resultStack.pop();
            System.out.print(node.getData() + " ");
        }
    }
}