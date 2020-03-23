import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class UniqueSort {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream inputStream = new FileInputStream(name);
        reader.close();

        //Map<Integer, Integer> findDouble = new HashMap<>();
        List<Integer> douplicate = new ArrayList<>();
        int data = inputStream.read();

        while (inputStream.available() > 0) {
            douplicate.add(data);


           /* if (findDouble.containsKey(data)){
                int newDate = findDouble.get(data);
                findDouble.put(data, ++newDate);
            } else findDouble.put(data, 1);
        }
        inputStream.close();

        int minValue = Collections.min(findDouble.values());
        for (Map.Entry<Integer, Integer> pair : findDouble.entrySet()){
            if (pair.getValue().equals(minValue)){
                byte a = (byte) pair.getKey().intValue();
                System.out.println(a + " ");
            }*/
        }
        inputStream.close();
        Collections.sort(douplicate);
        HashSet<Integer> set = new HashSet<>(douplicate);
        System.out.print(set);
    }
}
