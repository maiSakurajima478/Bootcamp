package models;

public class Report {
    private Integer id;
    private String title;
    private String content;
    private String file_url;
    private User user;
    private Label label;
    private TrainStation train_satation;
    private String created_at;
    private String updated_at;

    public Report(Integer id, String title, String content, String file_url, User user, Label label, TrainStation train_Station, String created_at, String updated_at) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.file_url = file_url;
        this.user = user;
        this.label = label;
        this.train_satation = train_Station;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFile_url() {
        return file_url;
    }

    public void setFile_url(String file_url) {
        this.file_url = file_url;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Label getLabel() {
        return label;
    }

    public void setLabel(Label label) {
        this.label = label;
    }

    public TrainStation getTrain_satation() {
        return train_satation;
    }

    public void setTrain_satation(TrainStation train_satation) {
        this.train_satation = train_satation;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }
}
