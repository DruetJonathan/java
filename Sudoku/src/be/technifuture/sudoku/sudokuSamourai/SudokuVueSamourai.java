package be.technifuture.sudoku.sudokuSamourai;

import be.technifuture.sudoku.SudokuModel;
import be.technifuture.sudoku.SudokuView;
import be.technifuture.sudoku.sudoku9x9.SudokuModel9x9;

public class SudokuVueSamourai implements SudokuView {
    private SudokuSamourai model;
    String format = """
            +-------+-------+-------+       +-------+-------+-------+
            | . . . | . . . | . . . |       | . . . | . . . | . . . |
            | . . . | . . . | . . . |       | . . . | . . . | . . . |
            | . . . | . . . | . . . |       | . . . | . . . | . . . |
            +-------+-------+-------+       +-------+-------+-------+
            | . . . | . . . | . . . |       | . . . | . . . | . . . |
            | . . . | . . . | . . . |       | . . . | . . . | . . . |
            | . . . | . . . | . . . |       | . . . | . . . | . . . |
            +-------+-------+-------+-------+-------+-------+-------+
            | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
            | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
            | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
            +-------+-------+-------+-------+-------+-------+-------+
            		        | . . . | . . . | . . . |
            		        | . . . | . . . | . . . |
            		        | . . . | . . . | . . . |
            +-------+-------+-------+-------+-------+-------+-------+
            | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
            | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
            | . . . | . . . | . . . | . . . | . . . | . . . | . . . |
            +-------+-------+-------+-------+-------+-------+-------+
            | . . . | . . . | . . . |       | . . . | . . . | . . . |
            | . . . | . . . | . . . |       | . . . | . . . | . . . |
            | . . . | . . . | . . . |       | . . . | . . . | . . . |
            +-------+-------+-------+       +-------+-------+-------+
            | . . . | . . . | . . . |       | . . . | . . . | . . . |
            | . . . | . . . | . . . |       | . . . | . . . | . . . |
            | . . . | . . . | . . . |       | . . . | . . . | . . . |
            +-------+-------+-------+	    +-------+-------+-------+
            """.replace(".","%s");


    public SudokuVueSamourai(SudokuSamourai model){
        this.model = model;
    }
    @Override
    public String getScreen() {
        Character[] val = new Character[441];
        int pos = 0;
        for (int i = 0; i < model.getMaxLine(); i++) {
            for (int j = 0; j < model.getMaxColumn(); j++) {
                if (model.isPositionValid(i,j)){
                    if (model.isEmpty(i,j)) val[pos] = '.';
                    else val[pos] = model.getValue(i,j);
                    pos ++;
                }
            }
        }
        return String.format(format,val);
    }

    @Override
    public SudokuModel getModel() {
        return model;
    }
}
