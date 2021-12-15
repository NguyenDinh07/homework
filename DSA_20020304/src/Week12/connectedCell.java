package Week12;


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

    public class connectedCell {
        private static class CellChecker {
            private int[][] board;
            private boolean[][] isOne;

            public CellChecker(int[][] board) {
                this.board = board;
                isOne = new boolean[board.length][board[0].length];
            }

            private int numCellsInRegion(int row, int col) {
                if( inBounds(row, col) && !isOne[row][col] && board[row][col] == 1) {
                    isOne[row][col] = true;
                    if( board[row][col] == 1) {
                        for(int r = -1; r <= 1; r++)
                            for(int c = -1; c <= 1; c++)
                                numCellsInRegion(row + r, col + c);
                    }
                }
                return countCells();
            }

            private int countCells() {
                int result = 0;
                for(int r = 0; r < isOne.length; r++) {
                    for(int c = 0; c < isOne[0].length; c++) {
                        if(isOne[r][c])
                            result++;
                    }
                }
                return result;
            }


            private boolean inBounds(int r, int c) {
                return r < board.length && r >= 0 && c < board[0].length && c >= 0;
            }

        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int numRows = sc.nextInt();
            int numCols = sc.nextInt();
            sc.nextLine();

            // Scan in board
            int[][] board = new int[numRows][numCols];
            for(int i = 0; i < numRows; i++) {
                Scanner rowSc = new Scanner(sc.nextLine());
                for(int j = 0; j < numCols; j++)
                    board[i][j] = rowSc.nextInt();
            }


            int maximum = 0;
            for(int testRow = 0; testRow < numRows; testRow++) {
                for(int testCol = 0; testCol < numCols; testCol++) {
                    if(board[testRow][testCol] == 1) {
                        CellChecker check = new CellChecker(board);
                        int numInReg = check.numCellsInRegion(testRow, testCol);
                        if(numInReg > maximum)
                            maximum = numInReg;
                    }
                }
            }

            System.out.println(maximum);
        }
    }

