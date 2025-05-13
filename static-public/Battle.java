public class Battle {
    static void displayEnemyName() {
        System.out.println("Bonk the Destroyer!");
    }

    static public int enemyHP() {
        return 100;
    }

    public void getReadyMessage() {
        System.out.println("A new fighter has entered the arena");
    }
    public static void main(String[] args) {
        System.out.println("Who will you fight?");
        displayEnemyName();
        enemyHP();

        Battle fight = new Battle();
        fight.enemyHP();
    }
}
