import javax.swing.*;
import java.util.Arrays;

public class TrueFalseQuestion extends Question {

    TrueFalseQuestion(String question, String answer){
        this.question = "TRUE or FALSE: "+question;

        this.correctAnswer = validAnswer(answer);
    }

    @Override
    String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            var valid = validAnswer(answer);

            // Check the answer if it one of the possible options or not.
            if (valid == null) {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE.");
            } else {
                return valid;
            }
        }
    }

    private String validAnswer(String answer){
        var validAnswersTrue = new String[]{"t", "true", "T", "True", "TRUE", "y", "yes", "Y", "Yes", "YES"};
        var validAnswersFalse = new String[]{"f", "false", "False", "FALSE", "n", "no", "No", "NO"};

        if (Arrays.asList(validAnswersTrue).contains(answer)) {
            return "TRUE";
        } else if (Arrays.asList(validAnswersFalse).contains(answer)){
            return "FALSE";
        }

        return null;
    }
}
