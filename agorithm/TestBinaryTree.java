public class TestBinaryTree {
    public static void main(String[] args) {
        BinaryTree binTree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        binTree.setRoot(root);
        TreeNode rootL = new TreeNode(2);
        root.setLeftNode(rootL);
        TreeNode rootR = new TreeNode(3);
        root.setRightNode(rootR);
        //为第二层设置节点

        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));

        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));
        //前序遍历树
        binTree.frontShow();
        System.out.println("--------------");
        binTree.midShow();
        System.out.println("--------------");
        binTree.afterShow();
        System.out.println(binTree.frontSearch(3));
        binTree.delete(4);
        binTree.frontShow();
    }
}

