public class Wizard extends Character { // This is the Wizard class that enherits by using 'extends' to the Character Class.

    Wizard(String name, int level, int healthPoints, int manaPoints) {
        super(name, level, healthPoints, manaPoints);
    }

    public void display_WizardDetails() {
        System.out.println(" ================| Wizard Full Details |================");
        get_CharacterName(); // using or Calling the get_CharacterName() method from the Character class to print out the Character name with its details.
        System.out.println(" Level                 : " + super.level);
        System.out.println(" Health Points         : " + super.healthPoints);
        System.out.println(" Mana Points           : " + super.manaPoints + "\n");
    }

    public void Energy_Blasts(Character enemy) { // Damage Spell (1)
        int damagePoints = 75;
        super.manaPoints -= 25;
        System.out.println(" -----------------------------------------------------------");
        System.out.println(" -> " + super.characterName +
                " ATTACKS " + enemy.characterName + " with Energy Blasts \n\t (Damage - 75) (Mana - 25)");
        damageTarget(enemy, damagePoints);
    }

    public void Mystic_Bolts(Character enemy) { // Damage Spell (2)
        int damagePoints = 150;
        super.manaPoints -= 50;
        System.out.println(" -----------------------------------------------------------");
        System.out.println(" -> " + super.characterName +
                " ATTACKS " + enemy.characterName + " with Mystic Bolts \n\t (Damage - 150) (Mana - 50)");
        damageTarget(enemy, damagePoints);
    }

    public void Healing_TimeManipulation() { // Recovery Spell
        super.healthPoints += 20;
        super.manaPoints += 25;
        System.out.println(" -----------------------------------------------------------");
        System.out.println(" -> " + super.characterName +
                " used Recovery Spell \n\t (Health Points + 20) (Mana Points + 25)");
        System.out.println(" ----------------------------------------------------------- \n");
    }
}