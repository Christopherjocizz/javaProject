import java.util.List;

public class CreditCard {
//privateAttributes
    private String cardNumber;
    private String titularName;
    private String expirationDate;
    private String cvv;
    private double creditLine;
    private double availableBalance;
    private boolean active;
    private List<shopping> shoppingList;

//constructor

    public CreditCard(String cardNumber, String titularName, String expirationDate, String cvv, double creditLine, double availableBalance, boolean active) {
        this.cardNumber = cardNumber;
        this.titularName = titularName;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
        this.creditLine = creditLine;
        this.availableBalance = availableBalance;
        this.active = active;
    }
}