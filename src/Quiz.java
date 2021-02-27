
public class Quiz {

    public static void main(String[] args) {
        // first question
        Question question = new MultipleChoiceQuestion("What is the equation to calculate the circumference of the circle?",
                "π^2/r", "3πr", "2πr", "1/2πr", "π^2r", "c");

        question.check();


        // second question
        question = new MultipleChoiceQuestion("What is the smallest country in the world?",
                "Vatican City", "Kuwait", "Chile", "New Zealand", "Somalia", "a");

        question.check();


        // third question
        question = new MultipleChoiceQuestion("How many time zones are there in Russia?",
                "1", "9", "7", "4", "11", "e");

        question.check();


        // forth question
        question = new MultipleChoiceQuestion("For which of the following disciplines is Nobel Prize awarded?",
                "Physics and Chemistry", "Physiology or Medicine", "Literature", "Economics", "All of the above", "e");

        question.check();


        // fifth question
        question = new MultipleChoiceQuestion("The ozone layer restricts:",
                "Visible light", "Ultraviolet radiation", "X-rays", "Gamma rays", "Infrared radiation", "b");

        question.check();

        // Show the final dialog to the user with how much correct answers they got.
        Question.showResults();
    }

}
