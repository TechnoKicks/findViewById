package me.skrilltrax.mywallet.creditdebitcard;

public class CDCards {

    Boolean isCredit;
    Long CardNumber;
    String Name;
    int ExpiringDate;
    int ExpiringYear;
    int CVVNumber;

    public CDCards() {

    }

    public Long getCardNumber() {
        return CardNumber;
    }

    public String getName() {
        return Name;
    }

    public int getExpiringDate() {
        return ExpiringDate;
    }

    public int getCVVNumber() {
        return CVVNumber;
    }

    public int getExpiringYear() {
        return ExpiringYear;
    }

    public void setCardNumber(Long cardNumber) {
        CardNumber = cardNumber;
    }

    public Boolean getCredit() {
        return isCredit;
    }

    public void setCredit(Boolean credit) {
        isCredit = credit;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setExpiringYear(int expiringYear) {
        ExpiringYear = expiringYear;
    }

    public void setCVVNumber(int CVVNumber) {
        this.CVVNumber = CVVNumber;
    }

    public void setExpiringDate(int expiringDate) {
        ExpiringDate = expiringDate;
    }
}
