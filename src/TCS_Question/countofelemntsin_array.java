package TCS_Question;
import java.util.*;
public class countofelemntsin_array {



    public static void main(String[] args) {
        int arr[] = {1,2,2,3,1,1};

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int x : arr){
            if(map.containsKey(x)){
                map.put(x, map.get(x) + 1);
            } else {
                map.put(x, 1);
            }
        }

        System.out.println(map);
    }
}