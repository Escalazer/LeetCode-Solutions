class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int m = nums1.length;
        int n = nums2.length;
        int[] ans = new int[m];
        int[] nge = new int[n];

        for (int j = n-1; j >= 0; j--) {
            while (!st.empty() && nums2[j] >= st.peek()) st.pop();

            if (st.empty()) nge[j] = -1;
            else nge[j] = st.peek();

            map.put(nums2[j], nge[j]);
            
            st.push(nums2[j]);
        }
        for (int i = 0; i < m ; i++) {
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }
}