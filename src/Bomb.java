/**
 * Created by jenniferbowers on 7/24/17.
 */
public class Bomb extends Soldier implements BombFighting{
    public Bomb(String name, String rank, int serialNumber) {
        super(name, rank, serialNumber);
    }

    public String speak() {
        System.out.println("Oh no");
        return "Oh no";
    }

    public String shoot() {
        return "POW!";
    }

    @Override
    public String toString() {
        return "Bomb{" +
                "name='" + this.name + '\'' +
                ", rank='" + this.rank + '\'' +
                ", serialNumber=" + this.serialNumber +
                '}';
    }

    @Override
    public Bomb makeBomb() {
        System.out.println("KABOOM!");
        return null;
    }
}
