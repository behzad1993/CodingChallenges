package amazon2;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



class Result {

    /*
     * Complete the 'ordered_configuration' function below.
     *
     * The function is expected to return a STRING_ARRAY.
     * The function accepts STRING configuration as parameter.
     */

    public static List<String> ordered_configuration(String configuration) {
        // Write your code here
        System.out.println(configuration);
        String[] configs = new String[10000];
        String[] parts = configuration.split("\\|");

        for (int i = 0; i < parts.length; i++) {
            if (parts[i].length() != 14){
                return List.of("Invalid configuration");
            }
            int index = Integer.parseInt(parts[i].substring(0, 4));
            String currentConfig = configs[index] == null ? "" : configs[index];
            if (index == 0){
                continue;
            }
            if(!currentConfig.equals("")){
                return List.of("Invalid configuration");
            }
            configs[index] = parts[i].substring(4, 14);
        }

        int stoppedAt = -1;
        ArrayList<String> resultList = new ArrayList<>();
        for (int i = 1; i <= parts.length; i++) {
            String current = configs[i];
            if(current != null){
                resultList.add(current);
            }else{
                stoppedAt = i;
                break;
            }
        }

        if (stoppedAt == -1) {
            return resultList;
        }

        for (int i = stoppedAt; i < parts.length; i++) {
            String current = configs[i];
            if(current != null){
                return List.of("Invalid configuration");
            }
        }

        return resultList;
    }

}