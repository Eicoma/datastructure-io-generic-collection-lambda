package streamfileio;

import java.io.*;

public class BufferedReaderLine {
    public static void main(String[] args)throws IOException{
        //使用System.in创建BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter line of text.");
        System.out.println("Enter 'end' to quit.");
        do{
            str = br.readLine();
            System.out.println(str);
        }while(!str.equals("end"));
    }
}
