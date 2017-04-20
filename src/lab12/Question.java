package lab12;

/**
 * Created by Work on 20.04.2017.
 */
public class Question {
    private String question;
    private String variant1;
    private String variant2;
    private String variant3;
    private String variant4;

    public Question() {
    }

    public Question(String question, String variant1, String variant2, String variant3, String variant4, String writeAnswer) {
        this.question = question;
        this.variant1 = variant1;
        this.variant2 = variant2;
        this.variant3 = variant3;
        this.variant4 = variant4;
        this.writeAnswer = writeAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getVariant1() {
        return variant1;
    }

    public void setVariant1(String variant1) {
        this.variant1 = variant1;
    }

    public String getVariant2() {
        return variant2;
    }

    public void setVariant2(String variant2) {
        this.variant2 = variant2;
    }

    public String getVariant3() {
        return variant3;
    }

    public void setVariant3(String variant3) {
        this.variant3 = variant3;
    }

    public String getVariant4() {
        return variant4;
    }

    public void setVariant4(String variant4) {
        this.variant4 = variant4;
    }

    public String getWriteAnswer() {
        return writeAnswer;
    }

    public void setWriteAnswer(String writeAnswer) {
        this.writeAnswer = writeAnswer;
    }

    private String writeAnswer;

}
