import javax.swing.*;

public abstract class Question {
    static int nQuestions = 0;
    static int nCorrect = 0;

    String question;
    String correctAnswer;

    abstract String ask();

    public void check() {
        // Increment the number of questions that have been asked to the user.
        nQuestions++;
        String answer = ask();

        if (answer.equals(correctAnswer)) {
            // Increment the number of correct answers.
            nCorrect++;
            JOptionPane.showMessageDialog(null, "Correct");
        } else {
            JOptionPane.showMessageDialog(null, "Incorrect The correct answer is " + correctAnswer);
        }
    }

    static void showResults() {
        JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions");
    }
}
