/**
 * Created by jenniferbowers on 7/24/17.
 */
public abstract class Soldier {
    protected String name;
    protected String rank;
    protected int serialNumber;

    public String sleep() {
        return "snore";
    }

    public String eat() {
        return "chew";
    }

    public String walk() {
        return "trudge";
    }

    public abstract void speak();
}
