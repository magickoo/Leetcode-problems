class Solution {
    public int[] twoSum(int[] arr, int target) {
        int n=arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],i);
        } 
        for(int i=0;i<n;i++){
            int diff = target - arr[i];
            if(hm.containsKey(diff) && hm.get(diff) !=i){
                return new int[]{i,hm.get(diff)};
            }
        }
        return new int[]{-1,-1};
    }
}

//Time Complexity: O(nlogn)
space complexity: O(n)
