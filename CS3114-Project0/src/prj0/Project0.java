package prj0;
import java.util.Scanner;
/**
 * 
 * @author Jasper Wilkerson & Jade Sherer
 *
 */
public class Project0 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int numNodes = sc.nextInt(); 
		int numEdges = sc.nextInt(); 
		int numQueries = sc.nextInt();
		int count = 0;
		Node[] nodeContainer = new Node[numNodes];

		//this for loop creates all the nodes
		for (int i = 0; i < numNodes; i++)
		{
			Node nodey = new Node(count + 1, numEdges);
			nodeContainer[count] = nodey;
			count++;
		}
		//this loop reads the two numbers and adds appropriate buddies
		for (int i = 0; i < numEdges; i++)
		{
			int one = sc.nextInt();
			int two = sc.nextInt();
			Node node = search(nodeContainer, one);
			node.addNodeBuddy(two);
			Node nodeTwo = search(nodeContainer, two)
			nodeTwo.addNodeBuddy(one);
		}
		for (int i = 0; i < numQueries; i++)
		{

		}
		sc.close();
	}
	private static Node search(Node[] nodeContainer, int nodeNumber)
	{
		for (int i = 0; i < nodeContainer.length; i++)
		{
			if (nodeNumber == nodeContainer[i].getName())
			{
				return nodeContainer[i];
			}
		}
		return null;
	}
}
