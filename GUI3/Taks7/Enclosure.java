import java.util.List;
import java.util.ArrayList;

public class Enclosure <T extends AAnimal> {
    
    private List<AAnimal> animalList = new ArrayList<>();

    public void addAnimalToEnclosure(AAnimal animal)
    {
        animalList.add(animal);
    }

    public List<AAnimal> getEnclosure()
    {
        return animalList;
    }

}
