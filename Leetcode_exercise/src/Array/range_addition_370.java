package Array;

public class range_addition_370 {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] oriArray = new int[length];
        int operatTimes = updates.length;
        int val = 0;
        int start_index = 0;
        int end_index = 0;

        // because all the oriArray'elements are 0, so do not need
        for (int i = 0; i < operatTimes; i++) {
            start_index = updates[i][0];
            end_index = updates[i][1];
            val = updates[i][2];
            oriArray = operateOnDiffarray(oriArray, start_index, end_index, val);
        }
        int[] resArray = new int[oriArray.length];

        resArray = convertArray(oriArray);
        return resArray;
    }

    public int[] operateOnDiffarray(int[] diffArray, int start, int end, int val) {
        diffArray[start] += val;
        if (end < diffArray.length - 1) {
            diffArray[end + 1] -= val;
        }
        return diffArray;
    }

    public int[] convertArray(int[] diffArray) {
        int[] convertArray = diffArray;

        for (int i = 1; i < diffArray.length; i++) {
            convertArray[i] = diffArray[i - 1] + diffArray[i];
        }
        return convertArray;
    }

}
