package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

import BaumeTraversieren.BinaryTree_iterativ;
import BaumeTraversieren.TreeNode;

public class BinaryTreeTest {
	private BinaryTree_iterativ binaryTree = new BinaryTree_iterativ(); 

    
    private ArrayList<Integer> toList(String s) {
        if (s.isEmpty()) return new ArrayList<>(); 
        String[] values = s.trim().split("\\s+"); 
        ArrayList<Integer> result = new ArrayList<>(); 
        for (String value : values) { 
            result.add(Integer.parseInt(value)); 
        }
        return result; 
    }

    @Test 
    public void testEmptyTree() { 
        TreeNode root = null; 
        System.out.println("Empty Tree - Preorder: " + binaryTree.iterativePreorder(root)); 
        System.out.println("Empty Tree - Inorder: " + binaryTree.iterativeInorder(root)); 
        System.out.println("Empty Tree - Postorder: " + binaryTree.iterativePostorder(root)); 
        
        
        assertEquals(new ArrayList<>(), toList(binaryTree.iterativePreorder(root))); 
        assertEquals(new ArrayList<>(), toList(binaryTree.iterativeInorder(root)));
        assertEquals(new ArrayList<>(), toList(binaryTree.iterativePostorder(root)));
    }

    @Test 
    public void testSingleTreeNode() { 
        TreeNode root = new TreeNode(1); 

        
        System.out.println("Single TreeNode - Preorder: " + binaryTree.iterativePreorder(root));

        
        System.out.println("Single TreeNode - Inorder: " + binaryTree.iterativeInorder(root));

        
        System.out.println("Single TreeNode - Postorder: " + binaryTree.iterativePostorder(root));
        
        
        assertEquals(Arrays.asList(1), toList(binaryTree.iterativePreorder(root)));

        
        assertEquals(Arrays.asList(1), toList(binaryTree.iterativeInorder(root)));

        
        assertEquals(Arrays.asList(1), toList(binaryTree.iterativePostorder(root)));
    }

    @Test 
    public void testUnbalancedTree() { 
        TreeNode root = new TreeNode(1); 
        root.right = new TreeNode(2); 
        root.right.right = new TreeNode(3); 

        
        System.out.println("Unbalanced Tree - Preorder: " + binaryTree.iterativePreorder(root));

        
        System.out.println("Unbalanced Tree - Inorder: " + binaryTree.iterativeInorder(root));

        
        System.out.println("Unbalanced Tree - Postorder: " + binaryTree.iterativePostorder(root));
        
        
        assertEquals(Arrays.asList(1, 2, 3), toList(binaryTree.iterativePreorder(root)));

        
        assertEquals(Arrays.asList(1, 2, 3), toList(binaryTree.iterativeInorder(root)));

        
        assertEquals(Arrays.asList(3, 2, 1), toList(binaryTree.iterativePostorder(root)));
    }


    @Test 
    public void testCompleteTree() { 
        TreeNode root = new TreeNode(1); 
        root.left = new TreeNode(2); 
        root.right = new TreeNode(3); 
        root.left.left = new TreeNode(4); 
        root.left.right = new TreeNode(5); 
        root.right.left = new TreeNode(6); 
        root.right.right = new TreeNode(7); 

        
        System.out.println("Complete Tree - Preorder: " + binaryTree.iterativePreorder(root));

        
        System.out.println("Complete Tree - Inorder: " + binaryTree.iterativeInorder(root));

        
        System.out.println("Complete Tree - Postorder: " + binaryTree.iterativePostorder(root));
        
        
        assertEquals(Arrays.asList(1, 2, 4, 5, 3, 6, 7), toList(binaryTree.iterativePreorder(root)));

        
        assertEquals(Arrays.asList(4, 2, 5, 1, 6, 3, 7), toList(binaryTree.iterativeInorder(root)));

        
        assertEquals(Arrays.asList(4, 5, 2, 6, 7, 3, 1), toList(binaryTree.iterativePostorder(root)));
    }

    @Test
    public void testDegenerateTree() { 
        TreeNode root = new TreeNode(1); 
        root.right = new TreeNode(2); 
        root.right.right = new TreeNode(3); 
        root.right.right.right = new TreeNode(4); 

       
        System.out.println("Degenerate Tree - Preorder: " + binaryTree.iterativePreorder(root));

        
        System.out.println("Degenerate Tree - Inorder: " + binaryTree.iterativeInorder(root));

        
        System.out.println("Degenerate Tree - Postorder: " + binaryTree.iterativePostorder(root));
        
        
        assertEquals(Arrays.asList(1, 2, 3, 4), toList(binaryTree.iterativePreorder(root)));

        
        assertEquals(Arrays.asList(1, 2, 3, 4), toList(binaryTree.iterativeInorder(root)));

        
        assertEquals(Arrays.asList(4, 3, 2, 1), toList(binaryTree.iterativePostorder(root)));
    }
}


