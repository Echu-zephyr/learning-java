// library type xie
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // STEP 2: Create the Scanner "machine" to listen to the keyboard
        Scanner input = new Scanner(System.in);

        // --- PHASE 1: PROGRAM entry it seems
        System.out.println(">> SYSTEM_OVERRIDE: NEON PROTOCOL");
        System.out.println(">> INITIALIZING INTERACTIVE NEURAL LINK...");
        System.out.println("-------------------------------------------");

        // --- PHASE 3: INTERACTIVE input and shi
        // We ask the user for their name BEFORE we display stats
        System.out.print("ENTER PILOT NAME: ");
        String playerName = input.nextLine(); 

        // --- PHASE 2: DATA modelling stuff
        // These are the "boxes" storing your character's state
        int playerHealth = 100;
        double techCredits = 500.00;

        // --- OUTPUT:  the result 
        System.out.println("\n>> ACCESS GRANTED.");
        System.out.println("WELCOME, " + playerName.toUpperCase());
        System.out.println("Health: " + playerHealth + "%");
        System.out.println("ACCOUNT BALANCE: $" + techCredits);
        
        // STEP 4: Close the scanner to save computer memory
        input.close();
    }
}
