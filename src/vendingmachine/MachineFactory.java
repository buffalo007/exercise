package vendingmachine;

public class MachineFactory {

    public static void create(VendingMachine vendingMachine) {
        new VendingMachineImpl();
    }
}
