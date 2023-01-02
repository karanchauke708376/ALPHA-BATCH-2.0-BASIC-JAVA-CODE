package Arrays;

public class Linear_Search_II {

                // Not Solve Probles
    public static String linearsearch(String canteen, String key) {

        for (int i = 0; i <= canteen.length()-1; i++) {

            //if (canteen.charAt(i) == key)
            if(canteen.equals(key)) {
                System.out.println("Available Stock");
            } else {
                System.out.println("No Stock ");
            }
        }
        return "";
    }
    public static void main(String[] args) {

        String[] canteen = {"Dosa", "Chole Bhature", "Samosa", "Sandwich", "Fruity Juice", "Cake", "Tea", "Biscuit"};
        String  key = "Fruity";

        String Available = linearsearch("Fruity", key);

        System.out.println("Your Items is : "+Available);

    }

}
