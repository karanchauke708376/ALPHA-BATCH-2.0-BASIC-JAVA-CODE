package String;

public class String_Builder {

    // Time Complexity
     // sb.append --- >  O(26)
    // sum += sb ----> O(n^2)

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("");

        for(char ch ='A'; ch <= 'Z'; ch++) {

            sb.append(ch+" ");
        }
            System.out.print(sb + " ");
        }

}
