package day04;

public class Passenger {
    private String name;
    private String ticketID;
    private int numberOfBaggage;

    public Passenger(String name, String ticketID, int numberOfBaggage) {
        this.name = name;
        this.ticketID = ticketID;
        this.numberOfBaggage = numberOfBaggage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTicketID() {
        return ticketID;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public int getNumberOfBaggage() {
        return numberOfBaggage;
    }

    public void setNumberOfBaggage(int numberOfBaggage) {
        this.numberOfBaggage = numberOfBaggage;
    }
}
