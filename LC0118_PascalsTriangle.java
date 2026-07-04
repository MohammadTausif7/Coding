import java.util.*;

class LC0118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pastrig = new ArrayList<>();
        for (int i = 0; i < numRows; i++)
        {
            List<Integer> currow = new ArrayList<>();
            for (int j = 0; j <= i; j++)
            {
                if (j == 0 || j == i)
                {
                    currow.add(1);
                }
                else
                {
                    List<Integer> prevrow = pastrig.get(i - 1);
                    currow.add(prevrow.get(j - 1) + prevrow.get(j));
                }
            }
            pastrig.add(currow);
        }
        return pastrig;
    }
}