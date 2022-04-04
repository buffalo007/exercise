package vendingmachine;

import java.util.Arrays;

public enum Coin {

    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);
    private int denomination;

    Coin(int denomination) {
        this.denomination = denomination;
    }

    public int getDenomination() {
        return denomination;
    }

    @Override
    public String toString() {
        return "{" +
                  denomination +
                '}' ;
    }
}
