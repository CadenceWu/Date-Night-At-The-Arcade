package datenightatthearcade;

public class Card {

    private int creditBalance;
    private int ticketBalance;
    private int cardId;
    private static int cardNumberGenerator = 0;

    public Card() {
        cardNumberGenerator++;
        cardId = cardNumberGenerator;
    }

    public int getCreditBalance() {
        return creditBalance;
    }

    public int getTicketBalance() {
        return ticketBalance;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCreditBalance(int creditBalance) {
        this.creditBalance = creditBalance;
    }

    public void setTicketBalance(int ticketBalance) {
        this.ticketBalance = ticketBalance;
    }

    public static int getCardNumberGenerator() {
        return cardNumberGenerator;
    }
}
