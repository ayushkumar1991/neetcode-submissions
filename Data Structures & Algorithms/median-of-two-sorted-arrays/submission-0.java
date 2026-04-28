class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;

        if( m > n)  return findMedianSortedArrays(nums2, nums1);

        int lft = 0, right = m , hlf = (m + n + 1) / 2;


        while(lft <= right){
            int mid = lft + (right - lft) /2;
            int b = hlf-mid;

            int maxA = (mid == 0) ? Integer.MIN_VALUE : nums1[mid-1];
            int minA = (mid == m) ? Integer.MAX_VALUE : nums1[mid];

            int maxB = (b == 0) ? Integer.MIN_VALUE : nums2[b-1];
            int minB = (b == n) ? Integer.MAX_VALUE : nums2[b];

            if(maxA <= minB && maxB <= minA){
                if((m+n) % 2 == 1){
                    return Math.max(maxA, maxB);
                }else{
                    int lftM = Math.max(maxA, maxB);
                    int rightM = Math.min(minA, minB);
                    return (lftM + rightM) / 2.0;
                }
            }else if(maxA > minB){
                right = mid-1;
            } else{
                lft = mid+1;
            }
        }
        return 0.0;
    }
}
