import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        Random randGen = new Random();   
        for(int i = 0; i < 20; i++){
            myList.add(randGen.nextInt(100));
        }
        myList.set(7,0);
        myList.set(12,0);
        System.out.println(search(myList, 0));
        searchEnhanced(myList, 0);
        System.out.println(binarySearch(myList, 1550));
    }

    public static int search(ArrayList<Integer>list, int target){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == target){
                return i;
            }
        }
        return -1;
    }

    public static void searchEnhanced(ArrayList<Integer>list,int target){
        ArrayList<Integer> locations = new ArrayList<Integer>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == target){
                locations.add(i);
            }
        }
        if(locations.size() != 0){
            System.out.print("The value " + target + " is located in the following places: ");
            System.out.println(locations);
        }
        else{
            System.out.println("Item not in list.");
        }
    }

    public static boolean binarySearch(ArrayList<Integer> list, int value){
        ArrayList<Integer> sorted = list;
        Collections.sort(sorted);
        int left = 0;
        int right = sorted.size()-1;
        int midpoint;
        while(left<=right){
            midpoint = left + (right-left)/2;
            if(sorted.get(midpoint) == value){
                return true;
            }
            if(sorted.get(midpoint)<value){
                left = midpoint + 1;
            }
            else{
                right = midpoint - 1;
            }
        }
        return false;
    }
}
