import java.util.ArrayList;

public class Sequence {

    private ArrayList<Integer> values;

    public Sequence(){
        values = new ArrayList<Integer>();
    }

    public void add(int n){
        values.add(n);
    }

    public ArrayList<Integer> getValues(){
        return values;
    }
    
    public Sequence append(Sequence other){
        Sequence combinedSequence = new Sequence();
        for(Integer value: values){
            combinedSequence.add(value);
        }
        for(Integer value: other.values){
            combinedSequence.add(value);
        }
        return combinedSequence;
    }

    public String toString(){
        return values.toString();
    }


}
