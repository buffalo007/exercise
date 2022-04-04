package enumclass;

public enum Level {
    LOW (1),
    MEDIUM(5),
    HIGH (10);
    private int enumValue;

    Level(int enumValue) {
        this.enumValue = enumValue;
    }

    public int getEnumValue() {
        return enumValue;
    }

    public void setEnumValue(int enumValue) {
        this.enumValue = enumValue;
    }
}
