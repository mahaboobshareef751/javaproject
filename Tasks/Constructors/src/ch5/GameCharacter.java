package ch5;

public class GameCharacter {
	private String name;
    private String type;
    private int health;


    public GameCharacter(String newName, String newType, int newCurHealth){
        name = newName;
        type = newType;
        health = newCurHealth;
    }

    public String changeHealth (int change){
        // Adding positive number will increase health.
        // Adding negative number will decrease health.
        health += change;
        if (health > 0){
            return "Your character now has " + health + " health.";
        } else {
            return "Your character is dead.";
        }
    }

    public static void main(String[] args){
        GameCharacter Mario = new GameCharacter ("Mario", "Hero", 100);
        GameCharacter Luigi = new GameCharacter ("Luigi", "Sidekick", 100);
        GameCharacter Bowser = new GameCharacter ("Bowser", "Villain", 100);
    }
}
