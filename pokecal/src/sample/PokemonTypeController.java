package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.Button;
import java.io.*;
import java.util.ArrayList;


public abstract class PokemonTypeController implements Types {

    private ObservableList<String> poketypes1 = FXCollections.observableArrayList(getPokeTypeList());
    private ObservableList<String> poketypes2 = FXCollections.observableArrayList(getPokeTypeList());

    @FXML
    private ComboBox<String> type1 = new ComboBox<>();
    @FXML
    private ComboBox<String> type2 = new ComboBox<>();
    @FXML
    private TextArea type1re;
    @FXML
    private TextArea type2re;
    @FXML
    private TextArea type3re;
    @FXML
    private Button btnf1;

    @FXML
    private TextArea ts;
    @FXML
    private ListView<String> mylistView;
    TextArea getTs(){
    return ts; }
    ListView<String> getMylistView() {
        return mylistView; }
    @FXML
   public void  buttonPrint(ActionEvent event){
        type3re.setText("work in progress"); }
    @FXML
    private void initialize() {
        type1.setItems(poketypes1);
        type2.setItems(poketypes2);
    }

    @FXML
    private void defenseCalculateButtonPressed(ActionEvent event) {

        String keyholder = type1.getSelectionModel().getSelectedItem();
        String keyholder2 = type2.getSelectionModel().getSelectedItem();

        type1.setValue(null);
        type2.setValue(null);

        ArrayList<Double> result;

        ArrayList<Double> result2;

        ArrayList<String> trueresult2 = new ArrayList<>();

        if (keyholder == null) {
            keyholder = "none"; }

        if (keyholder2 == null) {
            keyholder2 = "none"; }
        if(keyholder == keyholder2) {
        keyholder2 = "none";
        }

        if (!keyholder2.equals("none") && (!keyholder.equals("none"))) {
            result2 = new ArrayList<>(getPokeAttackHashDef().get(keyholder2));
            result = new ArrayList<>(getPokeAttackHashDef().get(keyholder));

            int length = result.size();
            ArrayList<Double> comboresult = new ArrayList<>(length); //
            for (int i = 0; i < length; i++) { // Loop through every dam
                comboresult.add(result.get(i) * result2.get(i)); }
            for (int k = 0; k <= comboresult.size() - 2; k++) {
                if (comboresult.get(k) == 1.0) {
                    trueresult2.add(k, getPokeTypeList()[k] + " is effective"); }
                if (comboresult.get(k) == 0.25) {
                    trueresult2.add(k, "Resistsx2 " + getPokeTypeList()[k]); }
                if (comboresult.get(k) == 0.5) {
                    trueresult2.add(k, "Resists " + getPokeTypeList()[k]); }
                if (comboresult.get(k) == 0) {
                    trueresult2.add(k, "Immune to " + getPokeTypeList()[k]); }
                if (comboresult.get(k) == 2.0) {
                    trueresult2.add(k, "Weak to " + getPokeTypeList()[k]); }
                if (comboresult.get(k) == 4.0) {
                    trueresult2.add(k, "Weakx2 to " + getPokeTypeList()[k]); }
            }
            StringBuilder text = new StringBuilder();
            for (String mark : trueresult2) {
                text.append(mark).append('\n');
            }
            type3re.setText(keyholder +" " + "and "+ keyholder2 + " Type Chart: " +getNewLine()+
                    text.toString());
        }

        else if (!keyholder.equals("none")) {
            result2 = new ArrayList<>(getPokeAttackHashDef().get(keyholder));
            for (int k = 0; k <= result2.size() - 2; k++) {
                if (result2.get(k) == 1.0) {
                    trueresult2.add(k, getPokeTypeList()[k] + " is effective"); }
                if (result2.get(k) == 0.25) {
                    trueresult2.add(k, "Resistsx2 " + getPokeTypeList()[k]);
                }
                if (result2.get(k) == 0.5) {
                    trueresult2.add(k, "Resists " + getPokeTypeList()[k]);
                }
                if (result2.get(k) == 0) {
                    trueresult2.add(k, "Immune to " + getPokeTypeList()[k]);
                }
                if (result2.get(k) == 2.0) {
                    trueresult2.add(k, "Weak to " + getPokeTypeList()[k]);
                }
                if (result2.get(k) == 4.0) {
                    trueresult2.add(k, "Weakx2 to " + getPokeTypeList()[k]);
                }
            }
            StringBuilder text = new StringBuilder();
            for (String mark : trueresult2) {
                text.append(mark).append('\n');
            }

            type1re.setText(keyholder +" " + getNewLine() +text.toString());

        }
        else if (!keyholder2.equals("none")) {
            result2 = new ArrayList<>(getPokeAttackHashDef().get(keyholder2));
            for (int k = 0; k <= result2.size() - 2; k++) {
                if (result2.get(k) == 1.0) {
                    trueresult2.add(k, getPokeTypeList()[k] + " is effective"); }
                if (result2.get(k) == 0.25) {
                    trueresult2.add(k, "Resistsx2 " + getPokeTypeList()[k]);
                }
                if (result2.get(k) == 0.5) {
                    trueresult2.add(k, "Resists " + getPokeTypeList()[k]);
                }
                if (result2.get(k) == 0) {
                    trueresult2.add(k, "Immune to " + getPokeTypeList()[k]);
                }
                if (result2.get(k) == 2.0) {
                    trueresult2.add(k, "Weak to " + getPokeTypeList()[k]);
                }
                if (result2.get(k) == 4.0) {
                    trueresult2.add(k, "Weakx2 to " + getPokeTypeList()[k]);
                }
            }
            StringBuilder text = new StringBuilder();
            for (String mark : trueresult2) {
                text.append(mark).append('\n');
            }
            type2re.setText(keyholder2 + " " + "TypeChart:" + getNewLine() +text.toString()); }
        }

    @FXML
    private void damageCalculateButtonPressed(ActionEvent event) throws IOException {

        String selectedtype = type1.getSelectionModel().getSelectedItem();
        String selectedtype2 = type2.getSelectionModel().getSelectedItem();

        type1.setValue(null);
        type2.setValue(null);

        String keyholder = selectedtype;
        String keyholder2 = selectedtype2;

        ArrayList<Double> result; //= new ArrayList<>();

        ArrayList<Double> result2; //= new ArrayList<>();

        ArrayList<String> trueresult = new ArrayList<>();
        ArrayList<String> trueresult2 = new ArrayList<>();

        if (keyholder == null) {
            keyholder = "none";
        }

        if (keyholder2 == null) {
            keyholder2 = "none";
        }


        if (!keyholder2.equals("none") && (!keyholder.equals("none"))) {

            type3re.setText("You Can Only Pick One Type You Absolute degenerate");
        } else if (!keyholder2.equals("none")) {
            result2 = new ArrayList<>(getPokeAttackHashOf().get(keyholder2));
            for (int k = 0; k <= result2.size() - 2; k++) {
                if (result2.get(k) == 1.0)
                    trueresult2.add(k, getPokeTypeList()[k] + " |" + "effective|");
                if (result2.get(k) == 0.5)
                    trueresult2.add(k, getPokeTypeList()[k] + " |" + "not very effective|");

                if (result2.get(k) == 0)
                    trueresult2.add(k, getPokeTypeList()[k] + "| " + "immune|");
                if (result2.get(k) == 2.0) {
                    trueresult2.add(k, getPokeTypeList()[k] + " |" + "super effective|");
                }
            }
            StringBuilder text = new StringBuilder();
            for (String mark : trueresult2) {
                text.append(mark).append('\n');
            }
            type2re.setText(keyholder2 + " " + "TypeChart:" + getNewLine() + text.toString());
        } else if (!keyholder.equals("none")) {
            result = new ArrayList<>(getPokeAttackHashOf().get(keyholder));
            for (int i = 0; i <= result.size() - 2; i++) {
                if (result.get(i) == 1.0)
                    trueresult2.add(i, getPokeTypeList()[i] + " |" + "effective|");
                if (result.get(i) == 0.5)
                    trueresult2.add(i, getPokeTypeList()[i] + " |" + " not very effective|");

                if (result.get(i) == 0)
                    trueresult2.add(i, getPokeTypeList()[i] + " |" + "immune|");
                if (result.get(i) == 2.0) {
                    trueresult2.add(i, getPokeTypeList()[i] + " |" + "super effective|");

                }
            }
            StringBuilder text = new StringBuilder();
            for (String mark : trueresult2) {
                text.append(mark).append('\n');
            }

            type1re.setText(keyholder + " " + "TypeChart:" + getNewLine() + text.toString());
           /* try {
                Files.write(Paths.get("C://Users//Sinbr//Documents//Pokemont//textout//"+keyholder+"off.txt"), text.toString().getBytes());
            } catch (IOException e) {
                mylistView.getItems().add("bro what the heck look at what you did " + e);
            }

            */
        }
    }

}




















