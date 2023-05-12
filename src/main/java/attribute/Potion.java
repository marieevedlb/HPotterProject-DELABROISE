package attribute;
import organisation.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class Potion {
    private final String name;
    private int healingPower;

    public void use(Wizard wizard) {
        //
    }

    @Override
    public String toString() {
        return name;
    }

}