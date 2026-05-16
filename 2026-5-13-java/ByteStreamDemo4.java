package ByteStream;

import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamDemo4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("src/a.txt");
        //循环读取
        int b;
        while((b = fis.read()) != -1){
            System.out.print((char)b);
        }
        fis.close();
    }
}
