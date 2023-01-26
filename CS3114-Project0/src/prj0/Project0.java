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
        int count = 0;
        Node[] nodeContainer = new Node[numNodes];

        // This for loop creates all the nodes
        for (int i = 0; i < numNodes; i++) {
            Node nodey = new Node(count + 1, numEdges);
            nodeContainer[count] = nodey;
            count++;
        }
        // This loop reads the two numbers and adds appropriate buddies
        for (int i = 0; i < numEdges; i++) {
            int one = sc.nextInt();
            int two = sc.nextInt();
            Node node = search(nodeContainer, one);
            node.addNodeBuddy(two);
            Node nodeTwo = search(nodeContainer, two);
            nodeTwo.addNodeBuddy(one);
        }
        for (int i = 0; i < numQueries; i++) {

        }
        
        // Closes the scanner object when we're done with it
        sc.close();
    }


    private static Node search(Node[] nodeContainer, int nodeNumber) {
        for (int i = 0; i < nodeContainer.length; i++) {
            if (nodeNumber == nodeContainer[i].getName()) {
                return nodeContainer[i];
            }
        }
        return null;
    }
}
