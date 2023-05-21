package MateAcademy.LeetCode.TopInterwievQuestions;

public class RemoveDuplicats {
    public int removeDuplicatsFromArray(int[] nums) {
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
