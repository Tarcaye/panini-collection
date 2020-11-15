package fr.tarcaye.panini;

public class PositiveNumber {
    private final int value;

    private PositiveNumber(int value) {
        this.value = value;
    }

    public static PositiveNumber of(int value) {
        if (value < 1)
            throw new IllegalArgumentException(value + " is not a positive number.");
        return new PositiveNumber(value);
    }

    public int asInt() {
        return value;
    }
}
