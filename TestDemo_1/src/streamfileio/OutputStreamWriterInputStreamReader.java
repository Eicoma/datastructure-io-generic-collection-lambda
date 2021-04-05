package streamfileio;

import java.io.*;

public class OutputStreamWriterInputStreamReader {
    public
    static void main(String[] args)throws IOException{
        //File类为io包中的非流类
        File f = new File("E:/Programming/Test/Second File.txt");
        //构建FileOutputStream对象，文件不存在会自动创建
        FileOutputStream fop = new FileOutputStream(f);
        //构建OutputStream对象，可以设置目标文件的编码(windows默认编码为gbk)
        OutputStreamWriter writer = new OutputStreamWriter(fop,"UTF-8");
        //写入到缓冲区
        writer.append("中文输入");
        //换行
        writer.append("\r\n");
        writer.append("English");
        //关闭写入流，同时会把缓冲区的内容写入文件
        writer.close();
        //关闭文件输出流，释放系统资源
        fop.close();

        FileInputStream fip = new FileInputStream(f);
        //构建InputStreamReader对象，设置读取目标文件的编码
        InputStreamReader reader = new InputStreamReader(fip,"UTF-8");

        StringBuffer stringBuffer = new StringBuffer();
        while(reader.ready()){
            stringBuffer.append((char)reader.read());
        }
        System.out.println(stringBuffer.toString());
        //关闭读取流
        reader.close();
        //关闭文件读取流，释放系统资源
        fip.close();
    }
}
