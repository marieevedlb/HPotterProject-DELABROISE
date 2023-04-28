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
        int healAmount = (int) (healingPower * wizard.getPotionEfficiency());
        wizard.heal(healAmount);
    }

    @Override
    public String toString() {
        return name;
    }

}