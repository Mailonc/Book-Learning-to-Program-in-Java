package inheritance;

public class Invoice implements Payable {

    private final String  partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;


    public Invoice(String partNumber, String partDescription, Integer quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public String getPartNumber() {
        return partNumber;
    }


    public String getPartDescription() {
        return partDescription;
    }


    public int getQuantity() {
        return quantity;
    }


    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        this.pricePerItem = pricePerItem;
    }

    @Override
    public double calculatePayment() {
        return getQuantity() * getPricePerItem();
    }
}
