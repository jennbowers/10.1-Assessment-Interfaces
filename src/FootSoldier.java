/**
 * Created by jenniferbowers on 7/24/17.
 */
public class FootSoldier extends Soldier implements GunFighting{
    public FootSoldier(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public String speak() {
        System.out.println("Forward March!");
        return "Forward March!";
    }

    public String shoot() {
        System.out.println("POW!");
        return "POW!";
    }
}
