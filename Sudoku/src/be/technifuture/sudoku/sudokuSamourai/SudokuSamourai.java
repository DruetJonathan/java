package be.technifuture.sudoku.sudokuSamourai;

import be.technifuture.sudoku.SudokuModel;

public class SudokuSamourai implements SudokuModel {
    private char[][] gameBoard = new char[21][21];

    public SudokuSamourai(){
        initGameBoard();
    }
    @Override
    public int cellCount() {
        return 441;
    }

    @Override
    public char getValue(int lineNumber, int columnNumber) {
        return this.gameBoard[lineNumber][columnNumber];
    }

    @Override
    public void setValue(int lineNumber, int columnNumber, char value) {
        this.gameBoard[lineNumber][columnNumber] = value;
    }

    @Override
    public int getMaxLine() {
        return 21;
    }

    @Override
    public int getMaxColumn() {
        return 21;
    }

    @Override
    public boolean isPositionValid(int line, int col) {
        // regarde si la valeur peut etre posé à cette position
        if ((line >= 0 && col >= 0 && line < 9 && col < 9) ||
                (line >= 0 && col >= 12 && line < 9 && col < 9+12) ||
                (line >= 6 && col >= 6 && line < 9+6 && col < 9+6) ||
                (line >= 12 && col >= 0 && line < 9+12 && col < 9) ||
                (line >= 12 && col >= 12 && line < 9+12 && col < 9+12)){
            return true;
        }
        return false;
    }

    @Override
    public boolean isValueValid(char value) {
        // regarde si la valeur est acceptable
        char[] tmp = {'1','2','3','4','5','6','7','8','9'};
        boolean flag = false;
        int i = 0;
        while (!flag && i < tmp.length){
            if (tmp[i] == value) flag = true;
            i++;
        }
        return flag;
    }

    @Override
    public boolean isEmpty(int lineNumber, int columnNumber) {
        return this.gameBoard[lineNumber][columnNumber] == SudokuModel.EMPTY ? true : false;
    }

    @Override
    public void clearCell(int lineNumber, int columnNumber) {
        this.gameBoard[lineNumber][columnNumber] = SudokuModel.EMPTY;
    }

    @Override
    public void initGameBoard() {
        for (int i = 0; i < this.gameBoard.length; i++) {
            for (int j = 0; j < this.gameBoard[i].length; j++) {
                this.gameBoard[i][j] = SudokuModel.EMPTY;
            }
        }
    }

}
