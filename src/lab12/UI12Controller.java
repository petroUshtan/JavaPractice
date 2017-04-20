package lab12;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;

import java.util.ArrayList;

/**
 * Created by Work on 20.04.2017.
 */
public class UI12Controller {

    @FXML
    Label lbQuestion;
    @FXML
    RadioButton rb1;
    @FXML
    RadioButton rb2;
    @FXML
    RadioButton rb3;
    @FXML
    RadioButton rb4;
    @FXML
    Button btnOk;

    int index = 0;
    int indexOfClak=0;

    ArrayList<Integer> marks = new ArrayList<Integer>();
    ArrayList<Question> questions = new ArrayList<Question>();

    public void initialize(){
        questions.add(new Question("Який колір неба?",
                "зелений",
                "синій",
                "жовтий",
                "червоний",
                "синій"));
        questions.add(new Question("Що відноситься до кислоти?",
                "вода",
                "сіль",
                "оцет",
                "мило",
                "оцет"));
        questions.add(new Question("Скільки коліс у автомобіля?",
                "1",
                "2",
                "3",
                "4",
                "4"));

        newQuestion(questions.get(0));
    }

    public void onOk(){
        if(index<3){
            if(isTrue(questions.get(index).getWriteAnswer())){
               marks.add(5);
            }else {
               marks.add(2);
            }
            System.out.println(marks.get(index));
            index++;
            if(index<3){
                newQuestion(questions.get(index));
            }
            if(index==3){
                btnOk.setText("Ваш результат: "+(myAVG().toString()));
            }
        }


    }
    Double myAVG(){
        Double d = new Double(0);
        for (Integer el : marks){
            d+=el;
        }

        return (d/3);
    }

    void newQuestion(Question question){
        lbQuestion.setText(question.getQuestion());
        rb1.setText(question.getVariant1());
        rb2.setText(question.getVariant2());
        rb3.setText(question.getVariant3());
        rb4.setText(question.getVariant4());
    }

    boolean isTrue(String answer){
        if(rb1.isSelected()){
            if(rb1.getText().equals(answer)) {
                return true;
            }
        }
        if(rb2.isSelected()){
            if(rb2.getText().equals(answer)){
                return true;
            }
        }
        if(rb3.isSelected()){
            if(rb3.getText().equals(answer)){
                return true;
            }
        }
        if(rb4.isSelected()){
            if(rb4.getText().equals(answer)){
                return true;
            }
        }
        return false;
    }

}
