package String;

import java.sql.SQLOutput;

public class Shortest_Path_Destination {

    public static float print_ShortestPath(String path) {

        int x = 0 , y = 0;
        for(int i = 0; i < path.length(); i++)  {
            char direction = path.charAt(i);

            // South |
            if(direction == 'S') {
                y--;
            // North ^
            } else if (direction == 'N') {
                y++;

            // West <----
            } else if (direction == 'W') {
                x--;
            }
            // East ---->
            else if (direction == 'E'){
                x++;
            }
            else {
                System.out.println("Please Enter Correct Characters ------ > N E W S");
            }

        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2 + Y2);

    }

    public static void main(String[] args) {

           String path = "WNEENESENNN";
      //     String path = "NEEENESENNNNNNN";
        //   String path = "XYZ";


        System.out.println(print_ShortestPath(path));

    }
}
