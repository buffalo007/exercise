package enumclass;

public class Machine {
    Inventory<Coin> coinInventory = new Inventory<>();
    Inventory<ItemWithPrice> itemInventory = new Inventory<>();

    public Machine() {
        initialise();
    }

    private void initialise() {
        for (Coin o : Coin.values()) {
            coinInventory.put(o, 5);
        }

        for (ItemWithPrice itemWithPrice : ItemWithPrice.values() ) {
            itemInventory.put(itemWithPrice, 5);
        }
    }

    public Inventory<Coin> getCoinInventory() {
        return coinInventory;
    }

    public void setCoinInventory(Inventory<Coin> coinInventory) {
        this.coinInventory = coinInventory;
    }

    public Inventory<ItemWithPrice> getItemInventory() {
        return itemInventory;
    }

    public void setItemInventory(Inventory<ItemWithPrice> itemInventory) {
        this.itemInventory = itemInventory;
    }
}
