class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> l = new ArrayList<>();
        
        long ans = 1;
        l.add((int)ans);
        for (int i = 1; i <= rowIndex; i++) {
            ans = ans * (rowIndex + 1 - i);
            ans = ans / i;
            l.add((int)ans);
        }
        return l;
    }
}