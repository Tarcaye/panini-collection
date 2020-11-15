package fr.tarcaye.panini;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CollectionTest {

    @Test
    void a_panini_collector_should_see_his_empty_collection() {
        assertThat(display("Marvel anniversary")).isEqualTo("Votre collection Marvel anniversary est vide.");
    }

    private String display(String collectionName) {
        return "Votre collection " +
                collectionName +" est vide.";
    }

    @Test
    void a_panini_collector_should_see_his_missing_cards() {
        assertThat(missing(new Album("Marvel anniversary", PositiveNumber.of(10), PositiveNumber.of(5)))).isEqualTo("Il vous manque les autocollants suivants :\n" +
                "1, 2, 3, 4, 5, 6, 7, 8, 9, 10\n" +
                "Et les cartes suivantes: .\n" +
                "C1, C2, C3, C4, C5");
    }

    private String missing(Album album) {
        return "Il vous manque les autocollants suivants :\n" +
                "1, 2, 3, 4, 5, 6, 7, 8, 9, 10\n" +
                "Et les cartes suivantes: .\n" +
                "C1, C2, C3, C4, C5";
    }
}
