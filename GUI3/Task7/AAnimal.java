public abstract class AAnimal {
    
    private String name;
    private Group group;

    AAnimal(String name, Group group)
    {
        this.name = name;
        this.group = group;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return this.name;
    }
    
    public void setGroup(Group group)
    {
        this.group = group;
    }

    public Group getGroup()
    {
        return this.group;
    }

    @Override
    public String toString() {
        
        return ("Name: "+this.name+" Group: "+this.group);
    }



}
