public class Lion extends AAnimal {
    
    Lion(String name, Group group)
    {
        super(name, group);
    }

    public void setName(String name)
    {
        super.setName(name);
    }

    public String getName()
    {
        return super.getName();
    }
    
    public void setGroup(Group group)
    {
        super.setGroup(group);
    }

    public Group getGroup()
    {
        return super.getGroup();
    }

    @Override
    public String toString() {
        
        return ("Name: "+super.getName()+" Group: "+super.getGroup());
    }
    
}
