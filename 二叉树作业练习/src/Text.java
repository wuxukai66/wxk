public class Text {  //给你一个树，请你 按中序遍历 重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。
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


//    给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。
//
//    你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则不为 NULL 的节点将直接作为新二叉树的节点。
//
//    来源：力扣（LeetCode）
//    链接：https://leetcode-cn.com/problems/merge-two-binary-trees
//    著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
//    class Solution {
//        public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//            if(t1==null){
//                return t2;
//            }
//            if(t2==null){
//                return t1;
//            }
//            t1.val+=t2.val;
//            t1.left=mergeTrees( t1.left,  t2.left);
//            t1.right=mergeTrees( t1.right,  t2.right);
//            return t1;
//        }
//    }
}