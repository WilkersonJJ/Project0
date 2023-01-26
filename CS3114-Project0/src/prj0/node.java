package prj0;

public class node {
    private int identifier;
    private int[] nodeBuddies;
    private int count;
    /**
     * this is the node constructor, which takes in two parameters
     * @param number the number of the node, basically the "name"
     * @param maxEdges the "M" value, this is required in order to create the array of node buddies
     */
    public node(int number, int maxEdges)
    {
        identifier = number;
        nodeBuddies = new int[maxEdges];
        count = 0;
    }
    /**
     * this method adds a nodeBuddy to the array list and increases the count
     * @param nodeBuddy the identifier, ie. the number of the node the current node is connected to
     */
    public void addNodeBuddy(int nodeBuddy)
    {
        nodeBuddies[count] = nodeBuddy;
        count++;
    }
    /**
     * returns the indentifier, ie. the "name" of this node
     * @return the int identifier of this node
     */
    public int returnName()
    {
        return identifier;
    }
    /**
     * this will return the array of all node this node is connected to
     * @return the list of nodeBuddies
     */
    public int[] returnBuddies()
    {
        if (count == 0)
        {
            return null;
        }
        return nodeBuddies;
    }
}
