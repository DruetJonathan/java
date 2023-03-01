package be.technifuture.sudoku.sudoku4x4;

import be.technifuture.sudoku.SudokuModel;
import be.technifuture.sudoku.SudokuView;

public class SudokuVue4x4 implements SudokuView {
    private SudokuModel4x4 model;

    public SudokuVue4x4(SudokuModel4x4 model){
        this.model = model;
    }
    @Override
    public String getScreen() {
        String sudoku = "";
        SudokuModel model = getModel();
        sudoku += "+-----+-----+\n";
        for (int i = 0; i < model.getMaxColumn(); i++) {
            sudoku += "| ";
            for (int j = 0; j < model.getMaxColumn(); j++) {
                sudoku += (model.getValue(i,j)+" ");
                if (j % 2 == 1) sudoku += "| ";
            }
            if (i % 2 == 1) sudoku += "\n+-----+-----+\n";
            else sudoku += "\n";
        }
        return sudoku;
    }

    @Override
    public SudokuModel getModel() {
        return model;
    }
}
