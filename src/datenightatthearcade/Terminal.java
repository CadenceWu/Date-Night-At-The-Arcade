package datenightatthearcade;

public class Terminal {

    private int money;
    private int credit;

    PrizeCategory p1;
    PrizeCategory p2;
    PrizeCategory p3;

    /*Using the prizes in prize category call and 
    specifing them with name, required tickets, and the numbers of category*/
    public Terminal() {
        p1 = new PrizeCategory("Candy", 5, 3);
        p2 = new PrizeCategory("Hat", 7, 4);
        p3 = new PrizeCategory("Glasses", 10, 3);
    }

    public void addCredits(Card c, int money) {
        credit = money * 2;//1 dollar for two credits
        c.setCreditBalance(c.getCreditBalance() + credit);//Add the new credits to the exist credits
        System.out.println(credit + " Credit has been added " + "to card id " + c.getCardId());
    }

    public void checkCardBalance(Card c) {

        System.out.println("Check card id: " + c.getCardId());
        System.out.println("Check credit balance: " + c.getCreditBalance());
        System.out.println("Check ticket balance: " + c.getTicketBalance());
    }

    public void transferCredits(Card c1, Card c2) {
        //trnsfer all the credits in the first card to the second card
        c2.setCreditBalance(c2.getCreditBalance() + c1.getCreditBalance());
        c1.setCreditBalance(0);
        System.out.println("Transfer credits");
        System.out.println("card1's credits: " + c1.getCreditBalance());
        System.out.println("card2's credits: " + c2.getCreditBalance());

    }

    public void transferTickets(Card c1, Card c2) {
        //transfer all the tickets in the fisrt card to the second card
        c2.setTicketBalance(c2.getTicketBalance() + c1.getTicketBalance());
        c1.setTicketBalance(0);
        System.out.println("Transfer tickets");
        System.out.println("card1's tickets: " + c1.getTicketBalance());
        System.out.println("card2's tickets: " + c2.getTicketBalance());
    }

    public void requestPrize(String prizeName, Card c) {
        //initialize the prizeCategory object
        PrizeCategory p = new PrizeCategory("Empty", 0, 0);
        if (p1.getItemName().equals(prizeName)) {
            p = p1;
        } else if (p2.getItemName().equals(prizeName)) {
            p = p2;
        } else if (p3.getItemName().equals(prizeName)) {
            p = p3;
        } else {
            System.out.println("Please enter \"Candy\",\"Hat\",or \"Glasses\"");
        }
        if (c.getTicketBalance() >= p1.getRequiredTickets()) {//If the tickets in the card is enough
            if (p.getNumbers() > 0) { // If the prize is enough
                c.setTicketBalance(c.getTicketBalance() - p.getRequiredTickets());//The ticket balance will be ducted
                p.consumeItem();
                System.out.println("Successfully exchanged " + p.getItemName() + ". Ticket spent: " + p.getRequiredTickets());

            } else {
                System.out.println("No prize left");
            }
        } else {
            System.out.println("You don't have enough tickets to exchange the prize.");
        }
    }

    public int getMoney() {
        return money;
    }
}
