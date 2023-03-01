package be.technifuture.sudoku.sudoku9x9;

import be.technifuture.sudoku.SudokuModel;
import be.technifuture.sudoku.SudokuView;

public class SudokuVue9x9 implements SudokuView {
    private SudokuModel9x9 model;
    private static String format = """
            +-------+-------+-------+
            | . . . | . . . | . . . |
            | . . . | . . . | . . . |
            | . . . | . . . | . . . |
            +-------+-------+-------+
            | . . . | . . . | . . . |
            | . . . | . . . | . . . |
            | . . . | . . . | . . . |
            +-------+-------+-------+
            | . . . | . . . | . . . |
            | . . . | . . . | . . . |
            | . . . | . . . | . . . |
            +-------+-------+-------+
            """.replace(".","%s");

    public SudokuVue9x9(SudokuModel9x9 model){
        this.model = model;
    }
    @Override
    public String getScreen() {
        Character[] val = new Character[81];
        int pos = 0;
        for (int i = 0; i < model.getMaxLine(); i++) {
            for (int j = 0; j < model.getMaxColumn(); j++) {
                if (model.isEmpty(i,j)) val[pos] = '.';
                else val[pos] = model.getValue(i,j);
                pos ++;
            }
        }
        return String.format(format,val);
    }

    @Override
    public SudokuModel getModel() {
        return model;
    }
}
