//to find all permutations
https://leetcode.com/problems/permutations/description/
class Solution {
    public void recPerum(int[] nums,List<List<Integer>> ans,List<Integer> ds,boolean[] freq ){
        //base case
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                ds.add(nums[i]);
                freq[i] = true;
                recPerum(nums,ans,ds,freq);
                ds.remove(ds.size()-1);
                freq[i]= false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> ds= new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
        recPerum(nums,ans,ds,freq);
        return ans;
        
    }
}
