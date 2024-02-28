import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        Random randGen = new Random();   
        for(int i = 0; i < 20; i++){
            myList.add(randGen.nextInt(100));
        }
        System.out.println(search(myList, 0));
    }

    public static int search(ArrayList<Integer>list, int target){
        return -1;
    }
}
