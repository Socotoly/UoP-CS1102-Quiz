import java.util.Arrays;
import javax.swing.*;

public class TrueFalseQuestion extends Question {

    TrueFalseQuestion(String question, String answer) {
        super(question);

        JPanel buttons = new JPanel();
        addButton(buttons,"TRUE");
        addButton(buttons,"FALSE");

        this.question.add(buttons);

        this.initQuestionDialog();

        this.correctAnswer = validAnswer(answer);
    }


    // I extracted this logic in its own method because it's used
    // in the constructor and the "ask" method.
    private String validAnswer(String answer) {
        var validAnswersTrue = new String[]{"t", "true", "T", "True", "TRUE", "y", "yes", "Y", "Yes", "YES"};
        var validAnswersFalse = new String[]{"f", "false", "F", "False", "FALSE", "n", "no", "N", "No", "NO"};

        // convert array to list so I can use the "contains" method
        // to check all values against the answer parameter
        if (Arrays.asList(validAnswersTrue).contains(answer)) {
            return "TRUE";
        } else if (Arrays.asList(validAnswersFalse).contains(answer)) {
            return "FALSE";
        }

        // returns null when the answer is invalid.
        return null;
    }

    private void addButton(JPanel buttons, String label) {
        JButton button = new JButton(label);
        button.addActionListener(question);

        buttons.add(button);
    }
}
