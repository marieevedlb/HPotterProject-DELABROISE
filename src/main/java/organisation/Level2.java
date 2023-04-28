package organisation;
import character.*;
import organisation.Level;
import organisation.Wizard;
import spell.*;
import java.util.List;
import lombok.*;
@Getter @Setter

public class Level2 extends Level {
    public Level2 (Wizard wizard) {
        super(2, "The Chamber of Secrets",
                List.of(new Boss("Basilisk", 60, 60, 6, 0.9, 1, 1)),
                wizard);
    }
}