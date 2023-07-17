package MateAcademy.DailyTask;

import java.util.Arrays;

public class WheatAndChaff {
    public static long[] separateWheatFromChaff(long[] nums) {
        long[] result = Arrays.copyOf(nums, nums.length);
        int left = 0;
        int right = result.length - 1;
        while (left < right) {
            while (result[left] < 0 && left < right) {
                left++;
            }
            while (result[right] >= 0 && left < right) {
                right--;
            }
            if (left < right) {
                long temp = result[left];
                result[left] = result[right];
                result[right] = temp;
            }
        }
        return result;
    }
}