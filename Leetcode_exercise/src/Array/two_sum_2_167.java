package Array;

public class two_sum_2_167 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right)
        {
            int val = numbers[left] + numbers[right];

            if (val > target)
            {
                right --;
            } else if (val < target)
            {
                left ++;
            }
            else
            {
                break;
            }
        }
        int[] nums = new int[2];
        nums[0] = left+1;
        nums[1] = right+1;
        return nums;
    }
}
