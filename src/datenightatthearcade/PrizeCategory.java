package datenightatthearcade;

public class PrizeCategory {

    private String name;
    private int requiredTickets;
    private int numbers;

    public PrizeCategory(String items, int req, int numbers) {
        this.name = items;
        this.requiredTickets = req;
        this.numbers = numbers;
    }

    public String getItemName() {
        return name;
    }

    public int getRequiredTickets() {
        return requiredTickets;
    }

    public int getNumbers() {
        return numbers;
    }

    public void consumeItem() {
        numbers--;
    }

}
