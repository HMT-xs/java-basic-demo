package CharStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    //拷贝文件夹
    public static void main(String[] args) throws IOException {
        File src = new File("D:/src1");
        File dest = new File("D:/dest1");

        copydir(src,dest);
    }

    public static void copydir(File src, File dest) throws IOException {
        dest.mkdir();
        //进入数据源
        File[] files = src.listFiles();
        //遍历数组
        for (File file : files) {
            if(file.isFile()){
                //判断 是文件 直接拷贝（从文件开始，从文件结束）
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest,file.getName()));
                byte[] bt = new byte[1024];
                int len;
                //边读边写
                while((len = fis.read(bt)) != -1){
                    fos.write(bt,0,len);
                }
                fos.close();
                fis.close();
            }
            else {
                //判断 是文件夹 递归 （如果发现是一个子文件夹，就重来一遍把里面的文件都拿出来拷贝）
                copydir(src,new File(dest,file.getName()));
            }
        }
    }
}
