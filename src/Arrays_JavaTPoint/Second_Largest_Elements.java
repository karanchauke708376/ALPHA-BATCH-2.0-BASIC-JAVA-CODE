package Arrays_JavaTPoint;

public class Second_Largest_Elements {

    // Smart Programming YT Channel

    public static void main(String[] args) {

        int Number[] = {78, 6, 21, 89, 64};

        int temp = 0;

        for (int i = 0; i < Number.length; i++) {

            for (int j = i + 1; j < Number.length; j++) {

                if (Number[i] < Number[j]) {

                    temp = Number[i];
                    Number[i] = Number[j];
                    Number[j] = temp;
                }
            }
            if( i== 1) {
                break;
            }
        }

        System.out.println("Second Largest Is : " + Number[1]);
    }
}
