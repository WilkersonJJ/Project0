package prj0;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
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
        
        // Creates an adjacency list and populates it with empty sub-lists
        ArrayList<List<Integer>> data = new ArrayList<List<Integer>>(numNodes);
        for (int i = 0; i < numNodes; i++) {
            data.add(new ArrayList<Integer>());
        }

        // This loop reads the two numbers and adds each edge
        for (int i = 0; i < numEdges; i++) {
            int one = sc.nextInt();
            int two = sc.nextInt();
            
            data.get(one - 1).add(two);
            data.get(two - 1).add(one);
        }
        //this loop goes through all the queries and prints for each query
        for (int i = 0; i < numQueries; i++) {
            StringBuilder str = new StringBuilder();
            int q = sc.nextInt() - 1; //q = current query

            //boolean to check if any adjacencies are found
            boolean found  = false;
            for (int j = 1; j <= numNodes; j++)
            {
                //again, all data is stored one back, so subtract and add to accomadate
                if (data.get(q).contains(j))
                {
                    found = true;
                    str.append(j + " ");
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
