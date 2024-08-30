import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {


            var map = Map.of(1, 2, 3, 6,5,6);

            System.out.println( map);
            var list = List.copyOf(map.entrySet());

            List<Integer> one = List.of(8, 16, 2);
            var copy = List.copyOf(one);

            System.out.println(copy);
            var copyOfCopy = List.copyOf(copy);
            var thirdCopy = new ArrayList<>(copyOfCopy);

            //list.replaceAll(x ->  * 2);
            //one.replaceAll(x -> x * 2);
            thirdCopy.replaceAll(x -> x * 2);

            System.out.println(thirdCopy);

            var hashMap = new HashMap<Integer, Integer>();
            hashMap.put(1, 10);
            hashMap.put(2, 20);
            hashMap.put(3, null);
            hashMap.merge(1, 3, (a,b) -> a + b);
            hashMap.merge(3, 3, (a,b) -> a + b);
            System.out.println("Res=");
            System.out.println(map);


        
        
    }
    
}
