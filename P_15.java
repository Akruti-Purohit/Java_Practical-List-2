/*Demonstrate usage of wrapper classes by creating a variable
“num” of type int, wrapping it with the integer class, and
printing out the wrapped value. Also, parse the String “20”
into an int and print out the parsed value. */

public class P_15 {
        public static void main(String[] args) {
        System.out.println("220130318033");
        System.out.println("Purohit Akruti K.");

        // Creating a variable num of type int
        int num = 10;

        // Wrapping the int variable num with the Integer class
        Integer wrappedNum = Integer.valueOf(num);

        // Printing out the wrapped value
        System.out.println("Wrapped value: " + wrappedNum);

        // Parsing the String "20" into an int
        String strNum = "20";
        int parsedNum = Integer.parseInt(strNum);

        // Printing out the parsed value
        System.out.println("Parsed value: " + parsedNum);
    }
}

/*
Output::
220130318033
Purohit Akruti K.
Wrapped value: 10
Parsed value: 20
 */
