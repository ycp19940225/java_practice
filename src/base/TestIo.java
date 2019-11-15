package base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestIo {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader myInput = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("输入字符，按q结束！");

        do{
            c = (char) myInput.read();
            System.out.println(c);
        }while ( (c != 'q'));
    }
}
