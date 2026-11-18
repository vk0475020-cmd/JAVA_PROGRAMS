import java.util.ArrayList;
import java.util.List;

class RecentCounter {
    int i, j;
    List<Integer> list;

    public RecentCounter() {
        i = 0;
        j = -1;
        list = new ArrayList<>();
    }
    
    public int ping(int t) {
        list.add(t);
        j++;
        while (i < j && list.get(j) - 3000 > list.get(i)) {
            i++;
        }
        return j - i + 1;
    }
}