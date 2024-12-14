public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setDefenseType("Physical");

        System.out.println("Boss:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());

        Hero[] heroes = createHeroes();

        System.out.println("\nHeroes Info:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() + ", Damage: " + hero.getDamage() +
                    (hero.getSuperPower() != null ? ", Super Power: " + hero.getSuperPower() : ", Super Power: None"));
        }
    }
    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(300, 30, "Fireball");
        Hero hero2 = new Hero(400, 40, "Healing");
        Hero hero3 = new Hero(250, 25);

        return new Hero[]{hero1, hero2, hero3};
    }
}