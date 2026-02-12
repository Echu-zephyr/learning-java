// library type xie
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // STEP 2: Create the Scanner "machine" to listen to the keyboard
        Scanner input = new Scanner(System.in);

        // --- PHASE 1: PROGRAM entry it seems ---
        System.out.println(">> SYSTEM_OVERRIDE: NEON PROTOCOL");
        System.out.println(">> INITIALIZING INTERACTIVE NEURAL LINK...");
        System.out.println("-------------------------------------------");

        // --- PHASE 3: INTERACTIVE input and shi ---
        // We ask the user for their name BEFORE we display stats
        System.out.print("ENTER PILOT NAME: ");
        String playerName = input.nextLine(); 

        // --- PHASE 2: DATA modelling stuff ---
        // These are the "boxes" storing your character's state
        int playerHealth = 100;
        double techCredits = 500.00;

        // --- OUTPUT: the result ---
        System.out.println("\n>> ACCESS GRANTED.");
        System.out.println("WELCOME, " + playerName.toUpperCase());
        System.out.println("Health: " + playerHealth + "%");
        System.out.println("ACCOUNT BALANCE: $" + techCredits);
        System.out.println("-------------------------------------------");

        // --- PHASE 4: LOGIC GATES (The Choice) ---
        System.out.println("You find a glowing data-pad in the shadows.");
        System.out.println("Do you want to (1) HACK it or (2) LEAVE it?");
        System.out.println("(like dawg choose its not that deep)");
        System.out.print("SELECT OPTION: ");
        
        int choice = input.nextInt();

        if (choice == 1) {
            System.out.println("\n>> HACKING INITIALIZED...");
            System.out.println(">> SUCCESS. You found 150 Credits!");
            // Update the money box
            techCredits = techCredits + 150;
        } else if (choice == 2) {
            System.out.println("\n>> You walk away. Safety is a rare luxury.");
            System.out.println(">> No risks taken, no rewards gained.");
        } else {
            System.out.println("\n>> INVALID INPUT. System glitch detected.");
        }

        // Final Status Update
        System.out.println("-------------------------------------------");
        System.out.println("FINAL BALANCE: $" + techCredits);
        
        // STEP 4: Close the scanner to save computer memory
        input.close();
    }
}
