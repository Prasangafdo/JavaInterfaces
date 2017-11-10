/**
 * Created by Prasanga Fernando on 11/10/2017.
 */
public class Main {
    public static void main(String[] args) {

        Vehicle EcoBoost = new Mustang();
        Vehicle STI = new WRX();

        EcoBoost.accelerate();
        STI.accelerate();

        EcoBoost.brake();
        STI.burnout();

        EcoBoost.accelerate();
        STI.brake();
        EcoBoost.burnout();

        EcoBoost.brake();

    }
}
