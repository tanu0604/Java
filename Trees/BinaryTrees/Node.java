package Trees.BinaryTrees;

public class Node
{
    int value;
    Node left;
    Node right;

    public Node(int value)
    {
        this.value=value;
    }
    public Node(int value,Node left,Node right)
    {
        this.value=value;
        this.left=left;
        this.right=right;
    }
}
