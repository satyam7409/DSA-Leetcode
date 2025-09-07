public class CheckKnightTourConfiguration {
    public static void main(String[] args) {
        int[][] grid = {
                {0, 11, 16, 5, 20},
                {17, 4, 19, 10, 15},
                {12, 1, 8, 21, 6},
                {3, 18, 23, 14, 9},
                {24, 13, 2, 7, 22}
        };
        int[] indexs = {0, 0};
        boolean ans = isValid(grid, indexs);
        System.out.println(ans);
    }

    static boolean isValid(int[][] grid, int[] indexs) {
        int n = grid.length;
        int last = n * n;

        if (grid[0][0] != 0) {
            return false;
        }

        for (int i = 1; i < last; i++) {   // ✅ loop till last cell
            int[] newIndexs = getNext(grid, indexs, i);
            if (newIndexs[0] == -1) {
                return false;
            }
            indexs[0] = newIndexs[0];
            indexs[1] = newIndexs[1];
        }
        return true;
    }

    static int[] getNext(int[][] grid, int[] index, int target) {
        int row = index[0];
        int col = index[1];
        int n = grid.length;

        // check all 8 knight moves
        if (isValid(row + 2, col + 1, n) && grid[row + 2][col + 1] == target) {
            return new int[]{row + 2, col + 1};
        }
        if (isValid(row + 2, col - 1, n) && grid[row + 2][col - 1] == target) {
            return new int[]{row + 2, col - 1};
        }
        if (isValid(row - 2, col + 1, n) && grid[row - 2][col + 1] == target) {
            return new int[]{row - 2, col + 1};
        }
        if (isValid(row - 2, col - 1, n) && grid[row - 2][col - 1] == target) {
            return new int[]{row - 2, col - 1};
        }
        if (isValid(row + 1, col + 2, n) && grid[row + 1][col + 2] == target) {
            return new int[]{row + 1, col + 2};
        }
        if (isValid(row + 1, col - 2, n) && grid[row + 1][col - 2] == target) {
            return new int[]{row + 1, col - 2};
        }
        if (isValid(row - 1, col + 2, n) && grid[row - 1][col + 2] == target) {
            return new int[]{row - 1, col + 2};
        }
        if (isValid(row - 1, col - 2, n) && grid[row - 1][col - 2] == target) {
            return new int[]{row - 1, col - 2};
        }

        return new int[]{-1, -1}; // not found
    }

    static boolean isValid(int row, int col, int n) {
        return row >= 0 && row < n && col >= 0 && col < n; // ✅ allow 0 index
    }
}
