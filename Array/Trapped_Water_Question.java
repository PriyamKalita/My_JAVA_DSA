public class Trapped_Water_Question{
    public static int TrappedWater(int height[]){
        int n = height.length;
        // Calculate left max Boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }
        // Calculate Right max Boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for(int i = n- 2; i >= 0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }

        int trappeWater = 0;
        // Loop
        for(int i = 0; i < n; i++){
            // WaterLevel = min(leftMax boundary, rightMax boundery);
            int WaterLevel = Math.min(leftMax[i], rightMax[i]);
            // Trapped Water = WaterLevel - height[i];
            trappeWater += WaterLevel - height[i];
        }
        return trappeWater;

    }
    public static void main(String args[]){
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(TrappedWater(height));
        }
}