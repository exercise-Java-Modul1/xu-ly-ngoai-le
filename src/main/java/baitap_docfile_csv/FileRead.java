package baitap_docfile_csv;

import java.io.*;

public class FileRead {
    public static void main(String[] args) {
        String fileName = "file.csv";
        try {
            FileWriter fileWriter = new FileWriter(new File(fileName));
            BufferedWriter buff = new BufferedWriter(fileWriter);
            buff.write("\"1.0.0.0\",\"1.0.0.255\",\"16777216\",\"16777471\",\"AU\",\"Australia\":" +
                    "\"1.0.1.0\",\"1.0.3.255\",\"16777472\",\"16778239\",\"CN\",\"China\":" +
                    "\"1.0.4.0\",\"1.0.7.255\",\"16778240\",\"16779263\",\"AU\",\"Australia\":" +
                    "\"1.0.8.0\",\"1.0.15.255\",\"16779264\",\"16781311\",\"CN\",\"China\":" +
                    "\"1.0.16.0\",\"1.0.31.255\",\"16781312\",\"16785407\",\"JP\",\"Japan\":" +
                    "\"1.0.32.0\",\"1.0.63.255\",\"16785408\",\"16793599\",\"CN\",\"China\":" +
                    "\"1.0.64.0\",\"1.0.127.255\",\"16793600\",\"16809983\",\"JP\",\"Japan\":" +
                    "\"1.0.128.0\",\"1.0.255.255\",\"16809984\",\"16842751\",\"TH\",\"Thailand\"");
            buff.close();
            fileWriter.close();
        } catch (IOException e) {
            e.getMessage();
        }

        try {
            FileReader fileReader = new FileReader(new File(fileName));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String taget = "";
            taget = bufferedReader.readLine();
            String[] arr = taget.split(":");
            for (String s : arr) {
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
