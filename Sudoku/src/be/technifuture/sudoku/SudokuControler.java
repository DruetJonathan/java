package be.technifuture.sudoku;

import be.technifuture.sudoku.sudoku4x4.ModelFactory4x4;

import java.io.File;
import java.util.Scanner;

public class SudokuControler {
    private ModelFactory modelFactory;

    SudokuControler(ModelFactory modelFactory){
        this.modelFactory = modelFactory;
    }
    void start(String FileName){
        SudokuView sv = this.modelFactory.getVue(FileName);
        SudokuModel model = sv.getModel();

        Scanner scanner = new Scanner(System.in);
        String userInput = "";
        String[] userInputTab;
        boolean continuer = true;
        while (continuer){

            // Affichage de la grille + get des inputs
            System.out.print(sv.getScreen());
            System.out.println("Entre valeur.row.col: ");
            userInput = scanner.nextLine();
            userInputTab = userInput.split("\\.");

            // traitements des inputs
            if (!userInput.equalsIgnoreCase("q")){
                if (model.isPositionValid(Integer.parseInt(userInputTab[1]),Integer.parseInt(userInputTab[2]))
                        && model.isValueValid(userInput.charAt(0)))
                    model.setValue(Integer.parseInt(userInputTab[1])-1,Integer.parseInt(userInputTab[2])-1,userInputTab[0].charAt(0));
            }else{continuer = false;}
        }
    }
}
