package Model;

public class Context {
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
