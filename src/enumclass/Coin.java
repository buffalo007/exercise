package enumclass;

public enum Coin {
    EURO(1),
    CENT (2);


    private int value;

    Coin(int value) {
        this.value = value;
    }
}
