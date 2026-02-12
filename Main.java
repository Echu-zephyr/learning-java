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
        int maxHealth = 100; // New: To allow health buffs
        double techCredits = 500.00;
        int level = 1;
        int successfulHacks = 0;
        
        boolean isRunning = true; 

        System.out.println("\n>> WELCOME TO THE UNDERCITY, " + playerName.toUpperCase());

        while (isRunning) {
            System.out.println("\n--- [LEVEL " + level + "] | HP: " + playerHealth + "/" + maxHealth + " | WALLET: $" + techCredits + " ---");
            System.out.println("1. ATTEMPT HACK (Higher Level = Higher Risk)");
            System.out.println("2. NEON MERCHANT");
            System.out.println("3. LOG OUT");
            System.out.print("ACTION: ");
            
            int choice = input.nextInt();

            if (choice == 1) {
                // DIFFICULTY SCALING: Higher level makes winning harder
                // Level 1: 0 or 1 (50%). Level 5: 0, 1, 2, 3, 4, 5 (16% chance)
                int difficulty = dice.nextInt(level + 1); 
                
                if (difficulty != 0) { // If you don't roll a 0, you fail
                    int damage = 20 + (level * 5); // Damage increases with level
                    System.out.println(">> ! ALERT ! Security tightened. -" + damage + " HP");
                    playerHealth -= damage;
                } else {
                    double reward = 200 * level; // Reward multiplies with level
                    System.out.println(">> ! SUCCESS ! Data extracted. +$" + reward);
                    techCredits += reward;
                    successfulHacks++;
                    
                    if (successfulHacks >= 3) {
                        level++;
                        successfulHacks = 0;
                        maxHealth += 20; // Leveling up gives you more total health!
                        playerHealth = maxHealth; 
                        System.out.println(">> LEVEL UP! Max HP increased to " + maxHealth);
                    }
                }
            } else if (choice == 2) {
                // ADVANCED SHOP
                System.out.println("\n--- MERCHANT ---");
                System.out.println("1. Small Med-Kit ($150) -> +30 HP");
                System.out.println("2. Armor Plating ($500) -> +50 MAX HP");
                System.out.println("3. Exit Shop");
                int shopChoice = input.nextInt();

                if (shopChoice == 1 && techCredits >= 150) {
                    techCredits -= 150;
                    playerHealth = Math.min(playerHealth + 30, maxHealth);
                    System.out.println(">> Healed.");
                } else if (shopChoice == 2 && techCredits >= 500) {
                    techCredits -= 500;
                    maxHealth += 50;
                    playerHealth += 50;
                    System.out.println(">> Armor upgraded.");
                }
            } else if (choice == 3) {
                isRunning = false;
            }

            if (playerHealth <= 0) {
                System.out.println("\n>> FLATLINED. Final Level: " + level);
                isRunning = false;
            }
        }
        input.close();
    }
}
