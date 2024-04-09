public class Container <T>{
    
    private T field;

    Container(T field)
    {
        this.field = field;
    }

    public void print()
    {
        System.out.println(this.field);
    }


}
