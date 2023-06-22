package 数据结构与算法.Tree;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author 朔风
 * @createTime 2023-04-28 00:49
 */
public class MyBinaryTree {


    private static class TreeNode {
        int data;
        TreeNode leftChild;
        TreeNode rightChild;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    /**
     * 构建二叉树
     *
     * @param input 输入序列
     * @return 返回二叉树
     */
    public static TreeNode creatBinaryTreeNode(LinkedList<Integer> input) {
        TreeNode treeNode = null;
        if (input == null || input.size() == 0) {
            return null;
        }
        Integer data = input.removeFirst();
        if (data != null) {
            treeNode = new TreeNode(data);
            treeNode.leftChild = creatBinaryTreeNode(input);
            treeNode.rightChild = creatBinaryTreeNode(input);
        }

        return treeNode;
    }

    public static void preOrderTraveral(TreeNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data+" ");
        preOrderTraveral(node.leftChild);
        preOrderTraveral(node.rightChild);
    }

    public static void inOrderTraveral(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrderTraveral(node.leftChild);
        System.out.print(node.data+" ");
        inOrderTraveral(node.rightChild);
    }

    public static void postOrderTraveral(TreeNode node) {
        if (node == null) {
            return;
        }
        postOrderTraveral(node.leftChild);
        postOrderTraveral(node.rightChild);
        System.out.print(node.data+" ");
    }

    public static void main(String[] args) {
        LinkedList<Integer> input = new LinkedList<>(Arrays.asList(3, 2, 9, null, null, 10, null, null, 8, null, 4));
        TreeNode treeNode = creatBinaryTreeNode(input);
        System.out.println("前序遍历: ");
        preOrderTraveral(treeNode);
        System.out.println("\n中序遍历: ");
        inOrderTraveral(treeNode);
        System.out.println("\n后序遍历: ");
        postOrderTraveral(treeNode);

    }

}
