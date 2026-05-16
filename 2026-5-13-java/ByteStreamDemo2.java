package ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo2 {
    //换行，续写
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("src/a.txt",true);
        String str1 = "abcdefg";
        byte[] bt1 = str1.getBytes();
        fos.write(bt1);

        String str2 = "\r\n";//windows操作系统
        byte[] bt2 = str2.getBytes();
        fos.write(bt2);

        String str3 = "666";
        byte[] bt3 = str3.getBytes();
        fos.write(bt3);
    }
}
