class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int ans[] = new int[2];

        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i = 0; i< n ;i++){
            int lft = target - nums[i];

            if(mp.containsKey(lft)) return new int[]{mp.get(lft), i};
            mp.put(nums[i] , i);
        }
        return new int[]{-1,-1};
    }
}