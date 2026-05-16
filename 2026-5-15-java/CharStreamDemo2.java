package CharStream;

import java.io.FileReader;
import java.io.IOException;

public class CharStreamDemo2 {
    public static void main(String[] args) throws IOException {
        //字符流输入
        FileReader fr = new FileReader("src/CharStream/b.txt");
        char[] chars = new char[10];
        int len;
        while((len = fr.read(chars)) != -1){
            System.out.print(new String(chars,0,len));
        }
        fr.close();
    }
}
