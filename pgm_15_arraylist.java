import java.util.ArrayList;
import java.util.Collections;

public class pgm_15_arraylist {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<Integer>(); // or
        ArrayList<Integer> list1 = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();
        list1.add(0);
        list1.add(12);
        list1.add(22);
        list1.add(24);
        list1.add(25);
        // System.out.println(list1); // list1
        // System.out.println(list1.get(0)); // element at index 0

        // add element in between
        // list1.add(index,element);
        list1.add(3,-44);
        
        
        // change element at an index
        // list1.set(index, element);
        list1.set(0, 88);
        
        //remove element at an index
        // System.out.println(list1);
        // list1.remove(3);
        // System.out.println(list1);

        // System.out.println(list1.size()); //size of list

        //print elements one by one
        // for(int i=0;i<list1.size();i++)
        // {
        //     System.out.println(list1.get(i));
        // }


        //sorting
        Collections.sort(list1);
        System.out.println(list1);

    }
}
