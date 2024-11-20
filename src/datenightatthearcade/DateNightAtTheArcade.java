package datenightatthearcade;

public class DateNightAtTheArcade {

    public static void main(String[] args) {
        Card card1 = new Card(); // A card created with a unique id (1)
        Game game1 = new Game(5); // A playable game which costs 5 credits per play
        Terminal terminal1 = new Terminal(); // A terminal created
        card1.setCreditBalance(20);
        card1.setTicketBalance(20);
        game1.playGame(card1);
        System.out.println();
        System.out.println("The tickets won in game1: " + game1.getTicketWon());
        System.out.println();
        System.out.println("Games played by Card ID: " + card1.getCardId());
        System.out.println("Credit balance left: " + card1.getCreditBalance());
        System.out.println("Ticket balance: " + card1.getTicketBalance());
        System.out.println();
        System.out.println();

        terminal1.addCredits(card1, 40); // add 80 credits with $40 into card1
        System.out.println();

        terminal1.checkCardBalance(card1);
        System.out.println();
        System.out.println();
        terminal1.requestPrize("Glasses", card1);//request Candy prize with card 1
        System.out.println();
        terminal1.checkCardBalance(card1);
        
        

        //Card card2 = new Card(); // Another card created with a unique id (2)
        //Game game2 = new Game(7); // Another playable game which costs 7 credits per play
        //Terminal terminal2 = new Terminal(); // Another terminal created
        //card2.setCreditBalance(30);
        //card2.setTicketBalance(30);
        // game1.palyGame(card2);
        //game2.palyGame(card1);
        //game2.palyGame(card2);
        //System.out.println("The tickets won in game2: "+game2.getTicketWon());
        // System.out.println("Games played by Card ID: "+card2.getCardId());
        //System.out.println("Credit balance left: "+ card2.getCreditBalance());
        // System.out.println("Ticket balance: "+ card2.getTicketBalance());
        //terminal1.addCredits(card2, 40); // add 80 credits with $40 into card2 
        // terminal1.checkCardBalance(card2);
        //terminal1.transferCredits(card1, card2); //transfer credits from card 1 to card 2
        // terminal1.transferTickets(card1, card2); //transfer tickets from card 1 to card 2
        //request prizes with card1 or card2
        // terminal1.requestPrize("Glasses", card2);//request Glasses prize with card 2
        //System.out.println("The ticket balance left in card2 is: "+card2.getTicketBalance());
    }

}
