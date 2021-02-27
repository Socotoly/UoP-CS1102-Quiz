
public class Quiz {

    public static void main(String[] args) {

        var AllQuestions = new Question[10];

        // first question
        AllQuestions[0] = new MultipleChoiceQuestion("What is the equation to calculate the circumference of the circle?",
                "π^2/r", "3πr", "2πr", "1/2πr", "π^2r", "c");

        // second question
        AllQuestions[1] = new TrueFalseQuestion("The earth is the fourth planet from the sun.", "false");

        // third question
        AllQuestions[2] = new MultipleChoiceQuestion("What is the smallest country in the world?",
                "Vatican City", "Kuwait", "Chile", "New Zealand", "Somalia", "a");

        // second question
        AllQuestions[3] = new TrueFalseQuestion("Chewing gum can boost your concentration.", "true");

        // third question
        AllQuestions[4] = new MultipleChoiceQuestion("How many time zones are there in Russia?",
                "1", "9", "7", "4", "11", "e");

        // second question
        AllQuestions[5] = new TrueFalseQuestion("Milk is 87% water.", "true");

        // forth question
        AllQuestions[6] = new MultipleChoiceQuestion("For which of the following disciplines is Nobel Prize awarded?",
                "Physics and Chemistry", "Physiology or Medicine", "Literature", "Economics", "All of the above", "e");

        // second question
        AllQuestions[7] = new TrueFalseQuestion("Marrakesh is the capital of Morocco.", "false");

        // fifth question
        AllQuestions[8] = new MultipleChoiceQuestion("The ozone layer restricts:",
                "Visible light", "Ultraviolet radiation", "X-rays", "Gamma rays", "Infrared radiation", "b");

        // second question
        AllQuestions[9] = new TrueFalseQuestion("An octopus has three hearts.", "true");

        for (var question: AllQuestions) {
            question.check();
        }

        // Show the final dialog to the user with how much correct answers they got.
        Question.showResults();
    }

}
