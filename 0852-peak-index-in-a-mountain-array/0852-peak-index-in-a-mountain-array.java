class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int l = 0;
        int h = 1;

        while (arr[l] < arr[h] && h != arr.length) {
            l++;
            h++;
        }
        return l;
    }
}