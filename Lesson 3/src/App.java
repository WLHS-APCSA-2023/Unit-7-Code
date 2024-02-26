import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
         // Make an ArrayList of Integers with the following
         // values: 12,-3,18,27,-24,-5,47,33, 14, 0
        int[] nums = {12,-3,18,27,-24,-5,47,33, 14, 0};
        ArrayList<Integer> flexibleList = new ArrayList<Integer>();

        for(int num:nums){
            flexibleList.add(num);
        }
         // Traverse the list and print all values
         for(int i=0; i<flexibleList.size();i++){
            System.out.println(flexibleList.get(i));
         }
         System.out.println("\n");
         // Traverse the list and print all evens
         for(int i=0; i<flexibleList.size();i++){
            int current = flexibleList.get(i);
            if(current % 2 == 0){
                System.out.println(current);
            }
         }
         // Remove all even numbers from the list (the list
         // is mutated)

         // Print this even-less list
    }
}
