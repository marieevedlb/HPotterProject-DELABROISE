package attribute;
import java.util.Scanner;
public enum Pet{
    OWL,
    RAT,
    CAT,
    TOAD,
    DOG;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choisissez un animal de compagnie :");
        for (Pet pet : Pet.values()) {
            System.out.println(pet.name());
        }

        String userInput = scanner.nextLine().toUpperCase();
        Pet chosenPet = null;

        while (chosenPet == null) {
            for (Pet pet : Pet.values()) {
                if (pet.name().equalsIgnoreCase(userInput)) {
                    chosenPet = pet;
                    break;
                }
            }

            if (chosenPet == null) {
                System.out.println("Animal de compagnie invalide. Veuillez réessayer.");
                userInput = scanner.nextLine().toUpperCase();
            }
        }

        System.out.println("Vous avez choisi " + chosenPet.name() + " comme animal de compagnie.");
    }
}
