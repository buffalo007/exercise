package vendingmachine;

import vendingmachine.exeptions.SoldOutException;

import java.util.HashMap;

public class VendingMachineImpl implements VendingMachine {
    Inventory<Coin> coinInventory;
    Inventory<Item> itemInventory;

    public VendingMachineImpl() {
        coinInventory = new Inventory<>();
        itemInventory = new Inventory<>();
    }

    public Inventory<Coin> getCoinInventory() {
        return coinInventory;
    }

    public Inventory<Item> getItemInventory() {
        return itemInventory;
    }

   public void printItemInventory(){

       System.out.println(itemInventory.getInventory());
   }

   public void printCoinInventory(){
       System.out.println(coinInventory.getInventory());
   }

   public void addCoin(Coin coin){
        coinInventory.add(coin);
   }

    @Override
    public void addItem(Item item) {
        itemInventory.add(item);
    }

    @Override
    public long selectItemAndGetPrice(Item item) {
     if (itemInventory.hasItem(item)) return item.getPrice();

        else throw new SoldOutException("Item not available");
    }

    public void printStatus(){

    }
}
