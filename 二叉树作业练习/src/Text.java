public class Text {
//    class Solution {
//        private TreeNode root2;
//        public TreeNode increasingBST(TreeNode root) {
//            if(root!=null){
//                increasingBST(root.left);
//                add(root.val);
//                increasingBST(root.right);
//            }
//            return this.root2;
//        }
//        public void add(int val){
//            TreeNode node=new TreeNode(val);
//            if(this.root2==null){
//                root2=node;
//            }else{
//                TreeNode cur=this.root2;
//                while(cur.right!=null){
//                    cur=cur.right;
//                }
//                cur.right=node;
//            }
//        }
//    }
    //给你一个树，请你 按中序遍历 重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。
}