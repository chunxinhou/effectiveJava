package file;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileParser {
    public static void main(String[] args) throws FileNotFoundException {
        String root = System.getProperty("user.dir");
        File file = new File(root+ "/log.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        try {
            List<Integer> values = new ArrayList<Integer>();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null && !readLine.isEmpty()){
                    String[] strings = readLine.split(":");
                    String temp = strings[5];
                    String s = temp.split("ms")[0];
                    values.add(Integer.parseInt(s));
                }else{
                    break;
                }
            }
            Integer result = 0;
            for (Integer integer: values) {
                result = result + integer;
            }
            System.out.println(result/1000.0/60.0/60.0);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
