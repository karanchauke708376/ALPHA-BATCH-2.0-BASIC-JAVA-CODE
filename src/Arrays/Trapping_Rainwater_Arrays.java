package Arrays;


public class Trapping_Rainwater_Arrays {

    public static int printTrapped_Water(int Height[]) {

        // Time Complexity Is ----------- >  O(n)

        int n = Height.length;

        // Calculate Left Max Boundary  -- Auxiliary Array / Helper ----->
        int leftMax[] = new int[n];
        leftMax[0] = Height[0];
        for (int i = 1; i < n; i++) {

            leftMax[i] = Math.max(Height[i], leftMax[i - 1]);  // Check Left Max Boundary
        }

        // Calculate Right Max Boundary  -- Auxiliary Array / Helper <-----
        int rightMax[] = new int[n];
        rightMax[n - 1] = Height[n - 1];
        for (int i = n - 2; i >= 0; i--) {

            rightMax[i] = Math.max(Height[i], rightMax[i + 1]);   // Check Right Max Boundary
        }

        int TrappedWater = 0;
        int Waterlevel = 0;
        // Looop
        for (int i = 0; i < Height.length-1; i++) {

            // WaterLevel = Min(leftMax Boundary , rightMax Boundary) M
            Waterlevel = Math.min(leftMax[i], rightMax[i]);  // WaterLevel Find

            // Trapped Water = WaterLevel - Height[i]
            TrappedWater += Waterlevel - Height[i];     // Trapped Water Find
        }

        return TrappedWater;
    }


    public static void main(String[] args) {

        int Height[] = {4, 2, 0, 6, 3, 2, 5};

        System.out.println("Trapped Water Is : " + printTrapped_Water(Height));

    }

}
