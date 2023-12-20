package BaumeTraversieren; 
public class BinaryTree_1 { 

    // Preorder Traversierung
    public String preorder(TreeNode root) { // Öffentliche Methode für Preorder-Traversierung.
        StringBuilder sb = new StringBuilder(); // Erstellt ein StringBuilder-Objekt für effiziente Stringmanipulation.
        preorderHelper(root, sb); // Ruft die Hilfsmethode für die Preorder-Traversierung auf.
        return sb.toString().trim(); // Gibt den zusammengesetzten String zurück und entfernt führende/abschließende Leerzeichen.
    }

    private void preorderHelper(TreeNode node, StringBuilder sb) { // Private Hilfsmethode für die Preorder-Traversierung.
        if (node != null) { // Überprüft, ob der aktuelle Knoten nicht null ist.
            sb.append(node.value).append(" "); // Fügt den Wert des Knotens zum StringBuilder hinzu.
            preorderHelper(node.left, sb); // Ruft rekursiv dieselbe Methode für den linken Kindknoten auf.
            preorderHelper(node.right, sb); // Ruft rekursiv dieselbe Methode für den rechten Kindknoten auf.
        }
    }

    // Inorder Traversierung
    public String inorder(TreeNode root) { // Öffentliche Methode für Inorder-Traversierung.
        StringBuilder sb = new StringBuilder(); // Erstellt ein neues StringBuilder-Objekt.
        inorderHelper(root, sb); // Ruft die Hilfsmethode für die Inorder-Traversierung auf.
        return sb.toString().trim(); // Gibt den bearbeiteten String zurück.
    }

    private void inorderHelper(TreeNode node, StringBuilder sb) { // Private Hilfsmethode für die Inorder-Traversierung.
        if (node != null) { // Überprüft, ob der aktuelle Knoten nicht null ist.
            inorderHelper(node.left, sb); // Besucht zuerst den linken Kindknoten rekursiv.
            sb.append(node.value).append(" "); // Fügt den Wert des Knotens zum StringBuilder hinzu.
            inorderHelper(node.right, sb); // Besucht dann den rechten Kindknoten rekursiv.
        }
    }

    // Postorder Traversierung
    public String postorder(TreeNode root) { // Öffentliche Methode für Postorder-Traversierung.
        StringBuilder sb = new StringBuilder(); // Erstellt ein neues StringBuilder-Objekt.
        postorderHelper(root, sb); // Ruft die Hilfsmethode für die Postorder-Traversierung auf.
        return sb.toString().trim(); // Gibt den bearbeiteten String zurück.
    }

    private void postorderHelper(TreeNode node, StringBuilder sb) { // Private Hilfsmethode für die Postorder-Traversierung.
        if (node != null) { // Überprüft, ob der aktuelle Knoten nicht null ist.
            postorderHelper(node.left, sb); // Besucht zuerst den linken Kindknoten rekursiv.
            postorderHelper(node.right, sb); // Besucht dann den rechten Kindknoten rekursiv.
            sb.append(node.value).append(" "); // Fügt den Wert des Knotens am Ende zum StringBuilder hinzu.
        }
    }
}


