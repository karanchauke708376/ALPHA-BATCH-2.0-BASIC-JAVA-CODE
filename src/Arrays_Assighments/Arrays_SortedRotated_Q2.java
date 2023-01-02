package Arrays_Assighments;

public class Arrays_SortedRotated_Q2 {

    public static void print_SortedRotated(int nums[]) {


        int start = 0;
        int end = nums.length - 1;

        int temp = 0;

        while (start > end) {

            temp = nums[end];
            nums[end] = nums[start];
            nums[start] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        int nums[] = {5, 7, 8, 9, 2, 4, 4, 3, 1};

        print_SortedRotated(nums);

        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+ " ");
        }
    }

}
