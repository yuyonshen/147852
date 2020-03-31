package java3_31_1;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import javax.imageio.stream.ImageInputStream;
import java.time.chrono.IsoChronology;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static sun.swing.MenuItemLayoutHelper.max;

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}
public class Solution {
   // 二叉树的前序遍历
    //使用前序遍历将一个二叉树的元素增加到一个集合中
    public List<Integer> preorderTraversal(TreeNode root) {
//创建一个集合
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        return result;
    }
   //二叉树的中序遍历
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }
    //二叉树的后序遍历
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null){
            return result;
        }
        result.addAll(postorderTraversal(root.left));
        result.addAll(postorderTraversal(root.right));
        result.add(root.val);
        return result;
    }
    //给定两个二叉树检查他们是否相同
    public boolean isSameTree(TreeNode p, TreeNode q) {
        //如果两个树都是空,那么连个树也是相同的;
        if(p==null&&q==null){
            return true;
        }
        //两个树一个为空,一个不为空时,返回false.
        if(p==null||q==null){
            return false;
        }
        if(q.val!=p.val){
            return false;
        }
        //分别检查q.rigth和p,rigth子树是否相等
        //分别检查q.left和p.left的子树是否相等
        return isSameTree(p.left,q.left)&&isSameTree(q.right,p.right);
    }
    //给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。
    // s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s==null&&t==null){
            return true;
        }
        if (s==null||t==null){
            return false;
        }
        //如果s.val==t.val相等,就调用上面的方法进行递归遍历满段是否为s的子树
        boolean ret=false;
        if(s.val==t.val){
            ret=  isSameTree(s,t);
        }
        return ret||isSubtree(s.left,t)||isSubtree(s.right,t);
    }
    //照着这个二叉树的最大深度
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        if (root.left==null&&root.right==null){
            return 1;
        }
        int leftDepth=maxDepth(root.left);
        int rightDepth=maxDepth(root.right);
        return 1+Math.max(leftDepth,rightDepth);
    }
    //判断一个二叉树是否是平衡二叉树
    //一个二叉树的节点左右子树的高度差绝对值不能超过1;
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        if (root.left==null&&root.right==null){
            return true;
        }
        int leftDepth=maxDepth(root.left);
        int rigthDepth=maxDepth(root.right);
        if(leftDepth-rigthDepth>1||leftDepth-rigthDepth<-1){
            return false;
        }
        return isBalanced(root.left)&&isBalanced(root.right);
    }
    //对称二叉树
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return isMirror(root.left,root.right);
    }
    public boolean isMirror(TreeNode t1, TreeNode t2){
        if(t1==null&&t2==null){
            return true;
        }
        if(t1==null||t2==null){
            return false;
        }
        if(t1.val!=t2.val){
            return false;
        }
        return isMirror(t1.left,t2.right)&& isMirror(t1.right,t2.left);
    }
    public void levelOrder(TreeNode root){
        //不能使用递归的方法
        //可以借助一个队列来完成
        Queue<TreeNode> queue=new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
           TreeNode node=queue.poll();
            System.out.print(node.val+" ");
            if(node.left!=null){
                queue.offer(node.left);
            }
            if(node.right!=null){
                queue.offer(node.right);
            }
        }
    }
}
