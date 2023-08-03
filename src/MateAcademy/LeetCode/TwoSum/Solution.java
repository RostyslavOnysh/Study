package MateAcademy.LeetCode.TwoSum;

import java.util.HashMap;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> twoSum = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diferenceOfSum = target - nums[i];
            if (twoSum.containsKey(diferenceOfSum)) {
                return new int[]{twoSum.get(diferenceOfSum), i};
            }
            twoSum.put(nums[i], i);
        }
        return null;
    }

    public static void main(String[] args) {
        Solution twoSum = new Solution();
        int[] nums = {3,3};
        int target = 6;
        int[] result = twoSum.twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
            System.out.println("Values: [" + nums[result[0]] + ", " + nums[result[1]] + "]");
        } else {
            System.out.println("No such pair found.");
        }
    }
}
// the sum of 2 integer in nums array should equals to target
//https://leetcode.com/problems/two-sum/submissions/