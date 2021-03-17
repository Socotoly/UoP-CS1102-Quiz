import javax.swing.*;
import java.awt.*;

public abstract class Question {
    static int nQuestions = 0;
    static int nCorrect = 0;

    QuestionDialog question;
    String correctAnswer;

    Question(String question){
        this.question = new QuestionDialog();
        this.question.setLayout(new GridLayout(0,1));

        this.question.add(new JLabel(" "+question+" ",JLabel.CENTER));
    }

    void initQuestionDialog() {
        this.question.setModal(true);
        this.question.pack();
        this.question.setLocationRelativeTo(null);
    }

    String ask() {
        question.setVisible(true);

        return question.answer;
    };

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
