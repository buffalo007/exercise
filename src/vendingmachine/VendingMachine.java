package vendingmachine;

public interface VendingMachine {
    Inventory<Coin> getCoinInventory();
    Inventory<Item> getItemInventory();
    void printItemInventory();
    void printCoinInventory();
    void addCoin(Coin coin);
    void addItem(Item item);
    long selectItemAndGetPrice(Item item);
}
