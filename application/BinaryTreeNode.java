package application;

public class BinaryTreeNode<T> {
    private T data;
    private BinaryTreeNode<T> lChild;
    private BinaryTreeNode<T> rChild;

    public BinaryTreeNode( final T data ){
        if( null==data ) throw new IllegalArgumentException();
        //
        this.data = data;
        this.lChild = null;
        this.rChild = null;
    }//method()

    public T getData() { return data; }
    //
    public BinaryTreeNode<T> getLChild(){ return lChild; }
    public BinaryTreeNode<T> getRChild(){ return rChild; }
    //
    public void setLChild( final BinaryTreeNode<T> lChild ){
        this.lChild = lChild;
    }//method()
    public void setRChild( final BinaryTreeNode<T> rChild ){
        this.rChild = rChild;
    }//method()
}
