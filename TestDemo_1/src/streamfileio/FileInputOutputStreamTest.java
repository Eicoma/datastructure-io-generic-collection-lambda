package streamfileio;

import  java.io.*;

public class FileInputOutputStreamTest {
    public static void main(String[] args)throws IOException{
        try{
            //char[] byteArray = {'L','O','V','E','5','2','0'};
            byte[] byteArray ={12,54,6,88,6};
            //此处的OutputStream为字节输出流
            OutputStream os = new FileOutputStream("E:/Programming/Test/A File.txt");
            for (int x = 0;x < byteArray.length;x++){
                os.write(byteArray[x]);
            }
            os.close();
            //此处的InputSteam为字节输入流直接作为读取流的对象
            InputStream is = new FileInputStream("E:/Programming/Test/A File.txt");
            int size = is.available();

            for (int i = 0;i < size;i++){
                //读取类的对象调用read(),并且需要强转类型为char，因为read()读取的是一个字符
                System.out.println((char)is.read() + " ");
            }
            is.close();
        }catch(IOException e){
            System.out.println("Exception");
        }
    }
}
