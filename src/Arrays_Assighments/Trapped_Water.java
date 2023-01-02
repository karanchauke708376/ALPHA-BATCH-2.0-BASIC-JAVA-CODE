package Arrays_Assighments;

public class Trapped_Water {

    public static int print_TrappedWater(int Height[]) {

        int n = Height.length;

        int leftMax[] = new int[n];
        leftMax[0] = Height[0];
        for(int i = 1; i < n; i++) {

            leftMax[i] = Math.max(Height[i], leftMax[i - 1]);

        }

        int rightMax[] = new int[n];
        rightMax[n - 1] = Height[n - 1];
        for(int i = n - 2; i >= 0; i--) {

            rightMax[i] = Math.max(Height[i], rightMax[i + 1]);

        }

        int WaterLevel = 0;
        int TrappedWater = 0;

        for(int i = 0; i < Height.length-1; i++) {

            WaterLevel = Math.min(leftMax[i] , rightMax[i]);

            TrappedWater += WaterLevel - Height[i];

        }

        return TrappedWater;

    }
    public static void main(String[] args) {

      //  int Height[] = {4, 2, 0, 6, 3, 2, 5};

        int Height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        print_TrappedWater(Height);

        System.out.println("Trapped Water Level Is : "+print_TrappedWater(Height));

    }
}
