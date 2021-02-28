import javax.swing.*;
import java.util.Arrays;

public class TrueFalseQuestion extends Question {

    TrueFalseQuestion(String question, String answer) {
        this.question = "TRUE or FALSE: " + question;

        this.correctAnswer = validAnswer(answer);
    }

    @Override
    String ask() {
        while (true) {
            String answer = JOptionPane.showInputDialog(question);
            answer = answer.toUpperCase();

            var valid = validAnswer(answer);

            // Check if the answer is null then the answer is invalid, check the "validAnswer" method implementation.
            if (valid == null) {
                JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE.");
            } else {
                return valid;
            }
        }
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
}
