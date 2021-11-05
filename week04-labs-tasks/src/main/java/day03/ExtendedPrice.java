package day03;

public class ExtendedPrice {
    private double price;
    private int date;
    private Extremities extremity=null;

    public ExtendedPrice(double price, int date, Extremities extremity) {
        this.price = price;
        this.date = date;
        this.extremity = extremity;
    }

    public double getPrice() {
        return price;
    }

    public int getDate() {
        return date;
    }

    public Extremities getExtremity() {
        return extremity;
    }

    public void setExtremity(Extremities extremity) {
        this.extremity = extremity;
    }

    @Override
    public String toString() {
        return "ExtendedPrice{" +
                "price=" + price +
                ", date=" + date +
                ", extremity=" + extremity +
                '}';
    }
}
