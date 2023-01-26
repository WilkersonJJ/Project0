package prj0;
import java.util.Scanner;
/**
 * 
 * @author Jasper Wilkerson & Jade Sherer
 *
 */
public class Project0 {

	private Node[] nodeContainer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 

		int numNodes = sc.nextInt(); 
		int numEdges = sc.nextInt(); 
		int numQueries = sc.nextInt();
		int count = 0;
		nodeContainer = new Node[numNodes];

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

			//reads in two numbers, if there already exists a node, add its buddy
		}
		for (int i = 0; i < numQueries; i++)
		{

		}
		sc.close();
	}
	private Node search(int nodeNumber)
	{
		for (int i = 0; i < 0; i++)
		{
			if (nodeNumber == nodeContainer[i].getName())
			{
				return Node[i];
			}
		}
	}
}
