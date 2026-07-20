import java.util.*;

class Solution {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int row = grid.length;
        int col = grid[0].length;
        int total = row * col;

        k = k % total;

        reverse(grid, 0, total - 1, col);
        reverse(grid, 0, k - 1, col);
        reverse(grid, k, total - 1, col);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < col; j++) {
                list.add(grid[i][j]);
            }

            ans.add(list);
        }

        return ans;
    }

    public void reverse(int[][] grid, int left, int right, int col) {

        while (left < right) {

            int temp = grid[left / col][left % col];

            grid[left / col][left % col] = grid[right / col][right % col];

            grid[right / col][right % col] = temp;

            left++;
            right--;
        }
    }
}