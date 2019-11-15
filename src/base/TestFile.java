package base;

import string.StringBuff;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TestFile {
    public static void main(String[] args) throws IOException{
//        File f = new File("test.text");
//        FileOutputStream fop = new FileOutputStream(f);
//        OutputStreamWriter writer = new OutputStreamWriter(fop, StandardCharsets.UTF_8);
//
//        writer.append("中文输入");
//
//        writer.append("\r\n");
//
//        writer.append("English");
//
//        writer.close();
//
//        fop.close();
//
//        FileInputStream fip = new FileInputStream(f);
//
//        InputStreamReader reader = new InputStreamReader(fip, StandardCharsets.UTF_8);
//
//        StringBuffer sb = new StringBuffer();
//
//        while (reader.ready()){
//            sb.append((char) reader.read());
//        }
//        System.out.println(sb.toString());
//        reader.close();
//        // 关闭读取流
//
//        fip.close();

        //创建文件
        String dirname  = "test/test/test2.text";
        File d = new File(dirname);
    }
}
