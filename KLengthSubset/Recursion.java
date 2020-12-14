package Problem4;

import java.util.ArrayList;
import java.util.List;

public class Recursion {

    private void recursion(int[] arr, int actualSum, int indx, List<Integer> lst, MyPair ans) {
        if (lst.size() == 2) {
            if (lst.get(0) + lst.get(1) == actualSum) {
                ans.First = lst.get(0);
                ans.Second = lst.get(1);
            }
            return;
        }
        if (indx == arr.length) {
            return;
        }
        lst.add(arr[indx]);
        recursion(arr, actualSum, indx + 1, lst, ans);
        lst.remove(lst.size() - 1);
        recursion(arr, actualSum, indx + 1, lst, ans);
    }

    public MyPair kSum(int[] arr, int k) {
        MyPair ans = new MyPair();
        List<Integer> lst = new ArrayList<>();
        recursion(arr, k, 0, lst, ans);
        if (ans.First == null) {
            return null;
        }
        return ans;
    }

}
