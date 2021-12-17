package Model;

public class Contexte {
    private strategieCalculDistance strat;

    public void compare(String fStr, String sdStr) {
        this.strat.calculDistance(fStr, sdStr);
    }

    public void changerStrat(strategieCalculDistance strat) {
        this.strat = strat;
    }

    public strategieCalculDistance returnStrat() {
        return this.strat;
    }

}
