public class Warlock extends Character { // This is the Warlock class that enherits by using 'extends' to the Character Class.

    Warlock(String name, int level, int healthPoints, int manaPoints) {
        super(name, level, healthPoints, manaPoints);
    }

    public void display_WarlockDetails() {
        System.out.println(" ================| Warlock Full Details |================");
        get_CharacterName(); // using or Calling the get_CharacterName() method from the Character class to print out the Character name with its details.
        System.out.println(" Level                 : " + super.level);
        System.out.println(" Health Points         : " + super.healthPoints);
        System.out.println(" Mana Points           : " + super.manaPoints + "\n\n");
    }

    public void Shockwave(Character enemy) { // Damage Spell (1)
        int damagePoints = 75;
        super.manaPoints -= 30;
        System.out.println(" -----------------------------------------------------------");
        System.out.println(" -> " + super.characterName +
                " ATTACKS " + enemy.characterName + " with Shockwave \n\t (Damage - 75) (Mana - 30)");
        damageTarget(enemy, damagePoints);
    }

    public void Smash(Character enemy) { // Damage Spell (2)
        int damagePoints = 150;
        super.manaPoints -= 30;
        System.out.println(" -----------------------------------------------------------");
        System.out.println(" -> " + super.characterName +
                " ATTACKS " + enemy.characterName + " with Smash \n\t (Damage - 150) (Mana - 30)");
        damageTarget(enemy, damagePoints);
    }

    public void Health_Regeneration() { // Recovery Spell
        super.healthPoints += 40;
        super.manaPoints += 20;
        System.out.println(" -----------------------------------------------------------");
        System.out.println(" " + super.characterName +
                " used Recovery Spell \n\t (Health Points + 40) (Mana Points + 20)");
        System.out.println(" ----------------------------------------------------------- \n");
    }
}