package ByteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileOutputStream fos = new FileOutputStream("src/a.txt");
        //写出数据
        byte[] bt = {97,98,99,100,101};
        fos.write(97);
        fos.write(bt);
        fos.write(bt,0,3);
        //释放资源
        fos.close();
    }
}
