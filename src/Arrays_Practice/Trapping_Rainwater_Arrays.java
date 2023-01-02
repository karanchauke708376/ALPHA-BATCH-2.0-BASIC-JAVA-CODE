package Arrays_Practice;

public class Trapping_Rainwater_Arrays {

    public static int print_TrappedWater(int Height[]) {


        int n = Height.length;

        // Left Side Boundary
        int leftMax[] = new int[n];
        leftMax[0] = Height[0];
        for (int i = 1; i < n; i++) {

            leftMax[i] = Math.max(Height[i], leftMax[i - 1]);
        }
        // Right Side Boundary
        int rightMax[] = new int[n];
        rightMax[n - 1] = Height[n - 1];
        for (int i = n - 2; i >= 0; i--) {

            rightMax[i] = Math.max(Height[i], rightMax[i + 1]);
        }

        int WaterLevel = 0;
        int TrappedWater = 0;

        for (int i = 0; i < Height.length-1; i++) {

            WaterLevel = Math.min(leftMax[i], rightMax[i]);

            TrappedWater += WaterLevel - Height[i];

        }

        return TrappedWater;
    }

    public static void main(String[] args) {


        int Height[] = {4, 2, 0, 6, 3, 2, 5};

        System.out.println("Trapped Water Is : "+print_TrappedWater(Height));

    }

}
