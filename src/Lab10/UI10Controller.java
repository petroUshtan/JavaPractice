package Lab10;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.ArrayList;

/**
 * Created by Work on 19.04.2017.
 */
public class UI10Controller {
    @FXML
    TextField taSurname;
    @FXML
    TextField taPhone;
    @FXML
    TextField taCount;

    Integer count = new Integer(0);
    ArrayList<Person> list = new ArrayList<Person>();

    public void Print() {
        for (Person p : list) {
            System.out.println(p.toString());
        }
    }

    public void Save() {
        if ((!taSurname.getText().equals("")) && (!taPhone.getText().equals(""))) {
            list.add(new Person(taSurname.getText(), taSurname.getText()));
            try {
                count++;
                taCount.setText(Integer.toString(count));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            taPhone.clear();
            taSurname.clear();
        }

    }

}
