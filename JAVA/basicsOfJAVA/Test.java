package basicsOfJAVA;
import java.util.*;

public class Test{
    public static void main(String args[]){
        // System.out.println(args[0]);
        // System.out.println(args[1]);
        // System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));

        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        map.put("Vinay Ojha", 20);
        map.put("Vivek Ojha", 20);
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println("KEY:" + entry.getKey() + "VALUE: " + entry.getValue());
        }    
        Set<Integer> set = new HashSet<>();
    }
}


