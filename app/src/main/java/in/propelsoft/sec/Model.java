package in.propelsoft.sec;

/**
 * Created by suvindran on 11-Oct-17.
 */

public class Model {
    public String getText() {
        return text;
    }

    public String getGift() {
        return gift;
    }

    String text;
    String gift;

    public Model(String text, String gift) {
        this.text = text;
        this.gift = gift;
    }


}
