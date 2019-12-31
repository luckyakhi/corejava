package in.javacomics.streams;

public class Trade {
    private String id;
    private String cusip;
    private InstrumentType instrumentType;
    private int quantity;
    private int price;

    public Trade(String id, String cusip, InstrumentType instrumentType, int quantity, int price) {
        this.id = id;
        this.cusip = cusip;
        this.instrumentType = instrumentType;
        this.quantity = quantity;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getCusip() {
        return cusip;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "id='" + id + '\'' +
                ", cusip='" + cusip + '\'' +
                ", instrumentType=" + instrumentType +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
