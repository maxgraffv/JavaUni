import java.util.HashSet;

class Main
{
    public static void main(String[] args)
    {
        //TASK 4
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


        //TASK 5
        HashMap<Integer, String> hMap = new HashMap<>();
       
        hMap.put(31, "Jan");
        hMap.put(28, "Feb");
        hMap.put(31, "Mar");
        hMap.put(30, "Apr");
        hMap.put(31, "May");
        hMap.put(30, "Jun");
        hMap.put(31, "Jul");
        hMap.put(31, "Aug");
        hMap.put(30, "Sep");
        hMap.put(31, "Oct");
        hMap.put(30, "Nov");
        hMap.put(31, "Dec");


        for(int i : hMap.keySet())
            System.out.println("Key: " + i + " Val:" + hMap.get(i));


        
       
    }
}
