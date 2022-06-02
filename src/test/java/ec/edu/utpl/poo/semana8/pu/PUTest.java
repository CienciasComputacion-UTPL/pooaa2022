package ec.edu.utpl.poo.semana8.pu;

import ec.edu.utpl.poo.semana8.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PUTest {

    @org.junit.jupiter.api.Test
    void checkScoreUsingQuestions() {
        Test t1 = new Test("POO - Parcial 2");
        assertEquals("POO - Parcial 2", t1.getTitle());
    }
}
