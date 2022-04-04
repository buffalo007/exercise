package vendingmachine;

import java.util.HashMap;

public class Inventory <T>{
    private HashMap<T, Integer> inventory = new HashMap<>();



    public void add(T item){
        Integer inventoryItemCount = inventory.get(item);
        inventory.put(item, inventoryItemCount == null ? 1 : inventoryItemCount + 1);
    }

    public void put (T item, int numberOfItem){
        inventory.put(item, numberOfItem);
    }

    public HashMap<T, Integer> getInventory() {
        return inventory;
    }

    public int getQuantity(T item){
        Integer numberOfItem = inventory.get(item);
        return numberOfItem == null ? 0 : numberOfItem ;
    }

    public void clear(){
        inventory.clear();
    }



    public boolean hasItem(T item) {
        return getQuantity(item) > 0;
    }


}
