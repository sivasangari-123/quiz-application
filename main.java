public class main {
    public static void main(String[] args) {

        QuestionService questionService = new QuestionService();
        questionService.playQuiz();
        questionService.printScore();
    }
}