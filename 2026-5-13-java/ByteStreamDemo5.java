package ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo5 {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("src/a.txt");
        FileOutputStream fos = new FileOutputStream("src/copy1.txt");

        //边读边写
        int b;
        while((b = fis.read()) != -1){
            fos.write(b);
        }

        //先打开的后关
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
