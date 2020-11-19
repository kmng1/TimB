package sec7.composition;

/**
 * Created by dev on 16/07/15.
 */
public class PC {
    private sec7.composition.Case theCase;
    private Monitor monitor;
    private sec7.composition.Motherboard motherboard;

    public PC(sec7.composition.Case theCase, Monitor monitor, sec7.composition.Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo() {
        // Fancy graphics
        monitor.drawPixelAt(1200, 50, "yellow");
    }
}
