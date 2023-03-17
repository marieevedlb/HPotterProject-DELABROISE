package attribute;
import java.util.Random;

public enum House {
    GRYFFINDOR,
    HUFFLEPUFF,
    RAVENCLAW,
    SLYTHERIN;

    public static House assignHouseRandomly(){
        Random random = new Random();
        int index = random.nextInt(House.values().length);
        return House.values()[index];
    }
}

