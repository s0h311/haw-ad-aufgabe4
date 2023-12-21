package application;

import java.util.Stack; 

public class BinaryTreeIterativ {

    // Iterative Preorder Traversierung
    public String iterativePreorder(TreeNode root) { 
        if (root == null) return ""; 
        StringBuilder sb = new StringBuilder(); 
        Stack<TreeNode> stack = new Stack<>(); 
        stack.push(root); 

        while (!stack.isEmpty()) { 
            TreeNode node = stack.pop(); 
            sb.append(node.value).append(" "); 

            if (node.right != null) { 
                stack.push(node.right); 
            }
            if (node.left != null) { 
                stack.push(node.left); 
            }
        }
        return sb.toString().trim(); 
    }


    public String iterativeInorder(TreeNode root) { 
        if (root == null) return ""; 
        StringBuilder sb = new StringBuilder(); 
        Stack<TreeNode> stack = new Stack<>(); 
        TreeNode current = root; 

        while (current != null || !stack.isEmpty()) { 
            while (current != null) { 
                stack.push(current); 
                current = current.left; 
            }
            current = stack.pop(); 
            sb.append(current.value).append(" "); 
            current = current.right; 
        }
        return sb.toString().trim(); 
    }

 
    public String iterativePostorder(TreeNode root) { 
        if (root == null) return ""; 
        StringBuilder sb = new StringBuilder(); 
        Stack<TreeNode> stack = new Stack<>(); 
        TreeNode current = root; 
        TreeNode lastVisited = null; 
        while (current != null || !stack.isEmpty()) { 
            if (current != null) { 
                stack.push(current); 
                current = current.left; 
            } else { 
                TreeNode peekNode = stack.peek(); 
                if (peekNode.right != null && lastVisited != peekNode.right) { 
                    current = peekNode.right; 
                } else { 
                    sb.append(peekNode.value).append(" "); 
                   
                    lastVisited = stack.pop(); 
                }
            }
        }
        return sb.toString().trim(); 
    }
}

