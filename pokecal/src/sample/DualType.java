package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.FileChooser;

import java.io.*;
import java.nio.file.Files;

public class DualType extends PokemonTypeController {
@Override
    @FXML
public void  buttonPrint(ActionEvent event){
    FileChooser fc = new FileChooser();

    fc.setInitialDirectory(new File("C:\\Users\\Sinbr\\Documents\\Pokemont\\textout"));
    File selectedFile = fc.showOpenDialog(null);

    StringBuilder contents = new StringBuilder();
    BufferedReader reader = null;
    String soas = null;
    if(selectedFile == null) {
        return;
    }
    try {
            soas = selectedFile.getName().substring(0, selectedFile.getName().indexOf(".txt"));
        } catch (NullPointerException e ){
            getMylistView().getItems().add("you utter fool you are supposed to do exactly not that");}
    try {
        reader = new BufferedReader(new FileReader(selectedFile)); }
    catch (FileNotFoundException e) { e.printStackTrace(); }

    String text = null;
    while (true) {
        try {
            assert reader != null;

            if ((text = reader.readLine()) == null) break;
        } catch (IOException e) {
            e.printStackTrace();
        }
        contents.append(text).append(System.getProperty("line.separator"));
    }
    try {
        reader.close(); }
    catch (IOException e) {
        e.printStackTrace(); }
    getMylistView().getItems().add(soas+ " " + getNewLine()+ contents.toString());
    }
}
