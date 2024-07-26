public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {new Magic(600, 99, "Zero"),
                new Medic(500, 2000, "Heal", 70), new Warrior(900, 30, "Hear")};
        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }
}