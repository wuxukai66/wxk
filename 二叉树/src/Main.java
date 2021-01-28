

public class Main {


    public static void main(String[] args) {
            BinaryTree binaryTree=new BinaryTree();
            binaryTree.createTree();
        BTNode root=binaryTree.createTree();
            binaryTree.inOrderTraversal(root);
            binaryTree.getSize1(root);
        System.out.println();
        System.out.println(BinaryTree.size);
        System.out.println(binaryTree.getHeight(root));
        binaryTree.levelOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversalnor(root);
    }
}
