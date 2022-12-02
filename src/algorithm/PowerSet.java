package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 求一个集合的幂级（所有元素的去重全排列）
 */
public class PowerSet {
    List<Integer> t = new ArrayList<Integer>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    /**
     *   枚举迭代法
     */
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        //  1<<n =1*2^n  n个数的全排列=2^n  十进制数mask 从0-2^n 转换成二进制后 每个二进制串代表一种排列（即一个子集）
        //  其中有1位置刚好用来表示所取的数组中的第几个位置的元素的组合 ， 例如 000011 代表取数组中位置为1和2的组合 即 [nums[0],nums[1]]
        for (int mask = 0; mask < (1 << n); ++mask) {
            t.clear();
            boolean flag = true;
            //扫描二进制串mask中有1的位置
            for (int i = 0; i < n; ++i) {
                //mask & (1 << i) != 0  表示 mask的二进制串中有1的位置
                if ((mask & (1 << i)) != 0) {
                    //(mask >> (i - 1) & 1) == 0  表示所取的子集是否包含数组中第i个元素的前一个元素 例如：mask=00011  i=1  此时mask >> (i - 1)=00011
                    if (i > 0 && (mask >> (i - 1) & 1) == 0 && nums[i] == nums[i - 1]) {
                        flag = false;
                        break;
                    }
                    t.add(nums[i]);
                }
            }
            if (flag) {
                ans.add(new ArrayList<Integer>(t));
            }
        }
        return ans;
    }

    public List<List<Integer>> subsetsWithDupDfs(int[] nums) {
        Arrays.sort(nums);
        dfs(false, 0, nums);
        return ans;

    }

    /**
     * 递归深度优先算法
     * @param choosePre
     * @param cur
     * @param nums
     */
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
