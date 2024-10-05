package Exception;

import java.io.*;

public class DataReader {

    public static void main(String[] args) throws IOException {
        File file = new File("c:\\Users\\basan\\OneDrive\\Desktop\\jasypt-cmd");

        BufferedReader br = new BufferedReader(new FileReader(file));
        while (br.readLine() != null){
            System.out.println(br.readLine());
        }

    }
}
