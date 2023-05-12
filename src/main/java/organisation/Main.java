package organisation;
import attribute.*;
import character.*;
import organisation.Level;
import spell.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        // L'utilisateur doit donner son nom
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nHello! Welcome to Hogwarts, the wizard's school. Your goal is to become a wizard by achieving some challenges during your education.\n" + "\nAre you ready?\n" + "\nEnter your name in order to begin your education:\n");
        String name = scanner.nextLine();

       // Choix d'une baguette magique:

        System.out.println("Choose your wand's core : ");
        System.out.println("1. Phoenix Feather");
        System.out.println("2. Unicorn hair");
        System.out.println("3. Dragon heartstring");

        int choice = 0;

        while (choice < 1 || choice > 3) {
            System.out.print("Enter your choice (1-3): ");
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input");
                scanner.next();
            }
        }

        Core core = null;

        switch (choice) {
            case 1:
                core = Core.PHOENIX_FEATHER;
                break;
            case 2:
                core = Core.UNICORN_HAIR;
                break;
            case 3:
                core = Core.DRAGON_HEARTSTRING;
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }


        // Choix de la longeur de la baguette magique
        System.out.println("\nChoose your wand's size in cm :");
        int size = scanner.nextInt();
        scanner.nextLine();

        // Choix d'un animal de compagnie:
        System.out.println("Choose your pet : ");
        System.out.println("1. Owl");
        System.out.println("2. Rat");
        System.out.println("3. Cat");
        System.out.println("4. Toad");

        int choicepet = 0;

        while (choicepet < 1 || choicepet > 4) {
            System.out.print("Enter your choice (1-4): ");
            if (scanner.hasNextInt()) {
                choicepet = scanner.nextInt();
            } else {
                System.out.println("Invalid input");
                scanner.next();
            }
        }

        Pet pet = null;

        switch (choicepet) {
            case 1:
                pet = Pet.OWL;
                break;
            case 2:
                pet = Pet.RAT;
                break;
            case 3:
                pet = Pet.CAT;
                break;
            case 4:
                pet = Pet.TOAD;
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }

        // Créer un sorcier
        Wizard wizard = new Wizard(name, pet, new Wand(size, core), null,
                new ArrayList<>(), 100, 100, 0.2, 1);

        // Le Sorting Hat assigne une maison au hasard
        SortingHat sortingHat = new SortingHat();
        sortingHat.assignHouse(wizard);

        //Liste de potions
        Potion potion = new Potion("Precisium", 15);
        List<Potion> potions = potion.getPotions();

        // Ajouter le premier sort dès la création du sorcier
       /* wizard.learnSpell(Spell.getSpells().get(0));*/


        System.out.println("Congrats " + wizard.getName() + ", you are ready to begin your education at Hogwarts in " + wizard.getHouse().getName() + " house.\n" +
                "Your wand's core is " + wizard.getWand().getCore().getName() +
                " and its size is " + wizard.getWand().getSize() + " cm.\n" +
                "You have a " + wizard.getPet().getName() + " as a pet." + "\nTo start, you have " + wizard.getCurrenthealth() + " HP.\n");

        List<Level> levels = new ArrayList<>();



        System.out.println("Congratulations! You achieve your education at Hogwarts. You are now a true wizard !");


    }
}










