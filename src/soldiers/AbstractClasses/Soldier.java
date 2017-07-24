package soldiers.AbstractClasses;

/**
 * Created by jenniferbowers on 7/24/17.
 */
public abstract class Soldier {
    protected String name;
    protected String rank;
    protected int serialNumber;

    public String sleep() {
        System.out.println("snore");
        return "snore";
    }

    public String eat() {
        System.out.println("chew");
        return "chew";
    }

    public String walk() {
        System.out.println("trudge");
        return "trudge";
    }

    public abstract String speak();
}
