package CharStream;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //read()空参,返回十进制，要再转化为字符
        FileReader fr = new FileReader("src/CharStream/b.txt");
        int c;
        while((c = fr.read()) != -1){
            System.out.print((char)c);
        }
        fr.close();
    }
}
