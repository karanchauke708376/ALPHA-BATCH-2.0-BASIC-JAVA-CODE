package Arrays_Practice;

public class Linear_Search_II {

    public static int printLinearSearchII(String Name[] , String key) {


        for(int i = 0; i <= Name.length; i++) {

            if(Name[i] == key) {
                return i;
            }

        }

            return -1;

    }


    public static void main(String[] args) {

        String Name[] = {"Amar", "Anmol", "Saransh", "Drupad", "Pranav", "Jayesh", "Bharat", "Arnab"};
        String key = "Arnab";

        int result = printLinearSearchII(Name , key);

        if(result == -1) {
            System.out.println("Elements Is Not Found :  ");
        } else {
            System.out.println(key+" Elements Is Found : " + printLinearSearchII(Name, key));
        }

       //  System.out.println((printLinearSearchII(Name, key));

    }

}
