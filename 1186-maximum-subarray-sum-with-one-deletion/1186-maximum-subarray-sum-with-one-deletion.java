class Solution {
    public int maximumSum(int[] arr) {
        int ans = arr[0];
        int onedelete = -10000000;
        int nodelete = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int newonedelete = Math.max(onedelete + arr[i], nodelete);

            onedelete = newonedelete;

            nodelete = Math.max(arr[i], nodelete + arr[i]);

            ans = Math.max(ans, Math.max(nodelete, onedelete));
        }
        return ans;
    }
}