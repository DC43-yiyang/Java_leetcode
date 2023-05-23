package Array;

public class move_zeros_283 {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;

        while (fast < nums.length)
        {
            if (nums[fast] != 0)
            {
                nums[slow] = nums[fast];
                slow ++;
            }
            fast ++;
        }

        while (slow < fast)
        {
            nums[slow] = 0;
            slow ++;
        }
    }
}
