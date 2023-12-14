package test;

import application.BinaryTreeNode;
import application.TraverserRekursiv;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
public class TraverserRekursivTest {



    //Traverser PREORDER
    @Test
    public void testTraversePreOrderWithNullNode() {
        TraverserRekursiv traverserRekursiv = new TraverserRekursiv();
        assertDoesNotThrow(() -> traverserRekursiv.traversePreOrder(null));
        // If the method can handle a null node without throwing an exception, the test passes
    }

    @Test
    public void testTraversePreOrderWithSingleNode() {
        TraverserRekursiv traverserRekursiv = new TraverserRekursiv();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(42);
        assertDoesNotThrow(() -> traverserRekursiv.traversePreOrder(root));
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
        TraverserRekursiv traverserRekursiv = new TraverserRekursiv();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(2);
        root.setLChild(new BinaryTreeNode<>(1));
        root.setRChild(new BinaryTreeNode<>(3));
        root.getLChild().setLChild(new BinaryTreeNode<>(4));
        root.getLChild().setRChild(new BinaryTreeNode<>(5));

        // Use a StringBuilder to capture the output from System.out.println
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        traverserRekursiv.traversePreOrder(root);

        // Verify the output matches the expected in-order traversal
        assertEquals("12345", outputStream.toString().replaceAll("\\s", ""));
    }

    //Traverser INORDER
    @Test
    public void testTraverseInOrderWithNullNode() {
        TraverserRekursiv traverserRekursiv = new TraverserRekursiv();
        assertDoesNotThrow(() -> traverserRekursiv.traverseInOrder(null));
        // If the method can handle a null node without throwing an exception, the test passes
    }

    @Test
    public void testTraverseInOrderWithSingleNode() {
        TraverserRekursiv traverserRekursiv = new TraverserRekursiv();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(42);
        assertDoesNotThrow(() -> traverserRekursiv.traverseInOrder(root));
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
        TraverserRekursiv traverserRekursiv = new TraverserRekursiv();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(2);
        root.setLChild(new BinaryTreeNode<>(1));
        root.setRChild(new BinaryTreeNode<>(3));
        root.getLChild().setLChild(new BinaryTreeNode<>(4));
        root.getLChild().setRChild(new BinaryTreeNode<>(5));

        // Use a StringBuilder to capture the output from System.out.println
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        traverserRekursiv.traverseInOrder(root);

        // Verify the output matches the expected in-order traversal
        assertEquals("41523", outputStream.toString().replaceAll("\\s", ""));
    }

    //Traverse POSTORDER

    @Test
    public void testTraversePostOrderWithNullNode() {
        TraverserRekursiv traverserRekursiv = new TraverserRekursiv();
        assertDoesNotThrow(() -> traverserRekursiv.traversePostOrder(null));
        // If the method can handle a null node without throwing an exception, the test passes
    }

    @Test
    public void testTraversePostOrderWithSingleNode() {
        TraverserRekursiv traverserRekursiv = new TraverserRekursiv();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(42);
        assertDoesNotThrow(() -> traverserRekursiv.traversePostOrder(root));
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
        TraverserRekursiv traverserRekursiv = new TraverserRekursiv();
        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(2);
        root.setLChild(new BinaryTreeNode<>(1));
        root.setRChild(new BinaryTreeNode<>(3));
        root.getLChild().setLChild(new BinaryTreeNode<>(4));
        root.getLChild().setRChild(new BinaryTreeNode<>(5));

        // Use a StringBuilder to capture the output from System.out.println
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        traverserRekursiv.traversePreOrder(root);

        // Verify the output matches the expected in-order traversal
        assertEquals("45231", outputStream.toString().replaceAll("\\s", ""));
    }
}
