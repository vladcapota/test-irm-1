import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class UsedToSortCases {
    public static void main (String [] args){
        
        LinkedList cases = new LinkedList();
        
        //Create a list that is (3434, 7345, "X", 545, 54245, 67535, "X", 7255, "X", 63423, "X");
        
        cases.add(3434);
        cases.add(7345);
        cases.add("X");
        cases.add(545);
        cases.add(54245);
        cases.add(67535);
        cases.add("X");
        cases.add(7255);
        cases.add("X");
        cases.add(63423);
        cases.add("X");
        
        // print the initial list of cases
        for (int i = 0; i < cases.size(); i++){
            System.out.println(cases.get(i));
            
            
        }
        
        //sort cases
        LinkedList sortedCases = sortCases(cases);
        
        
        //print the sorted list of cases
        for (int i = 0; i < sortedCases.size(); i++){
            System.out.println(sortedCases.get(i));
            
            
        }
        
        }
        
        public static LinkedList sortCases(LinkedList list){
            LinkedList sortedList = new LinkedList();
            for (int i = 0; i < list.size(); i++){
                if(list.get(i) instanceof String){
                    sortedList.addFirst(list.get(i));
                    System.out.println("A case that is not complete was found");
                }else{
                    sortedList.add(list.get(i));
                    System.out.println("This case is complete");
                }
            
        }
        
            for(int j = 0; j < sortedList.size(); j++){
                System.out.println(sortedList.get(j));
                System.out.println();
                
            }
        return list = sortedList;
        
    }
    
    
}