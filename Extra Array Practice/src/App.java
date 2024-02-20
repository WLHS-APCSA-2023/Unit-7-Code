import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        //Make an array list of integers
        ArrayList<Integer> listONums = new ArrayList<Integer>();
        //Use a loop to add 10 random numbers from 1-100
        Random randInstance = new Random();
        for(int i = 0; i<10; i++){
            listONums.add(randInstance.nextInt(1,101));
        }
        System.out.println(listONums);
        System.out.println("The average is " + listAverage(listONums));
        System.out.println(listMedian(listONums));
        System.out.println(listONums);
    }

    //Write a static method called listAverage to find the average
        //of the list
    public static double listAverage(ArrayList<Integer> list){
        double sum = 0.0;
        for(int i=0; i<list.size(); i++){
            sum = sum + list.get(i);
        }

        return sum/list.size();

    }
        //Write a static method called listMedian that will find the
        //median of the list (hint: look for sort method in ArrayList class)

        // 0 1 2 3 4
        // 5 6 7 8 9
        // length is 5, so length/2 = 2

        public static double listMedian(ArrayList<Integer> list){
            ArrayList<Integer> tempList = new ArrayList<Integer>(list);
            double sum = 0.0;
            int size = tempList.size();
            tempList.sort(null);
            if(size%2 == 0){
                sum = tempList.get(size/2)+tempList.get(size/2-1);
                return sum/2.0;
            }
            else{
                return tempList.get(size/2);
            }
        }
}
