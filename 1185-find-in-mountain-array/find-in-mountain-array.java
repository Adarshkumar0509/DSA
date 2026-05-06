class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        
        // Step 1: Find peak index
        int peak = findPeak(mountainArr, n);
        
        // Step 2: Search in left (ascending)
        int left = binarySearch(mountainArr, 0, peak, target, true);
        if (left != -1) return left;
        
        // Step 3: Search in right (descending)
        return binarySearch(mountainArr, peak + 1, n - 1, target, false);
    }
    
    private int findPeak(MountainArray arr, int n) {
        int low = 0, high = n - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            if (arr.get(mid) < arr.get(mid + 1)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        
        return low;
    }
    
    private int binarySearch(MountainArray arr, int low, int high, int target, boolean asc) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int val = arr.get(mid);
            
            if (val == target) return mid;
            
            if (asc) {
                if (val < target) low = mid + 1;
                else high = mid - 1;
            } else {
                if (val < target) high = mid - 1;
                else low = mid + 1;
            }
        }
        
        return -1;
    }
}