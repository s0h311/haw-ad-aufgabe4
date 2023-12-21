package application;
public class BinaryTreeRekursiv {

    
    public String preorder(TreeNode root) { 
        StringBuilder sb = new StringBuilder(); 
        preorderHelper(root, sb); 
        return sb.toString().trim(); 
    }

    private void preorderHelper(TreeNode node, StringBuilder sb) { 
        if (node != null) { 
            sb.append(node.value).append(" "); 
            preorderHelper(node.left, sb); 
            preorderHelper(node.right, sb); 
        }
    }

    // Inorder Traversierung
    public String inorder(TreeNode root) { 
        StringBuilder sb = new StringBuilder(); 
        inorderHelper(root, sb); 
        return sb.toString().trim(); 
    }

    private void inorderHelper(TreeNode node, StringBuilder sb) { 
        if (node != null) { 
            inorderHelper(node.left, sb); 
            sb.append(node.value).append(" "); 
            inorderHelper(node.right, sb); 
        }
    }

    // Postorder Traversierung
    public String postorder(TreeNode root) { 
        StringBuilder sb = new StringBuilder(); 
        postorderHelper(root, sb); 
        return sb.toString().trim(); 
    }

    private void postorderHelper(TreeNode node, StringBuilder sb) { 
        if (node != null) { 
            postorderHelper(node.left, sb); 
            postorderHelper(node.right, sb); 
            sb.append(node.value).append(" "); 
        }
    }
}


