// library type xie
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random dice = new Random();

        // --- SETUP ---
        System.out.println(">> SYSTEM_OVERRIDE: NEON PROTOCOL");
        System.out.println(">> INITIALIZING INTERACTIVE NEURAL LINK...");
        System.out.println("-------------------------------------------");
        System.out.print("ENTER PILOT NAME: ");
        String playerName = input.nextLine(); 

        int playerHealth = 100;
        double techCredits = 500.00;
        int level = 1;
        int successfulHacks = 0;
        
        boolean isRunning = true; 

        System.out.println("\n>> WELCOME TO THE UNDERCITY, " + playerName.toUpperCase());

        while (isRunning) {
            System.out.println("\n--- level: " + level + " | HP: " + playerHealth + "% | WALLET: $" + techCredits + " ---");
            System.out.println("1. HACK Data-pad (Risk/Reward)");
            System.out.println("2. VISIT the 'Neon Merchant' (Shop)");
            System.out.println("3. LOG OUT");
            System.out.print("SELECT OPTION: ");
            
            int choice = input.nextInt();

            if (choice == 1) {
                // HACKING LOGIC
                int chance = dice.nextInt(2); 
                if (chance == 0) {
                    System.out.println(">> ! ERROR ! Security ICE detected. -25 HP");
                    playerHealth -= 15;
                    techCredits -=50;
                } else {
                    System.out.println(">> ! SUCCESS ! Bypassed. +$200");
                    techCredits += 150;
                    playerHealth +=10;
                    successfulHacks++;
                    
                    // LEVEL UP LOGIC
                    if (successfulHacks >= 3) {
                        level++;
                        playerHealth = 100; // Reset health on level up
                        successfulHacks = 0; // Reset counter
                        System.out.println(">> LEVEL UP! Rank " + level + " achieved. Systems Refreshed.");
                    }
                }
            } else if (choice == 2) {
                // THE SHOP
                System.out.println("\n--- NEON MERCHANT ---");
                System.out.println("1. Buy Med-Kit ($150) - Heals 30% ");
                System.out.println("2. Back to Street");
                System.out.print("BUY SOMETHING? ");
                int shopChoice = input.nextInt();

                if (shopChoice == 1 && techCredits >= 150) {
                    techCredits -= 150;
                    playerHealth += 30;
                    if (playerHealth > 100) playerHealth = 100; // Cap health at 100
                    System.out.println(">> Applied Med-Kit. Vital signs stabilized.");
                } else if (shopChoice == 1) {
                    System.out.println(">> Insufficient Credits. Merchant laughs at you.");
                }
            } else if (choice == 3) {
                isRunning = false;
            }

            // GAME OVER CHECK
            if (playerHealth <= 0) {
                System.out.println("\n>> VITAL SIGNS LOST. Game Over.");
                isRunning = false;
            }
        }
        input.close();
    }
}
