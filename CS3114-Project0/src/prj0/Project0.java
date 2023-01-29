package prj0;

import java.util.Scanner;

/**
 * Project runner containing the main method
 * 
 * @author Jasper Wilkerson
 * @author Jade Sherer
 *
 */
public class Project0 {

    /**
     * Main method that runs input and process it for output
     * 
     * @param args
     *            standard main method arguments, not needed for this project
     */
    public static void main(String[] args) {
        
        // Create a new scanner object
        Scanner sc = new Scanner(System.in);

        int numNodes = sc.nextInt();
        int numEdges = sc.nextInt();
        int numQueries = sc.nextInt();

        int[][] data = new int[numNodes][numNodes];

        // This loop reads the two numbers and +1 to every pair
        for (int i = 0; i < numEdges; i++) {
            int one = sc.nextInt();
            int two = sc.nextInt();
            
            //since the array is indexed at 0 but our data starts at 1, to find the data we search at n - 1
            data[one - 1][two - 1]++;
            data[two - 1][one - 1]++;
        }
        //this loop goes through all the queries and prints for each query
        for (int i = 0; i < numQueries; i++) {
            StringBuilder str = new StringBuilder();
            int q = sc.nextInt(); //q = current query
            //this loop iterates down the column and appends if the data is >0

            //boolean to check if any adjacencies are found
            boolean found  = false;
            for (int j = 0; j < numNodes; j++)
            {
                //again, all data is stored one back, so subtract and add to accomadate
                if (data[q - 1][j] > 0 )
                {
                    found = true;
                    int index = j + 1;
                    str.append(index + " ");
                }
            }
            if (!found)
            {
                str.append(-1);
            }
            System.out.println(str);
        }
        // Closes the scanner object when we're done with it
        sc.close();
    }
}
