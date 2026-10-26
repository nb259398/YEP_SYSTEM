package model;

public class Assessment {

    private int assessmentId;
    private String title;
    private int score;
    private String feedback;

    public Assessment() {
    }

    public Assessment(int assessmentId, String title,
                      int score, String feedback) {

        this.assessmentId = assessmentId;
        this.title = title;
        this.score = score;
        this.feedback = feedback;
    }

    public int getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(int assessmentId) {
        this.assessmentId = assessmentId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}