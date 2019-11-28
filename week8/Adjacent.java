package week8;

public class Adjacent {
    
    public Node connectedWith;
    public Adjacent next;
        
    public Adjacent(Node connectedWith)
    {
        this.connectedWith = connectedWith;
        this.next = null;
    }
}
