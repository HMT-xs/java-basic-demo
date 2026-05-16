package CharStream;

import java.io.FileWriter;
import java.io.IOException;

public class CharStreamDemo3 {
    public static void main(String[] args) throws IOException {
        //字符输出流
        FileWriter fw = new FileWriter("src/CharStream/b.txt",true);
        char[] chars = {'a','b','c','我'};
        fw.write(chars);
        fw.close();
    }
}
