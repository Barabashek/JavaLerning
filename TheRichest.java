
/*
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class TheRichest {
    public static void main(String[] args) throws IOException {
        HashMap<String, Double> map = new HashMap<>();

        double max = Double.MIN_VALUE;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));

            String s;
            while ((s = reader.readLine()) != null) {
                String[] value = reader.readLine().split(" ");
                if (map.containsKey(value[0])) {
                    map.put(value[0], (map.get(value[0]) + Double.parseDouble(value[1])));
                } else map.put(value[0], Double.parseDouble(value[1]));
            }
            reader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        for (Double a : map.values())
            if (max < a)
                max = a;

        TreeMap<String, Double> treeMap = new TreeMap<>(map);
        for (Map.Entry<String, Double> val : treeMap.entrySet()){
            if (val.getValue().equals(max))
            System.out.println(val.getKey());
        }
    }
}
