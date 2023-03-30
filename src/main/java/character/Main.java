package character;
import attribute.*;
import character.*;

import lombok.*;
import lombok.Getter;
import lombok.Setter.*;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args){

        // L'utilisateur doit donner son nom
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nHello! Welcome to Hogwarts, the wizard's school. Your goal is to become a wizard by achieving some challenges during your education.\n" + "\nAre you ready?\n" + "\nEnter your name in order to begin your education:\n");
        String name = scanner.nextLine();

        // Le Sorting Hat assigne une maison au hasard
        SortingHat sortingHat = new SortingHat();
        sortingHat.assignHouse(new Wizard(name, null, null, null));

        // Choix d'une baguette magique:

        System.out.println("Choose your wand's core : ");
        System.out.println("1. Phoenix Feather");
        System.out.println("2. Unicorn hair");
        System.out.println("3. Dragon heartstring");

        int choix = scanner.nextInt();

        Core core = null;

        switch (choix) {
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
                System.out.println("Invalid");
                System.exit(0);
        }

        // Choix de la longeur de la baguette magique
        System.out.println("\nChoose your wand's size");
        int size = scanner.nextInt();
        scanner.nextLine();

        // Choix d'un animal de compagnie:
        System.out.println("\nChoose a pet:");
        Pet pet = Pet.choosePet();

        Wizard wizard = new Wizard(name, null, null, null);
        System.out.println("Congrats," + wizard.getName() + "you are ready to begin your education at Hogwarts.\n" + "You belongs to" + wizard.getHouse().getName() + " house. \n" + "Your wand's core is" + wizard.getWand().getCore().getName() + "core.\n" + "and its size is" + wizard.getWand().getSize() + "cm. \n" + "You have a pet:" +  wizard.getPet().getName());

        // Lancement du jeu:
        /*Level level = Level.createLevel(0);
        level.runLevel(0, wizard);
        printSeparator(100);
         */
    }
}




    /*
    commencer jeu - phrase bonjour
    choisir attributs sorcier
    commencer niveau 1

     */







