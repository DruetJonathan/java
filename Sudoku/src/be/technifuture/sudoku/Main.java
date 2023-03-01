package be.technifuture.sudoku;

import be.technifuture.sudoku.sudoku4x4.SudokuModel4x4;
import be.technifuture.sudoku.sudoku9x9.SudokuModel9x9;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sudoku");
        SudokuModel4x4 s4x4 = new SudokuModel4x4();
        System.out.println("------------------ 4x4 ------------------");
        System.out.println("-Nombre de colone: "+s4x4.getMaxColumn());
        System.out.println("-Nombre de ligne: "+s4x4.getMaxLine());
        System.out.println("-Nombre totale de cellule: "+s4x4.cellCount());
        System.out.println("# Set de value '5' a la position 0,0 #");
        s4x4.setValue(0,0,'5');
        System.out.println("-Value à la position 0,0 :"+s4x4.getValue(0,0));
        System.out.println("# Clear de la valeur 5 à la position 0,0#");
        s4x4.clearCell(0,0);
        System.out.println("-Cellule à la position 0,0 est vide: "+s4x4.isEmpty(0,0));
        System.out.println("-Value valid (2): "+s4x4.isValueValid('2'));
        System.out.println("-Value valid (-1): "+s4x4.isValueValid('8'));
        System.out.println("-isPosition valid -1,-1: "+s4x4.isPositionValid(-1,-1));
        System.out.println("-isPosition valid 2,2: "+s4x4.isPositionValid(2,2));

        System.out.println("------------------ 9x9 ------------------");
        SudokuModel9x9 s9x9 = new SudokuModel9x9();
        System.out.println("-Nombre de ligne: "+s9x9.getMaxLine());
        System.out.println("-Nombre totale de cellule: "+s9x9.cellCount());
        System.out.println("# Set de value '5' a la position 0,0 #");
        s9x9.setValue(0,0,'5');
        System.out.println("-Value à la position 0,0 :"+s9x9.getValue(0,0));
        System.out.println("# Clear de la valeur 5 à la position 0,0#");
        s9x9.clearCell(0,0);
        System.out.println("-Cellule à la position 0,0 est vide: "+s9x9.isEmpty(0,0));
        System.out.println("-Value valid (2): "+s9x9.isValueValid('2'));
        System.out.println("-Value valid (10): "+s9x9.isValueValid('a'));
        System.out.println("-isPosition valid -1,-1: "+s9x9.isPositionValid(-1,-1));
        System.out.println("-isPosition valid 2,2: "+s9x9.isPositionValid(2,2));
    }
}
