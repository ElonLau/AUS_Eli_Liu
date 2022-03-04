package entity;

/**
 * Declare and initialize all the row id in sql database
 * Robot class includes id, parentId, question, and answer
 */
public class Robot {
    public Long id;
    public Long parentId;
    public String question;
    public String answer;

    public Robot(Long id, Long parentId, String question, String answer) {
        this.id = id;
        this.parentId = parentId;
        this.question = question;
        this.answer = answer;
    }
}
