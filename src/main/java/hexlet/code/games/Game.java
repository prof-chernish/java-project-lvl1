package hexlet.code.games;

public interface Game {
    String getTask();
    String getQuestion();
    boolean isAnswerRight(String answer);
    String getCorrectAnswer();

}
