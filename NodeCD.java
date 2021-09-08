
package Lista;
 
public class NodeCD {
    
    private NodeCD Next=null;
    private NodeCD previous=null;
    private Space value=null; 
    private int puesto;
    
    public NodeCD getNext() {
        return Next;
    }

    public void setNext(NodeCD Next) {
        this.Next = Next;
    }

    public NodeCD getPrevious() {
        return previous;
    }

    public void setPrevious(NodeCD previous) {
        this.previous = previous;
    }

    public Space getValue() {
        return value;
    }

    public void setValue(Space value) {
        this.value = value;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }
 
    
    
}
