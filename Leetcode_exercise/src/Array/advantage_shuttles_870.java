package Array;

import java.util.Arrays;
import java.util.PriorityQueue;

public class advantage_shuttles_870 {
    public int[] advantageCount(int[] nums1, int[] nums2){
        int length = nums2.length;

        PriorityQueue<int[]> maxpq = new PriorityQueue<>(
                (int[] pair1, int[] pair2) -> {
                    return pair2[1] - pair1[1];
                }
        );

        Arrays.sort(nums1);
        for (int i = 0; i < length; i ++)
        {
            maxpq.add(new int[]{i,nums2[i]});
        }

        int left = 0;
        int right = length - 1;
        int[] res = new int[length];
        while (!maxpq.isEmpty())
        {
            int[] pair = maxpq.poll();
            int index = pair[0];
            int val = pair[1];
            if (nums1[right] > val)
            {
                res[index] = nums1[right];
                right --;
            }
            else
            {
                res[index] = nums1[left];
                left++;
            }
        }
        return res;
    }
}
