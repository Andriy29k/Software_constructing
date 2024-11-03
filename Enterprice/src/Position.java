import java.util.Date;

public class Position {
    private Long id;
    private String title;
    private Date startDate;

    public Position(Long id, String title, Date startDate) {
        this.id = id;
        this.title = title;
        this.startDate = startDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }
}
