package com.zcw.handcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: AndrewBar
 * @Date: Created in 16:19 2020/8/22
 */
public class PreOrder {
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = null;
        TreeNode rightChild = new TreeNode(2);
        root.right = rightChild;
        rightChild.left = new TreeNode(3);

        System.out.println(preorderTraversal(root));
    }

    static List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return null;
        }
        while (root != null){
            list.add(root.val);
            if (root.left != null) {
                preorderTraversal(root.left);
                root = root.left;
            }
            if (root.right != null) {
                preorderTraversal(root.right);
                root = root.right;
            }
        }
        return list;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
