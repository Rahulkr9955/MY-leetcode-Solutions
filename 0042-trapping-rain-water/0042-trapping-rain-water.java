class Solution {
    public int trap(int[] height) {
       int n = height.length; 
       //leftmax
       int leftMax[] = new int[n];
       leftMax[0]= height[0];
       for(int i = 1; i<n; i++){
       leftMax[i] = Math.max(height[i], leftMax[i-1]);
       }
       //rightmax
       int rightMax[] = new int[n];
       rightMax[n-1] = height[n-1];
       for(int i= n-2; i>=0; i--){
        rightMax[i] = Math.max(height[i], rightMax[i+1]);
       }
       //loop
       int trapped = 0;
       for(int i =0; i<n; i++){
        int water = Math.min(leftMax[i], rightMax[i]);
        trapped= trapped + water-height[i];
       }
       return trapped;
        
    }
}