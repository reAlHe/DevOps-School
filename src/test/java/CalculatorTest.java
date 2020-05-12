import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    private Calculator underTest = new Calculator();

    @Test
    void addsCorrectly() {
        assertThat(underTest.add(1,2)).isEqualTo(3);
    }
}