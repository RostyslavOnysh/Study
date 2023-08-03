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


/* the second variant which use less memory
int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        int left = 0;
        int right = sortedNums.length - 1;

        while (left < right) {
            int sum = sortedNums[left] + sortedNums[right];
            if (sum == target) {
                return findIndexes(nums, sortedNums[left], sortedNums[right]);
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return null;
    }

   private int[] findIndexes(int[] nums, int num1, int num2) {
        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num1 && index1 == -1) {
                index1 = i;
            } else if (nums[i] == num2) {
                index2 = i;
            }
        }

        return new int[]{index1, index2};
    }

}

 */

/* the best varian which use the les memory and 95% better
class Solution {
    public int[] twoSum(int[] nums, int target) {
    int[] sortedNums = nums.clone();
    Arrays.sort(sortedNums);

    int left = 0;
    int right = sortedNums.length - 1;
    int length = sortedNums.length;

    while (left < right) {
    int sum = sortedNums[left] + sortedNums[right];
      if (sum == target) {
        return findIndices(nums, sortedNums[left], sortedNums[right]);
    }
    left = (sum < target) ? left + 1 : left;
    right = (sum > target) ? right - 1 : right;
        }
      return null;
    }

    private int[] findIndices(int[] nums, int num1, int num2) {
        int index1 = -1;
        int index2 = -1;

        for (int i = 0; i < nums.length; i++) {
          if (nums[i] == num1) {
            if (index1 == -1) {
                index1 = i;
            } else {
                index2 = i;
                break;
            }
        } else if (nums[i] == num2) {
            index2 = i;
            if (index1 != -1) {
                break;
            }
        }
    }
        return new int[]{index1, index2};
    }
}
 */