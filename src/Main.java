
public class Main {

    public static void main(String[] args) {
        CalvarySoldier newCalvarySoldier = new CalvarySoldier("Bob", "General", 123456);
        newCalvarySoldier.speak();
        newCalvarySoldier.kick();
        newCalvarySoldier.trample();
        newCalvarySoldier.shoot();

        FootSoldier newFootSoldier = new FootSoldier("Jim", "Corporal", 789012);
        newFootSoldier.speak();
        newFootSoldier.shoot();

        Bomb newBombFighter = new Bomb("New Guy", "Bomber", 1234567);
        newBombFighter.makeBomb();
        System.out.println(newBombFighter.toString());


    }
}
