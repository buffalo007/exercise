package enumclass;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal> animals = new ArrayList<>();

    public void add(Animal animal){
        animals.add(animal);
    }
}
