import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class ExcecisesTests {

    public static void main (String [] args){

        HashSet<? extends Number> hs = new HashSet<Integer>(); // Invalid
        HashSet<? super ClassCastException> set = new HashSet<Exception>(); // Valid
        List<String> list = new ArrayList<>(); // Invalid
       // List<String> list = new ArrayList<>(); // Invalid
        //List<Object> values = new HashSet<Object>(); // Invalid
        List<? extends Object> objects = new ArrayList<Object>(); // Invalid
        Map<String, ? extends Number> hm = new HashMap<String, Integer>(); // Valid
    }
    
}
