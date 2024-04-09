import java.util.ArrayList;

import javax.sound.midi.Soundbank;

class Main
{
    public static void main(String[] args)
    {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Ala");
        arr.add("ma");
        arr.add("kota");
      
        System.out.println("ARRAY LENGTH = "+arr.size());

        for(String e : arr)
            System.out.println(e);

    }

}
