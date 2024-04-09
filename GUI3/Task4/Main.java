import java.util.HashSet;

class Main
{
    public static void main(String[] args)
    {
        
        HashSet<Integer> hSet = new HashSet<>();
        
        hSet.add(31);
        hSet.add(28);
        hSet.add(31);
        hSet.add(30);
        hSet.add(31);
        hSet.add(30);
        hSet.add(31);
        hSet.add(31);
        hSet.add(30);
        hSet.add(31);
        hSet.add(30);
        hSet.add(31);

        for(int e : hSet)
            System.out.println(e);
       
    }
}
