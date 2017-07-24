package soldiers.Classes;

import soldiers.AbstractClasses.Soldier;
import soldiers.Interfaces.GunFighting;

/**
 * Created by jenniferbowers on 7/24/17.
 */
public class FootSoldier extends Soldier implements GunFighting{

    public String speak() {
        System.out.println("Forward March!");
        return "Forward March!";
    }

    public String shoot() {
        System.out.println("POW!");
        return "POW!";
    }
}
