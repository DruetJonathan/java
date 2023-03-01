package be.technifuture.sudoku.sudokuSamourai;

import be.technifuture.sudoku.ModelFactory;
import be.technifuture.sudoku.SudokuModel;
import be.technifuture.sudoku.sudoku9x9.SudokuModel9x9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ModelFactorySamourai implements ModelFactory {
    @Override
    public SudokuSamourai getModel(String FileName) {
        SudokuSamourai sm = new SudokuSamourai();
        File file = new File(FileName);
        String ligne = "";
        int j = 0;
        try(Scanner scanner = new Scanner(file);){
            while (scanner.hasNextLine()){
                ligne = scanner.nextLine();
                for (int i = 0; i < 21; i++) {
                    sm.setValue(j,i,ligne.charAt(i));
                }
                j ++;
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Le fichier n'existe pas.");
        };
        return sm;
    }
}
