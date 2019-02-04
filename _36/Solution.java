package _36;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        int len = board.length;
        int width = board[0].length;
        boolean[][] column = new boolean[len][len];
        boolean[][] row = new boolean[len][len];
        boolean[][] sboard = new boolean[len * width / 9][9];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < width; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int integer = c - '0' - 1;
                    int boardid = (j / 3) * (width / 3) + (i / 3);
                    boolean result = column[i][integer]
                            | row[j][integer] | sboard[boardid][integer];
                    if (result) {
                        return false;
                    }
                    column[i][integer] = true;
                    row[j][integer] = true;
                    sboard[boardid][integer] = true;
                }
            }
        }
        return true;
    }
}
