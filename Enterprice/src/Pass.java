import java.util.Date;

public class Pass {
    private Long id;
    private String cardNumber;
    private Date issueDate;

    public Pass(Long id, String cardNumber, Date issueDate) {
        this.id = id;
        this.cardNumber = cardNumber;
        this.issueDate = issueDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }
}
