package BaumeTraversieren; 

import java.util.Stack; 

public class BinaryTree { 

    // Iterative Preorder Traversierung
    public String iterativePreorder(TreeNode root) { // Öffentliche Methode für iterative Preorder-Traversierung.
        if (root == null) return ""; // Überprüft, ob der Baum leer ist. Wenn ja, gibt einen leeren String zurück.
        StringBuilder sb = new StringBuilder(); // Erstellt ein StringBuilder-Objekt für effiziente Stringmanipulation.
        Stack<TreeNode> stack = new Stack<>(); // Erstellt einen Stack zum Speichern der Knoten.
        stack.push(root); // Legt den Wurzelknoten auf den Stack.

        while (!stack.isEmpty()) { // Solange der Stack nicht leer ist.
            TreeNode node = stack.pop(); // Entfernt das oberste Element vom Stack.
            sb.append(node.value).append(" "); // Fügt den Wert des Knotens zum StringBuilder hinzu.

            if (node.right != null) { // Wenn der rechte Kindknoten nicht null ist.
                stack.push(node.right); // Legt den rechten Kindknoten auf den Stack.
            }
            if (node.left != null) { // Wenn der linke Kindknoten nicht null ist.
                stack.push(node.left); // Legt den linken Kindknoten auf den Stack.
            }
        }
        return sb.toString().trim(); // Gibt den zusammengesetzten String zurück und entfernt führende/abschließende Leerzeichen.
    }

    // Iterative Inorder Traversierung
    public String iterativeInorder(TreeNode root) { // Öffentliche Methode für iterative Inorder-Traversierung.
        if (root == null) return ""; // Überprüft, ob der Baum leer ist.
        StringBuilder sb = new StringBuilder(); // Erstellt ein StringBuilder-Objekt.
        Stack<TreeNode> stack = new Stack<>(); // Erstellt einen Stack zum Speichern der Knoten.
        TreeNode current = root; // Setzt den aktuellen Knoten auf die Wurzel.

        while (current != null || !stack.isEmpty()) { // Solange es unbesuchte Knoten gibt.
            while (current != null) { // Geht den Baum entlang des linken Astes hinunter.
                stack.push(current); // Fügt jeden Knoten auf dem Weg zum Stack hinzu.
                current = current.left; // Geht zum linken Kindknoten.
            }
            current = stack.pop(); // Entfernt den Knoten oben auf dem Stack.
            sb.append(current.value).append(" "); // Fügt den Wert des Knotens zum StringBuilder hinzu.
            current = current.right; // Wechselt zum rechten Kindknoten.
        }
        return sb.toString().trim(); // Gibt den bearbeiteten String zurück.
    }

    // Iterative Postorder Traversierung
    public String iterativePostorder(TreeNode root) { // Öffentliche Methode für iterative Postorder-Traversierung.
        if (root == null) return ""; // Überprüft, ob der Baum leer ist.
        StringBuilder sb = new StringBuilder(); // Erstellt ein StringBuilder-Objekt.
        Stack<TreeNode> stack = new Stack<>(); // Erstellt einen Stack zum Speichern der Knoten.
        TreeNode current = root; // Setzt den aktuellen Knoten auf die Wurzel.
        TreeNode lastVisited = null; // Hält den zuletzt besuchten Knoten fest.

        while (current != null || !stack.isEmpty()) { // Solange es unbesuchte Knoten gibt.
            if (current != null) { // Wenn der aktuelle Knoten nicht null ist.
                stack.push(current); // Legt den aktuellen Knoten auf den Stack.
                current = current.left; // Geht zum linken Kindknoten.
            } else { 
                TreeNode peekNode = stack.peek(); // Schaut sich den obersten Knoten auf dem Stack an, ohne ihn zu entfernen.
                if (peekNode.right != null && lastVisited != peekNode.right) { // Wenn der rechte Kindknoten existiert und noch nicht besucht wurde.
                    current = peekNode.right; // Setzt den aktuellen Knoten auf den rechten Kindknoten.
                } else { 
                    sb.append(peekNode.value).append(" "); // Fügt den Wert des Knotens zum StringBuilder hinzu.
                    // Fügt den Wert des Knotens zum StringBuilder hinzu.
                    lastVisited = stack.pop(); // Aktualisiert 'lastVisited' mit dem zuletzt besuchten Knoten und entfernt diesen Knoten vom Stack.
                }
            }
        }
        return sb.toString().trim(); // Gibt den zusammengesetzten und bereinigten String zurück.
    }
}

