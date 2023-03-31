package attribute;
import java.util.Scanner;
import lombok.*;

@Getter
public enum Pet {
    OWL("Owl"),
    RAT("Rat"),
    CAT("Cat"),
    TOAD("Toad");

    private String name;

    Pet(String name) {
        this.name = name;
    }

}