public class Character {
    public String characterName;
    public int level;
    public int healthPoints;
    public int manaPoints;

    Character() { // Non Parameterized Constructor for initializing the default values of the attributes or the character info.
        characterName = "Default Character";
        level = 0;
        healthPoints = 100;
        manaPoints = 200;
    }

    Character(String characterName, int level, int healthPoints, int manaPoints) { // Parameterized Constructor
        this.characterName = characterName;
        this.level = level;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
    }

    public void get_CharacterName() {
        System.out.println(" Character Initialized : " + characterName);
    }

    public void damageTarget(Character enemyCharacter, int damagePoints) {
        enemyCharacter.healthPoints -= damagePoints;
        System.out.println(" ----------------------------------------------------------- \n");

        if (enemyCharacter.healthPoints <= 0)
            System.out.println(" \t --> Character " + enemyCharacter.characterName + " is now DEFEATED.\n");

    }

    public void display_Details() {
        System.out.println(" =============> Enemy Character Left <=============");
        System.out.println(" Character Name  : " + characterName);
        System.out.println(" Health Points   : " + healthPoints);
        System.out.println(" Mana Points     : " + manaPoints + "\n");
    }

    public void winner_LevelUp() {
        System.out.println(" \t --> Congratulations!!! \"" + characterName +
                "\" you WON \n\t\t\tthe Battle, Level Increased by 10.\n");
        level += 10;
    }
}