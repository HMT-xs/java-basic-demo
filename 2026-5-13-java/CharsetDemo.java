package ByteStream;

import java.io.IOException;
import java.util.Arrays;

public class CharsetDemo {
    public static void main(String[] args) throws IOException {
        //编码和解码 idea默认UTF-8，eclipse默认GBK

        //1.编码
        String str1 = "abc中国";
        byte[] bt1 = str1.getBytes();
        System.out.println(Arrays.toString(bt1));

        byte[] bt2 = str1.getBytes("GBK");
        System.out.println(Arrays.toString(bt2));

        //2.解码
        String str2 = new String(bt1);
        System.out.println(str2);

        String str3 = new String(bt2,"GBK");
        System.out.println(str3);

    }
}
