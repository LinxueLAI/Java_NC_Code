package LeetCode_Tests;

public class Leetcode278_firstBadVersion {
    public static void main(String[] args) {

    }

    /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    /*
    二分，注意边界。

    不能写 int mid = (lo + hi) / 2; 要写 int mid = lo + (hi - lo) / 2;
    这个题目，返回 lo 或者 hi 都行，因为终止条件是 lo == hi.
    这是二分里比较难的题目了吧，找的是分割点，不是某个值。
    [********########] 就像这样的有序数组，找第一个 # 号。
    二分搜索的演化版本，查找某个值，返回其索引，如果找不到，返回其本来应该所在的位置（比如上面 # 号的位置）。遇到这种二分搜索，就拿这个 bad version 来套就行了。

    */
    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        int mid = 0;
        while(left<right){
            mid = left + (right - left)/2;
            if(isBadVersion(mid) == true){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return right;
    }

    private boolean isBadVersion(int mid) {

        return false;
    }
}
