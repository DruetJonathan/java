package be.technifuture.sudoku;

import be.technifuture.sudoku.SudokuModel;

public interface ModelFactory {
    SudokuModel getModel(String FileName);
    SudokuView getVue(String FileName);
}
