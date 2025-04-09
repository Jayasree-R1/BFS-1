//  TC:O(n)
//  SC: O(h)

//results should be added in preorder manner

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> levelOrder(TreeNode root) {
        this.result = new ArrayList<>();
        if(root == null)  return result;

        helper(root, 0);
        return result;
    }

        private void helper(TreeNode root, int level){

            // base case
            if(root == null) return;

            //creating list(below step) should always be done in pre-order
            if(result.size() == level){
                result.add(new ArrayList<>());
            }

            //adding elements to the list can be done in any order
            result.get(level).add(root.val);

            helper(root.left,level+1);

            helper(root.right,level+1);

        }
        

    
}
