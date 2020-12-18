
package ca.humber.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class AlgorithmsDemo {

    public static void main(String[] args) {
    //    List<Integer> numbers = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);     
   //     System.out.println(binarySearch(numbers, 7));
        
//        List<Integer> numbers = new ArrayList<>(Arrays.asList(11,5,7,1,3,2,8,4,5,8)); 
//        Collections.sort(numbers);
//        insertionSort(numbers);        
//        System.out.println(numbers);
       
        createList();
    }
    

    
    public static void createList() {
        String[] arr = new String[]{ "first", "second", "third"};
        List<String> l = Arrays.asList(arr);
        
        List<Employee> people = Arrays.asList(new Employee("Paul", "Brown", 2001, "CEO"), 
                                            new Employee("Vivien", "Green", 2002, "VP"),
                                            new Employee("Sandra", "Green", 2006, "Manager"));
                
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        
        List<Integer> n = Arrays.asList(1,2,3,4,5);
        List<Integer> num = new ArrayList<>(Arrays.asList(1,2,3,4,5,56,3,2,1,67,12,44,11,12,11));
        Set<Integer> numSet = new HashSet<>(num);
        System.out.println(numSet);

       
        List<Employee> p2 = new ArrayList(people);
        p2.add(new Employee("David", "White", 2006, "Manager"));
        p2.add(new Employee("David", "Black", 2006, "Developer"));        
        p2.add(new Employee("Amy", "Lee", 2005, "Developer"));   
        p2.add(new Employee("Amy", "Gray", 2008, "Receptionist"));           
        
 //       Collections.sort(p2, AGE);
        Collections.sort(p2);
        System.out.println(p2);    
            
        
        Set<String> colors = new HashSet<>( Arrays.asList("red","green","blue","yellow"));
    }

            
    public static void autoboxing() {
        Integer a = new Integer(1);
        
        Integer x = 2;
        
        int y = x + 1;
        
        List<Integer> l = Arrays.asList(1,6,7, new Integer(5), Integer.valueOf(90));
        
    }
    
    
    public static Comparator<Employee> YEAR_HIRED = new Comparator<Employee>() {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getYearHired().compareTo(o2.getYearHired());
        }
    };
    
    public static int binarySearch(List<Integer> list, int number) {
        int beginning = 0;
        int end = list.size() - 1;
        
        while (beginning <= end) {
            int mid = (end + beginning) / 2;
            if (list.get(mid) == number) {
                return mid;
            } else if (list.get(mid) > number) {
                end = mid - 1;
            } else {
                beginning = mid + 1;
            }    
        }
        
        return -1;
    }
    
    public static void insertionSort(List<Integer> list){
        for (int i=0; i<list.size(); i++) {
            for (int j=0; j<i; j++){
               if (list.get(i) < list.get(j)) {
                   Integer item = list.remove(i);                   
                   list.add(j, item);
               }
            }
        }
    }
    


}