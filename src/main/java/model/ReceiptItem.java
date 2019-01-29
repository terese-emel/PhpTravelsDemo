package model;

public class ReceiptItem {
    private String name;
    private String amount;
    private String price;

    public ReceiptItem(String name, String amount, String price) {
        this.name = name;
        this.amount = amount;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAmount() {
        return amount;
    }

    public String getPrice() {
        return price;
    }
}

