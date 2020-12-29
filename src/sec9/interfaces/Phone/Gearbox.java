package sec9.interfaces.Phone;

/**
 * Created by dev on 27/09/15.
 */
public class Gearbox {

    private boolean clutchIsIn;

    public void operateClutch(boolean inOrOut) {
        this.clutchIsIn = inOrOut;
    }
}
