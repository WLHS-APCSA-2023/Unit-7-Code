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


    public String toString(){
        return values.toString();
    }


}
