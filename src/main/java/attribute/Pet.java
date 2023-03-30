package attribute;
import java.util.Scanner;
import lombok.*;

@Getter
public enum Pet{
    OWL ("Owl"),
    RAT ("Rat"),
    CAT ("Cat"),
    TOAD ("Toad");

    private String name;
    Pet(String name){
        this.name = name;
    }

    public static Pet choosePet() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your pet:");
        int i = 1;
        for (Pet pet : Pet.values()) {
            System.out.println(i + ". " + pet.getName());
            i++;
        }
        int choix = scanner.nextInt();
        return Pet.values()[choix - 1];
    }
}
