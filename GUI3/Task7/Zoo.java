import java.util.List;
import java.util.ArrayList;

public class Zoo {
    
    @SuppressWarnings("rawtypes")
    private List<Enclosure> enclosureList = new ArrayList<>();
    private List<Worker> workerList = new ArrayList<>();

    public void addEnclosure(Enclosure e)
    {
        enclosureList.add(e);
    }

    public List<Worker> getWorkerList()
    {
        return workerList;
    }

    public List<Enclosure> getEnclosureList()
    {
        return enclosureList;
    }

    public void showAllAnimals()
    {
        for(Enclosure e : enclosureList)
        {
            for(Object o : e.getEnclosure())
            {
                System.out.println(o.toString());
            }
        }
    }

    public void showAllWorkers()
    {
        for(Worker w : workerList)
        {
            System.out.println(w.toString());
        }
    
    }

}