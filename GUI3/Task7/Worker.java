public class Worker {
        
    private String name;

    Worker(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    public void cleanAnimal(AAnimal animal)
    {

    }

    public void feedAnimal(AAnimal animal)
    {

    }

    
    @Override
    public String toString() {

        return ("Worker: "+this.name);
    }




}