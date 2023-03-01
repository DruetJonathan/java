package be.technifuture.sudoku.sudoku4x4;

import be.technifuture.sudoku.SudokuModel;
import be.technifuture.sudoku.sudoku9x9.SudokuModel9x9;

import javax.swing.*;

public class SudokuModel4x4 implements SudokuModel {
    private char[][] gameBoard = new char[4][4];

    public SudokuModel4x4(){
        initGameBoard();
    }
    @Override
    public int cellCount() {
        return 16;
    }

    @Override
    public char getValue(int lineNumber, int columnNumber) {
        return this.gameBoard[lineNumber][columnNumber];
    }

    @Override
    public void setValue(int lineNumber, int columnNumber,char value) {
        this.gameBoard[lineNumber][columnNumber] = value;
    }

    @Override
    public int getMaxLine() {
        return 4;
    }

    @Override
    public int getMaxColumn() {
        return 4;
    }

    @Override
    public boolean isPositionValid(int lineNumber, int columnNumber) {
        // regarde si la valeur peut etre posé à cette position
        boolean flag = true;
        if ((lineNumber >= gameBoard.length || lineNumber <= 0)
                && (columnNumber >= gameBoard.length || columnNumber <= 0))
        {
            flag = false;
        }
        return flag;
    }

    @Override
    public boolean isValueValid(char value) {
        // regarde si la valeur est acceptable
        char[] tmp = {'1','2','3','4'};
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
