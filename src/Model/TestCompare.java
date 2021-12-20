package Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class TestCompare {

    private strategieCalculDistance strat;

    @Test
    public void test() {
        String str = "td4 de java";
        String str2 = "td4 de java";
        strategieCalculDistance strat = new Hamming();
        assertEquals(strat.calculDistance(str, str2), 0);
        changerStrat(new Levenshtein());
        assertEquals(strat.calculDistance(str, str2), 0);
    }

    public void changerStrat(strategieCalculDistance strat) {
        this.strat = strat;
    }

}