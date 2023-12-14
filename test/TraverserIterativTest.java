package test;

import application.BinaryTreeNode;
import application.TraverserIterativ;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TraverserIterativTest {
    TraverserIterativ traverserRekursiv = new TraverserIterativ();

    //Traverser PREORDER
    @Test
    public void testTraversePreOrderWithNullNode() {
        assertDoesNotThrow(() -> traverserRekursiv.preOrder(null));
        // If the method can handle a null node without throwing an exception, the test passes
    }

    @Test
    public void testTraversePreOrderWithSingleNode() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(42);
        assertDoesNotThrow(() -> traverserRekursiv.preOrder(root));
        // If the method can handle a single node without throwing an exception, the test passes
    }

    @Test
    public void testTraversePreOrderWithMultipleNodes() {
        /*
         * Constructing a binary tree:
         *        1
         *       / \
         *      2   3
         *     / \
         *    4   5
         */
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
        root.setLChild(new BinaryTreeNode<>(2));
        root.setRChild(new BinaryTreeNode<>(3));
        root.getLChild().setLChild(new BinaryTreeNode<>(4));
        root.getLChild().setRChild(new BinaryTreeNode<>(5));

        // Use a StringBuilder to capture the output from System.out.println
        StringBuilder output = new StringBuilder();
        System.setOut(new java.io.PrintStream(new java.io.ByteArrayOutputStream() {
            public void print(String str) {
                output.append(str);
            }
        }));

        traverserRekursiv.preOrder(root);

        // Verify the output matches the expected pre-order traversal
        assertEquals("12345", output.toString().replaceAll("\\s", ""));
    }

    //Traverser INORDER
    @Test
    public void testTraverseInOrderWithNullNode() {
        assertDoesNotThrow(() -> traverserRekursiv.inOrder(null));
        // If the method can handle a null node without throwing an exception, the test passes
    }

    @Test
    public void testTraverseInOrderWithSingleNode() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(42);
        assertDoesNotThrow(() -> traverserRekursiv.inOrder(root));
        // If the method can handle a single node without throwing an exception, the test passes
    }

    @Test
    public void testTraverseInOrderWithMultipleNodes() {
        /*
         * Constructing a binary tree:
         *        2
         *       / \
         *      1   3
         *     / \
         *    4   5
         */
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(2);
        root.setLChild(new BinaryTreeNode<>(1));
        root.setRChild(new BinaryTreeNode<>(3));
        root.getLChild().setLChild(new BinaryTreeNode<>(4));
        root.getLChild().setRChild(new BinaryTreeNode<>(5));

        // Use a StringBuilder to capture the output from System.out.println
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        traverserRekursiv.inOrder(root);

        // Verify the output matches the expected in-order traversal
        assertEquals("41523", outputStream.toString().replaceAll("\\s", ""));
    }

    //Traverse POSTORDER

    @Test
    public void testTraversePostOrderWithNullNode() {
        assertDoesNotThrow(() -> traverserRekursiv.postorder(null));
        // If the method can handle a null node without throwing an exception, the test passes
    }

    @Test
    public void testTraversePostOrderWithSingleNode() {
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(42);
        assertDoesNotThrow(() -> traverserRekursiv.postorder(root));
        // If the method can handle a single node without throwing an exception, the test passes
    }

    @Test
    public void testTraversePostOrderWithMultipleNodes() {
        /*
         * Constructing a binary tree:
         *        2
         *       / \
         *      1   3
         *     / \
         *    4   5
         */
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(2);
        root.setLChild(new BinaryTreeNode<>(1));
        root.setRChild(new BinaryTreeNode<>(3));
        root.getLChild().setLChild(new BinaryTreeNode<>(4));
        root.getLChild().setRChild(new BinaryTreeNode<>(5));

        // Use a StringBuilder to capture the output from System.out.println
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        traverserRekursiv.postorder(root);

        // Verify the output matches the expected post-order traversal
        assertEquals("45132", outputStream.toString().replaceAll("\\s", ""));
    }

}
