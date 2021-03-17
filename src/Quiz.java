
public class Quiz {

    public static void main(String[] args) {
        // array to add all questions
        var AllQuestions = new Question[10];

        // first question
        AllQuestions[0] = new MultipleChoiceQuestion("What is the equation to calculate the circumference of the circle?",
                "π^2/r", "3πr", "2πr", "1/2πr", "π^2r", "c");

        // second question
        AllQuestions[1] = new TrueFalseQuestion("The earth is the fourth planet from the sun.", "false");

        // third question
        AllQuestions[2] = new MultipleChoiceQuestion("What is the smallest country in the world?",
                "Vatican City", "Kuwait", "Chile", "New Zealand", "Somalia", "a");

        // forth question
        AllQuestions[3] = new TrueFalseQuestion("Chewing gum can boost your concentration.", "true");

        // fifth question
        AllQuestions[4] = new MultipleChoiceQuestion("How many time zones are there in Russia?",
                "1", "9", "7", "4", "11", "e");

        // sixth question
        AllQuestions[5] = new TrueFalseQuestion("Milk is 87% water.", "true");

        // seventh question
        AllQuestions[6] = new MultipleChoiceQuestion("For which of the following disciplines is Nobel Prize awarded?",
                "Physics and Chemistry", "Physiology or Medicine", "Literature", "Economics", "All of the above", "e");

        // eighth question
        AllQuestions[7] = new TrueFalseQuestion("Marrakesh is the capital of Morocco.", "false");

        // ninth question
        AllQuestions[8] = new MultipleChoiceQuestion("The ozone layer restricts:",
                "Visible light", "Ultraviolet radiation", "X-rays", "Gamma rays", "Infrared radiation", "b");

        // tenth question
        AllQuestions[9] = new TrueFalseQuestion("An octopus has three hearts.", "true");

        // loop over the questions and call "check" to show it to the user.
        for (var question : AllQuestions) {
            question.check();
        }

        // Show the final dialog to the user with how much correct answers they got.
        Question.showResults();
    }

}
