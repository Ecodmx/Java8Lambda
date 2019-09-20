import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author machangxu
 * @data 2019-09-20 下午8:12
 **/
public class FunctionWithOptions {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("I", "love", "you", "too");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                if (o1 == null) {
                    return -1;
                }

                if (o2 == null) {
                    return 1;
                }
                return o1.length() - o2.length();
            }
        });

        Collections.sort(list,(o1, o2) ->{
            if (o1 == null) {
                return -1;
            }

            if (o2 == null) {
                return 1;
            }
            return o1.length() - o2.length();
        });


    }
}
