package MateAcademy.LeetCode.TopInterwievQuestions;

public class RemoveDuplicats {
    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int[] expected1 = {1, 2};
        test(nums1, expected1);
    }

    public static void test(int[] nums, int[] expected) {
        int k = removeDuplicatsFromArray(nums);
        System.out.println("Number of unique element`s : " + k);
        if (k == expected.length) {
            boolean passed = true;
            for (int i = 0; i < k; i++) {
                if (nums[i] != expected[i]) {
                    passed = false;
                    break;
                }
            }
            if (passed) {
                System.out.println("Test passed");
            } else {
                System.out.println("Test failed");
            }
        } else {
            System.out.println("Test failed");
        }
    }

    public static int removeDuplicatsFromArray(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int nextUnique = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[nextUnique] = nums[i];
                nextUnique++;
            }
        }
        return nextUnique;
    }
}