class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l = 0, r = arr.length - 1;
        int missing = 0;

        while (l <= r) {
            int mid = (l + r) / 2;
            //'missing' finds the number of missing elements till that index
            missing =  arr[mid] - (mid + 1);
            if (missing < k)
                l = mid + 1;
            else
                r = mid - 1;
        }
        //ans → arr[r] + more (where more = k - missing)
        //arr[r] + k - (arr[r] - r - 1)
        //arr[r] + k - arr[r] + r + 1 = r + 1 + k
        return r + 1 + k;
    }   
}