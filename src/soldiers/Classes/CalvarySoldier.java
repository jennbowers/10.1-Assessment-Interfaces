package soldiers.Classes;

import soldiers.AbstractClasses.Soldier;

/**
 * Created by jenniferbowers on 7/24/17.
 */
public class CalvarySoldier extends Soldier {

    @Override
    public String speak() {
        System.out.println("Giddyup!");
      return "Giddyup!";
    }
}
