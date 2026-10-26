package model;

public class Project {

    private int projectId;
    private String title;
    private String description;
    private String status;

    public Project() {
    }

    public Project(int projectId, String title,
                   String description, String status) {

        this.projectId = projectId;
        this.title = title;
        this.description = description;
        this.status = status;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}