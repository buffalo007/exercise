package enumclass;

public class Main {

    public static void main(String[] args) {

        Level medium = Level.MEDIUM;
        System.out.println(medium.getEnumValue());

        Machine machine = new Machine();
        System.out.println(machine.getCoinInventory().toString());

        System.out.println(machine.getItemInventory().toString());
        machine.getItemInventory().getInventory().put(ItemWithPrice.COKE, 10);


        System.out.println(machine.getItemInventory().getInventory().get(ItemWithPrice.COKE));
    }
}
