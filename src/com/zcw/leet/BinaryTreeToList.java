package com.zcw.leet;

import java.util.ArrayList;

/**
 * @Author: AndrewBar
 * @Date: Created in 22:11 2020/8/2
 */
public class BinaryTreeToList {
    public void flatten(TreeNode root) {

        ArrayList<TreeNode> list = new ArrayList<>();
        if (root == null){
            return;
        }
        list.add(root);
        flatten(root.left);
        flatten(root.right);

        int size = list.size();
        for (int i = 1; i < size; i++) {
            TreeNode prev = list.get(i - 1), curr = list.get(i);
            prev.left = null;
            prev.right = curr;
        }
    }

}
class TreNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreNode() {
    }

    TreNode(int val) {
        this.val = val;
    }

    TreNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

