package fr.tarcaye.panini;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CollectionTest {

    @Test
    void a_panini_collector_should_see_his_empty_collection() {
        assertThat("").isEqualTo("Votre collection est vide.");
    }
}
