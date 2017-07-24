package soldiers.Classes;

import soldiers.AbstractClasses.Soldier;
import soldiers.Interfaces.HorsebackFighting;

/**
 * Created by jenniferbowers on 7/24/17.
 */
public class CalvarySoldier extends Soldier implements HorsebackFighting {

    public String speak() {
        System.out.println("Giddyup!");
      return "Giddyup!";
    }

    public String trample() {
        System.out.println("crunncchh");
        return "crunncchh";
    }

    public String kick() {
        System.out.println("kick");
        return "kick";
    }
}
