package Array;

public class remove_duplicates_026 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
        {
            return 0;
        }
        int slow = 0;
        int fast = 0;
        int len = nums.length;
        while (fast < len)
        {
            if (nums[fast] != nums[slow])
            {
                slow ++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow+1;
    }
}
