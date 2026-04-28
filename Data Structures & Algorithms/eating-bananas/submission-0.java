class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;

        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int ans = r;

        while(l <= r){
            int mid = l + (r-l)/2;

            long timetotal = 0;
            for(int p :piles){
                timetotal += Math.ceil((double) p /mid);
            }
            if(timetotal <= h){
                ans =  mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
}
