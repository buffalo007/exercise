package enumclass;

public enum ItemWithPrice {

    COKE("Coke", 25), PEPSI ("PEPSI",30);
    private String itemName;
    private int itemPrice;

    ItemWithPrice(String itemName, int itemPrice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }

    @Override
    public String toString() {
        return "{" +
                "Name='" + itemName + '\'' +
                ",Price=" + itemPrice +
                '}';
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }
}
