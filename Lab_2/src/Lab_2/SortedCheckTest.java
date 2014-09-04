package Lab_2;
import java.util.ArrayList;


public class SortedCheckTest {
	public static boolean sortCheckAsc(ArrayList<Integer> a) {
        int  N = a.size();
        int prev = a.get(0);
        boolean isSorted = true;
        for(int i=1; i< N; i++){
            if(a.get(i) >= prev) {
                continue;
            }
            else {
                isSorted = false;
                return isSorted;
            }
        }
        return isSorted;
    }
}
