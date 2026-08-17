class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> l2 = new ArrayList<>();

        int m = numRows - 1;
        int n = numRows - 1;

        for (int i = 0; i <= m; i++) {
            List<Integer> l1 = new ArrayList<>();
            int ans = 1;
            l1.add(ans);
            for (int j = 1; j <= i; j++) {
                ans = ans * (i + 1 - j);
                ans = ans / j;
                l1.add(ans);
            }
            l2.add(l1);
        }
        return l2;
    }
}