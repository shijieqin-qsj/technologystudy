package algorithm;

import datastructure.Node;
import datastructure.SingleNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Action {

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
//        SingleNode head=new SingleNode(1,new SingleNode(2,new SingleNode(3,new SingleNode(4,null ))));

//        SingleNode node= linkedList.linkedListReverse(head);

//        System.out.println(node);

        Action action = new Action();
        int []  arr={1,2,3};

        List<List<Integer>> ans= action.subsetsWithDup(arr);
        System.out.println(ans);
    }


    List<Integer> t = new ArrayList<Integer>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(false, 0, nums);
        return ans;

    }

    public void dfs(boolean choosePre, int cur, int[] nums) {
        if (cur == nums.length) {
            ans.add(new ArrayList<Integer>(t));
            return;
        }
        dfs(false, cur + 1, nums);
        if (!choosePre && cur > 0 && nums[cur - 1] == nums[cur]) {
            return;
        }
        t.add(nums[cur]);
        dfs(true, cur + 1, nums);

        t.remove(t.size() - 1);
    }
}
