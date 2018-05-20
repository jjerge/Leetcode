/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
  if(t1==null && t2 == null)
  { return null;}
    int x=0,y=0;
        
        if(t1==null){
        return t2;
    }
      
    if(t2==null){
        return t1;
    } 
        
        TreeNode newhead=new TreeNode(t2.val+t1.val);

   
        newhead.left=mergeTrees(t1.left,t2.left);
      newhead.right=mergeTrees(t1.right,t2.right);
     
        
    
    return newhead;
    }
}
