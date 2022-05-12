public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(" ===================| WIZARD VS WARLOCK |=================== \n");
        Wizard DoctorStrange = new Wizard("DoctorStrange", 78, 280, 180);
        Warlock Hulk = new Warlock("Hulk", 68, 550, 90);

        DoctorStrange.display_WizardDetails(); // Introducing the Characters created.
        Hulk.display_WarlockDetails();

        /**
         *      START OF THE SEQUENCE.  
         */
        Hulk.Shockwave(DoctorStrange); // Hulk started attacking Doctor Strange. Doctor Strange HP Deducted.
        DoctorStrange.display_Details();
        Hulk.display_Details();

        DoctorStrange.Energy_Blasts(Hulk); // Doctor Strange attacks Hulk.
        DoctorStrange.display_Details();
        Hulk.display_Details();

        DoctorStrange.Healing_TimeManipulation(); // Doctor Strange used Recover Spell. HP & Mana Increased.
        DoctorStrange.display_Details();
        Hulk.display_Details();

        Hulk.Smash(DoctorStrange); // Hulk attacks Doctor Strange. Doctor Strange HP Deducted.
        DoctorStrange.display_Details();
        Hulk.display_Details();

        DoctorStrange.Mystic_Bolts(Hulk); // Doctor Strange attacks Hulk. Hulk HP Deducted.
        DoctorStrange.display_Details();
        Hulk.display_Details();

        Hulk.Shockwave(DoctorStrange); // Hulk attacks Doctor Strange. Doctor Strange HP Deducted and WON the battle.
        DoctorStrange.display_Details();
        Hulk.display_Details();

        Hulk.winner_LevelUp(); // Hulk WON the Battle; therefore, he level up by 10.
        Hulk.display_WarlockDetails();
        /**
         *      END OF THE SEQUENCE.  
         */
    }
}