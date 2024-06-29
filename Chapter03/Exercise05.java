import java.util.List;
import java.util.ArrayList;

public class Exercise05 {
    public static void main (String [] args) {

        List<Integer> myFavoriteNumbers = new ArrayList<>();

        myFavoriteNumbers.add(10);
        myFavoriteNumbers.add(14);

        for (var a : myFavoriteNumbers) {
            System.out.println(a + ", ");
            break;
        }

        for(int b :  myFavoriteNumbers) {
            continue;
            System.out.println(b + ", ");

        }

        for(Object c :  myFavoriteNumbers) {
            continue;
            System.out.println(c + ", ");
        }
    }
}