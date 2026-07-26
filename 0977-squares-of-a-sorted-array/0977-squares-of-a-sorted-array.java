class Solution {
    public int[] sortedSquares(int[] nums) {
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        
        for (int num : nums) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        if (neg.size() == 0) {
            for (int i = 0; i < pos.size(); i++) {
                pos.set(i, pos.get(i)*pos.get(i));
            }
            int[] posarr = new int[pos.size()];
            for (int i = 0; i < pos.size(); i++) {
                posarr[i] = pos.get(i);
            }
            return posarr;
        }

        if (pos.size() == 0) {
            for (int i = 0; i < neg.size(); i++) {
                neg.set(i, neg.get(i)*neg.get(i));
            }
            Collections.reverse(neg);
            int[] negarr = new int[neg.size()];
            for (int i = 0; i < neg.size(); i++) {
                negarr[i] = neg.get(i);
            }
            return negarr;
        }

        int i = 0, j = 0, id = 0;
        int m = pos.size();
        int n = neg.size();
        int[] res = new int[m + n];

        for (i = 0; i < pos.size(); i++) {
            pos.set(i, pos.get(i)*pos.get(i));
        }
        for (i = 0; i < neg.size(); i++) {
            neg.set(i, neg.get(i)*neg.get(i));
        }
        Collections.reverse(neg);

        i = 0;
        while (i < m && j < n) {
            if (pos.get(i) <= neg.get(j)) res[id++] = pos.get(i++);
            else res[id++] = neg.get(j++);
        }
        while (i < m) res[id++] = pos.get(i++);

        while (j < n) res[id++] = neg.get(j++);

        return res;
    }
}