package application;

public class TraverserRekursiv {

    public <T> void traversePreOrder(
            final BinaryTreeNode<T> node
    ){
        if( null!=node ){
            System.out.println( node.getData() );
            traversePreOrder( node.getLChild() );
            traversePreOrder( node.getRChild() );
        }//if
    }//method()

    public <T> void traverseInOrder(
            final BinaryTreeNode<T> node
    ){
        if( null!=node ){
            traverseInOrder( node.getLChild() );
            System.out.println( node.getData() );
            traverseInOrder( node.getRChild() );
        }//if
    }//method()
    public <T> void traversePostOrder(
            final BinaryTreeNode<T> node
    ){
        if( null!=node ){
            traversePostOrder( node.getLChild() );
            traversePostOrder( node.getRChild() );
            System.out.println( node.getData() );
        }//if
    }//method()
}
