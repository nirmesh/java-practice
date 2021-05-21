import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicate {

    public static void main(String[] args) {
        int[] dups = new int[] {1, 2, 3, 3, 2}; // Integer
        //printDuplicateWithSet(dups);
        printDuplicateWithMap(dups);
    }

    private static void printDuplicateWithSet(int[] arr){

        Set<Integer> integerSet = new HashSet<>();
        for(int num :arr){
          //  if(integerSet.add(num)==false){
                System.out.print(num+" ");

          //  }
        }

    }

    private static void printDuplicateWithMap(int [] arr){

        Map<Integer,String> hmap1 = new HashMap<>();
        hmap1.put(1,"nirmesh");
        hmap1.put(2,"lallitha 123");
        hmap1.put(3,"manju");
        hmap1.put(5,null);
        System.out.println(hmap1.get(2));

        //System.out.println(hmap1.get(5));

        for(Map.Entry m : hmap1.entrySet()) {
                System.out.println(m.getKey() + " "+m.getValue());

        }

        Map<Integer,Integer> hmap = new HashMap<>();
        for(int num :arr){
            if(hmap.containsKey(num)){
                hmap.put(num,hmap.get(num)+1);
            }
            else {
                hmap.put(num,1);
            }
        }

        for(Map.Entry m : hmap.entrySet()){
           if( (int)m.getValue()>1){
               System.out.print(m.getKey()+" ");

           }

        }
    }

}


