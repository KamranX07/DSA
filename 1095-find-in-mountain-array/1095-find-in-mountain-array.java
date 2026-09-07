/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */ 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int value = findPeakElement(mountainArr);
        if(target == mountainArr.get(value)) {
            return value;
        }
        int ans1 = orderAgnosticBS(target, mountainArr, 0, value-1, true);
        int ans2 = orderAgnosticBS(target, mountainArr, value+1, mountainArr.length()-1, false);
        if(ans1 == -1) {
            return ans2;
        }
        else {
            return ans1;
        }

    }

    public int orderAgnosticBS(int target, MountainArray arr, int start, int end, boolean isAsc) {
        while(start <= end) {
            int mid = start + (end-start) / 2;
            if(arr.get(mid) == target) {
                return mid;
            }
            if(isAsc) {
                if(arr.get(mid) > target) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            else {
                if(arr.get(mid) < target) {
                    end = mid-1;
                }
                else {
                    start = mid+1;
                }
            }
            
        }
        return -1;
    }

    public int findPeakElement(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length()-1;
        while(start < end) {
            int mid = start + (end-start) / 2;
            if(mountainArr.get(mid) < mountainArr.get(mid+1)) {
                start = mid+1;
            }
            else {
                end = mid;
            }
        }
        return end;
    }
}