package datenightatthearcade;

public class Game {

    private int gameNumber;
    private int creditNeeded;
    private int ticketWon;

   //A constructor created in the game class with specified credits
    public Game(int creditNeeded) {
        this.creditNeeded = creditNeeded;
        ticketWon = (int) (Math.random() * 10);//return a double value, 0.0=< values <1.0   
    }

    //Creata a playGame method with the card objects
    public void playGame(Card c) {
        if (c.getCreditBalance() < getCreditNeeded()) {
            System.out.println("Insufficient credits for card number " + c.getCardId());
            c.getTicketBalance();
        } else {
            c.setCreditBalance(c.getCreditBalance() - getCreditNeeded());
            System.out.println(creditNeeded + " Credits has been cut " + " in card: " + c.getCardId());
            c.setTicketBalance(c.getTicketBalance() + getTicketWon());
        }
    }

    public int getGameNumber() {
        return gameNumber;
    }

    public int getCreditNeeded() {
        return creditNeeded;
    }

    public int getTicketWon() {
        return ticketWon;
    }
}
