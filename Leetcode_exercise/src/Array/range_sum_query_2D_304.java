package Array;

public class range_sum_query_2D_304 {
    int[][] preNum;
    public void NumMatrix(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        if (row == 0 || col == 0)
        {
            return;
        }
        preNum = new int[row+1][col+1];
        for (int i = 1; i < row + 1; i ++)
        {
            for (int j = 1; j < col + 1; j ++)
            {
                preNum[i][j] = matrix[i-1][j-1] + preNum[i-1][j] +
                        preNum[i][j-1] - preNum[i-1][j-1];
            }
        }
    }

    public int sumRegion(int x1, int y1, int x2, int y2) {
        return preNum[x2+1][y2+1] - preNum[x1][y2+1] - preNum[x2+1][y1] + preNum[x1][y1];
    }
}
