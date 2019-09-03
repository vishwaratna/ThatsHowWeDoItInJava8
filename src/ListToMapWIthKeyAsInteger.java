import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
/* Input */
/*Vishwa, Prashant , Priya , Anup*/

/*           Output
        0  Vishwa
        1  Prashant
        2  Priya
        3  Anup
*/
public class ListToMapWIthKeyAsInteger {
    static int k=0;   //static int to keep a count of keys in increasing order
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Vishwa","Prashant","Priya","Anup");

        //converting List to Map<Integer,String> with key as integer and starting with 0....n

        Map<Integer,String> map = list.stream().collect(Collectors.toMap(s->k++,Function.identity()));
        map.forEach((l,m)-> System.out.println(l+"  "+m));
    }
}
