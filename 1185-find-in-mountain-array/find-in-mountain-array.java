class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        
        int peak = peakIndex(arr);
        
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if (firstTry != -1) return firstTry;
        
        return orderAgnosticBS(arr, target, peak + 1, arr.length() - 1);
    }

    int peakIndex(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr.get(mid) > arr.get(mid + 1)) {
                end = mid; // you are in decreasing part
            } else {
                start = mid + 1; // increasing part
            }
        }
        return start;
    }

    int orderAgnosticBS(MountainArray arr, int target, int start, int end) {
        boolean isAsc = arr.get(start) < arr.get(end);

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int val = arr.get(mid);

            if (val == target) return mid;

            if (isAsc) {
                if (target > val) start = mid + 1;
                else end = mid - 1;
            } else {
                if (target < val) start = mid + 1;
                else end = mid - 1;
            }
        }
        return -1;
    }
}