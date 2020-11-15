package fr.tarcaye.panini;

public class Album {
    private final String collectionName;
    private final PositiveNumber stickersSize;
    private final PositiveNumber cardsSize;

    public Album(String collectionName, PositiveNumber positiveNumber, PositiveNumber positiveNumber1) {
        this.collectionName = collectionName;
        stickersSize = positiveNumber;
        cardsSize = positiveNumber1;
    }
}
