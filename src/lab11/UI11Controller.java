package lab11;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * Created by Work on 20.04.2017.
 */
public class UI11Controller {
    @FXML
    TextField tfA;
    @FXML
    TextField tfN;
    @FXML
    TextField tfH;
    @FXML
    TextArea taOutput;

    public void Enter(){
        if((!tfA.getText().equals(""))&&(!tfN.getText().equals(""))&&(!tfH.getText().equals(""))){
            Integer n=new Integer(tfN.getText());
            Double A=new Double(tfA.getText());
            Double h=new Double(tfH.getText());
            Double y=new Double(0);
            Double x=new Double(0);
            taOutput.clear();
            for(int i=0;i<n;i++){
                y=A*Math.sqrt(x)*Math.sin(A*x);
                taOutput.setText(taOutput.getText()+x+"          "+y+"\n");
                x+=h;
            }
        }
    }
}
