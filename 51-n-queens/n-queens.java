

class Solution {
    List<List<String>> res = new ArrayList<>();
    boolean[] col, diag1, diag2;
    int n;

    public List<List<String>> solveNQueens(int n) {
        this.n = n;
        col = new boolean[n];
        diag1 = new boolean[2 * n];
        diag2 = new boolean[2 * n];
        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');

        backtrack(0, board);
        return res;
    }

    void backtrack(int row, char[][] board) {
        if (row == n) {
            List<String> temp = new ArrayList<>();
            for (int i = 0; i < n; i++)
                temp.add(new String(board[i]));
            res.add(temp);
            return;
        }

        for (int c = 0; c < n; c++) {
            if (col[c] || diag1[row + c] || diag2[row - c + n])
                continue;

            board[row][c] = 'Q';
            col[c] = diag1[row + c] = diag2[row - c + n] = true;

            backtrack(row + 1, board);

            board[row][c] = '.';
            col[c] = diag1[row + c] = diag2[row - c + n] = false;
        }
    }
}
