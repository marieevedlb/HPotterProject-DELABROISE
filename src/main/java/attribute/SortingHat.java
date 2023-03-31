package attribute;
import organisation.Wizard;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

import lombok.*;
@Getter @Setter
public class SortingHat {
        private List<House> house;

        public SortingHat() {
            house = new ArrayList<>();
            house.add(new House("Gryffondor"));
            house.add(new House("Hufflepuff"));
            house.add(new House("Ravenclaw"));
            house.add(new House("Slytherin"));
        }


        public void assignHouse(Wizard wizard) {
            Random random = new Random();
            int index = random.nextInt(house.size());
            House randomHouse = house.get(index);
            wizard.setHouse(randomHouse);
        }
}


