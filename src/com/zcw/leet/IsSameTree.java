package com.zcw.leet;

/**
 * @Author: AndrewBar
 * @Date: Created in 15:46 2020/8/7
 */
public class IsSameTree {
    public static void main(String[] args) {

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if( p == null || q == null){
            return true;
        }else if (p == null && q == null){
            return true;
        }else if(p.val != q.val){
            return false;
        }else{
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
    }
}