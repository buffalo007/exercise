package enumclass;

import java.util.HashMap;

public class Inventory<T>{
    private HashMap<T, Integer> inventory = new HashMap<>();


    public void add(T item){
        int count = inventory.get(item);
        inventory.put(item, count+1);
    }

    public void put(T item, int numberOfItem){
        inventory.put(item, numberOfItem);
    }

    @Override
    public String toString() {
        return "Inventory{" +
                 inventory +
                '}';
    }

    public HashMap<T, Integer> getInventory() {
        return inventory;
    }

    public void setInventory(HashMap<T, Integer> inventory) {
        this.inventory = inventory;
    }
}
