import java.util.ArrayList;

public class Sequence {

    private ArrayList<Integer> values;

    public Sequence(){
        values = new ArrayList<Integer>();
    }

    public void add(int n){
        values.add(n);
    }

    public Sequence append(Sequence other){
        
    }

    public String toString(){
        return values.toString();
    }


}
