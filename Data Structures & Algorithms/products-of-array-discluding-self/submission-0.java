class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int prefix = 1;
        int suffix = 1;

        int n = nums.length;

        int[] res = new int[n];

        if(n == 0){
            return res;
        }

        
        for(int i = 0; i < n; i++){
            res[i] = 1;
        }

        for(int i = 0; i < n; i++){

            res[i] *= prefix;
            prefix *= nums[i]; //1,1,2,8

        }

        for(int i = n-1; i >= 0; i--){
            res[i] *= suffix; //8*1,2*6,1*24,1*48   48,24,12,8
            suffix *= nums[i];//1*6,6*4,24*2,48*1
        }

        return res;
        
    }
}  
