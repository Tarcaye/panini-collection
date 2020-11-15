package fr.tarcaye.panini;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class PositiveNumberTest {

    @Test
    void fail_to_create_a_positive_number_with_negative_value() {
        assertThatThrownBy(()-> PositiveNumber.of(-2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("-2 is not a positive number.");
    }

    @Test
    void zero_is_not_a_positive_number() {
        assertThatThrownBy(()-> PositiveNumber.of(0))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0 is not a positive number.");
    }
}
