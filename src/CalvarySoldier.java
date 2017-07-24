/**
 * Created by jenniferbowers on 7/24/17.
 */
public class CalvarySoldier extends Soldier implements HorsebackFighting, GunFighting {

    public CalvarySoldier(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

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

    public String shoot() {
        System.out.println("POW!");
        return "POW!";
    }
}
