// library type xie
import java.util.Scanner;
import java.util.Random; // Added the randomizer tool

public class Main {
    public static void main(String[] args) {
        // STEP 2: Create the machines
        Scanner input = new Scanner(System.in);
        Random dice = new Random(); // This is our "chance" machine

        // --- PHASE 1: PROGRAM entry it seems ---
        System.out.println(">> SYSTEM_OVERRIDE: NEON PROTOCOL");
        System.out.println(">> INITIALIZING INTERACTIVE NEURAL LINK...");
        System.out.println("-------------------------------------------");

        // --- PHASE 3: INTERACTIVE input and shi ---
        System.out.print("ENTER PILOT NAME: ");
        String playerName = input.nextLine(); 

        // --- PHASE 2: DATA modelling stuff ---
        int playerHealth = 100;
        double techCredits = 500.00;

        // --- OUTPUT: the result ---
        System.out.println("\n>> ACCESS GRANTED.");
        System.out.println("WELCOME, " + playerName.toUpperCase());
        System.out.println("Health: " + playerHealth + "%");
        System.out.println("ACCOUNT BALANCE: $" + techCredits);
        System.out.println("-------------------------------------------");

        // --- PHASE 4 & 5: LOGIC GATES and MATH ---
        System.out.println("You find a glowing data-pad in the shadows.");
        System.out.println("Do you want to (1) HACK it or (2) LEAVE it?");
        System.out.println("(like dawg choose its not that deep)");
        System.out.print("SELECT OPTION: ");
        
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("\n>> HACKING INITIALIZED...");
            
            // Generate a random number: 0 or 1
            int chance = dice.nextInt(2); 

            if (chance == 0) {
                // LOSS SCENARIO
                System.out.println(">> ! ERROR ! Security ICE detected.");
                playerHealth = playerHealth - 20; 
                techCredits = techCredits - 50.00;
                System.out.println(">> Result: Feedback caused 20% damage and $50 loss.");
            } else {
                // WIN SCENARIO random ahh
                System.out.println(">> ! SUCCESS ! Firewall bypassed.");
                playerHealth = playerHealth + 10; // Health boost!
                techCredits = techCredits + 200.00; // Big money!
                System.out.println(">> Result: Found $200 and a Med-Kit (+10% Health)!");
            }
            
        } else if (choice == 2) {
            System.out.println("\n>> You walk away. Safety is a rare luxury.");
        } else {
            System.out.println("\n>> INVALID INPUT. System glitch detected.");
        }

        // --- FINAL sum shi
        System.out.println("-------------------------------------------");
        System.out.println("FINAL HEALTH: " + playerHealth + "%");
        System.out.println("FINAL BALANCE: $" + techCredits);
        
        input.close();
    }
}
