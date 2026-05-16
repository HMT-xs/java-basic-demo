package ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo6 {
    //拷贝改写
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("src/a.txt");
        FileOutputStream fos = new FileOutputStream("src/copy2.txt");

        int len;
        byte[] bt = new byte[1024];
        while((len = fis.read(bt)) != -1){
            fos.write(bt,0,len);
        }
        fos.close();
        fis.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);

    }
}
